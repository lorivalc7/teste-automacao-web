package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {

	private WebDriver driver;

	public DashboardPage(WebDriver driver) {
		this.driver = driver;
	}

	private By h1Dashboard = By.xpath("//h1[contains(text(), 'Dashboard')]");
	private By buttonMenu = By.id("drawerToggle");
	private By aAccounts = By.xpath("(//div[@class='nav']//a[@aria-controls='collapseLayouts'])[1]");
	private By aSuppliers = By.xpath("//a[@class='nav-link suppliers mdc-ripple-upgraded']");
	private By aAgents = By.xpath("//*[@id='collapseLayouts']/nav/a[3]");
	
	public boolean validarH1Dashboard(String texto) {
		try {
			Thread.sleep(5 * 1000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return texto.contentEquals(driver.findElement(h1Dashboard).getText());
	}

	public void clicoButtonMenu() {
		driver.findElement(buttonMenu).click();
	}

	public void clicoAAccounts() {
		try {
			Thread.sleep(2 * 1000L);
			driver.findElement(aAccounts).click();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public SuppliersPage clicoASuppliers() {
		try {
			Thread.sleep(2 * 1000L);
			driver.findElement(aSuppliers).click();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return new SuppliersPage(driver);
	}
	
	public AgentsPage clicoAAgents() {
		try {
			Thread.sleep(2 * 1000L);
			driver.findElement(aAgents).click();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return new AgentsPage(driver);
	}
}
