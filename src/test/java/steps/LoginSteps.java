package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.DashboardPage;
import pages.LoginPage;

public class LoginSteps {

	BaseSteps baseSteps = new BaseSteps();
	
	private LoginPage loginPage = new LoginPage(baseSteps.driver);
	
	private DashboardPage dashboardPage;
	
	@Given("que estou no site")
	public void que_estou_no_site() {
		loginPage.carregarPaginaInicial();
	}
	
	@When("preencho o campo email")
	public void preencho_o_campo_email() {
	    loginPage.preenchoInputEmail("admin@phptravels.com");
	}
	
	@When("preencha o campo senha")
	public void preencha_o_campo_senha() {
	    loginPage.preenchoInputPassword("demoadmin");
	}
	
	@When("clico no botao login")
	public void clico_no_botao_login() {
		dashboardPage = loginPage.clicoButtonLogin();
	}
	
}
