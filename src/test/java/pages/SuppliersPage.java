package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SuppliersPage {

	private WebDriver driver;

	public SuppliersPage(WebDriver driver) {
		this.driver = driver;
	}

	private By smallSuppliers = By.xpath("//small[contains(text(), 'Suppliers Management')]");
	private By buttonAdd = By.xpath("//*[@id='layoutDrawer_content']/main/div/header/div/div/div[2]/form/button");
	private By tdNome = By.xpath("(//td[contains(text(), 'Lorival')])[1]");
	
	public boolean validarSmallSuppliers(String texto) {
		try {
			Thread.sleep(5 * 1000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return texto.contentEquals(driver.findElement(smallSuppliers).getText());
	}
	
	public AddSuppliersPage clicoButtonAdd() {
		try {
			Thread.sleep(2 * 1000L);
			driver.findElement(buttonAdd).click();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return new AddSuppliersPage(driver);
	}
	
	
	public boolean validarTdNome(String texto) {
		try {
			Thread.sleep(5 * 1000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return texto.contentEquals(driver.findElement(tdNome).getText());
	}
	
}
