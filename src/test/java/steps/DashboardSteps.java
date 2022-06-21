package steps;

import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DashboardPage;

public class DashboardSteps {

	BaseSteps baseSteps = new BaseSteps();

	private DashboardPage dashboardPage = new DashboardPage(baseSteps.driver);

	@Then("valido a pagina dashboard")
	public void valido_a_pagina_dashboard() {
		assertTrue(dashboardPage.validarH1Dashboard("Dashboard"));
	}

	@When("clico no botao menu")
	public void clico_no_botao_menu() {
		dashboardPage.clicoButtonMenu();
	}

	@When("clico no submenu accounts")
	public void clico_no_submenu_accounts() {
		dashboardPage.clicoAAccounts();
	}
	
	@When("clico na opcao suppliers")
	public void clico_na_opcao_suppliers() {
	    dashboardPage.clicoASuppliers();
	}
	
}
