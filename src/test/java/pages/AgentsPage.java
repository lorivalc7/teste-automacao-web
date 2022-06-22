package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AgentsPage {

	private WebDriver driver;

	public AgentsPage(WebDriver driver) {
		this.driver = driver;
	}

	private By smallAgents = By.xpath("//*[@id='layoutDrawer_content']/main/div/header/div/div/div[1]/p/small");
	private By buttonAddAgents = By.xpath("//*[@id='layoutDrawer_content']/main/div/header/div/div/div[2]/form/button");
	private By tdNome = By.xpath("(//td[contains(text(), 'Lorival02')])[1]");
	
	public boolean validarSmallAgents(String texto) {
		try {
			Thread.sleep(5 * 1000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return texto.contentEquals(driver.findElement(smallAgents).getText());
	}

	public AddAgentsPage clicoButtonAddAgents() {
		try {
			Thread.sleep(2 * 1000L);
			driver.findElement(buttonAddAgents).click();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return new AddAgentsPage(driver);
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
