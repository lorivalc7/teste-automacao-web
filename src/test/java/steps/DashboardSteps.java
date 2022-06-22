package steps;

import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AgentsPage;
import pages.DashboardPage;
import pages.SuppliersPage;

public class DashboardSteps {

	BaseSteps baseSteps = new BaseSteps();

	private DashboardPage dashboardPage = new DashboardPage(baseSteps.driver);
	private SuppliersPage suppliersPage;
	private AgentsPage agentsPage;

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
	    suppliersPage = dashboardPage.clicoASuppliers();
	}
	
	@When("clico na opcao agents")
	public void clico_na_opcao_agents() {
	    agentsPage = dashboardPage.clicoAAgents();
	}
}
