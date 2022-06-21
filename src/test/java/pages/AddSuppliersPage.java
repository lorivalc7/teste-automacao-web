package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddSuppliersPage {

	private WebDriver driver;

	public AddSuppliersPage(WebDriver driver) {
		this.driver = driver;
	}

	private By divAddSupplier = By.xpath("//*[@id='layoutDrawer_content']/main/div/form/div/div[1]/div[1]/div/div[1]");
	private By inputFirstname = By.xpath("//*[@id='layoutDrawer_content']/main/div/form/div/div[1]/div[1]/div/div[3]/div[1]/div/input");
	private By inputEmail = By.xpath("//*[@id='layoutDrawer_content']/main/div/form/div/div[1]/div[1]/div/div[3]/div[3]/div/input");
	private By inputMobilenumber = By.xpath("//*[@id='layoutDrawer_content']/main/div/form/div/div[1]/div[1]/div/div[3]/div[5]/div/input");
	private By inputAddress1 = By.xpath("//*[@id='layoutDrawer_content']/main/div/form/div/div[1]/div[1]/div/div[3]/div[8]/div/input");
	private By inputSupplierfor = By.xpath("//*[@id='layoutDrawer_content']/main/div/form/div/div[1]/div[1]/div/div[3]/div[12]/div/select");
	private By inputLastname = By.xpath("//*[@id='layoutDrawer_content']/main/div/form/div/div[1]/div[1]/div/div[3]/div[2]/div/input");
	private By inputPassword = By.xpath("//*[@id='layoutDrawer_content']/main/div/form/div/div[1]/div[1]/div/div[3]/div[4]/div/input");
	private By buttonSeta = By.xpath("//*[@id='s2id_autogen1']/a/span[2]/b");
	private By divBrasil = By.xpath("//*[@id='select2-drop']/ul/li[20]/div");
	private By inputAddress2 = By.xpath("//*[@id='layoutDrawer_content']/main/div/form/div/div[1]/div[1]/div/div[3]/div[9]/div/input");
	private By inputName = By.xpath("//*[@id='layoutDrawer_content']/main/div/form/div/div[1]/div[1]/div/div[3]/div[13]/div/input");
	private By divButtonupdate = By.xpath("//*[@id='layoutDrawer_content']/main/div/form/div/div[1]/div[1]/div/div[4]/button");
	
	
	public boolean validarDivAddSupplier(String texto) {
		try {
			Thread.sleep(5 * 1000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return texto.contentEquals(driver.findElement(divAddSupplier).getText());
	}

	public void preenchoInputFirstname(String texto) {
		driver.findElement(inputFirstname).sendKeys(texto);
	}

	public void preenchoInputEmail(String texto) {
		driver.findElement(inputEmail).sendKeys(texto);
	}

	public void preenchoInputMobilenumber(String texto) {
		driver.findElement(inputMobilenumber).sendKeys(texto);
	}

	public void preenchoInputAddress1(String texto) {
		driver.findElement(inputAddress1).sendKeys(texto);
	}

	public void preenchoInputSupplierfor(String texto) {
		driver.findElement(inputSupplierfor).sendKeys(texto);
	}

	public void preenchoInputLastname(String texto) {
		driver.findElement(inputLastname).sendKeys(texto);
	}
	
	public void preenchoInputPassword(String texto) {
		driver.findElement(inputPassword).sendKeys(texto);
	}

	public void clicoButtonSeta() {
		driver.findElement(buttonSeta).click();
	}
	
	public void clicoDivBrasil() {
		driver.findElement(divBrasil).click();
	}
	
	public void preenchoInputAddress2(String texto) {
		driver.findElement(inputAddress2).sendKeys(texto);
	}
	
	public void preenchoInputName(String texto) {
		driver.findElement(inputName).sendKeys(texto);
	}

	public void clicoDivButtonupdate() {
		driver.findElement(divButtonupdate).click();
	}

	
	

}
