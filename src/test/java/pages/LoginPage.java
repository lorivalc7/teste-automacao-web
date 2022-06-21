package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	private WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	private By inputEmail = By.xpath("//input[@name='email']");
	private By inputPassword = By.xpath("//input[@name='password']");
	private By buttonLogin = By.xpath("//span[contains(text(), 'Login')]");
	
	public void carregarPaginaInicial() {
		driver.get("https://phptravels.net/api/admin");
		//driver.manage().window().maximize();
		try {
			Thread.sleep(5*1000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void preenchoInputEmail(String texto) {
		driver.findElement(inputEmail).sendKeys(texto);
	}
	
	public void preenchoInputPassword(String texto) {
		driver.findElement(inputPassword).sendKeys(texto);
	}
	
	public DashboardPage clicoButtonLogin() {
		driver.findElement(buttonLogin).click();
		return new DashboardPage(driver);
	}
	
}
