package steps;

import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AddAgentsPage;
import pages.AgentsPage;

public class AgentsSteps {

	BaseSteps baseSteps = new BaseSteps();

	private AgentsPage agentsPage = new AgentsPage(baseSteps.driver);
	private AddAgentsPage addAgentsPage;

	@Then("valido a pagina agents")
	public void valido_a_pagina_agents() {
		assertTrue(agentsPage.validarSmallAgents("Agents Management"));
	}

	@When("clico no botao addagents")
	public void clico_no_botao_addagents() {
		addAgentsPage = agentsPage.clicoButtonAddAgents();
	}
	
	@Then("valido nome agents")
	public void valido_nome_agents() {
	    assertTrue(agentsPage.validarTdNome("Lorival02"));
	}
}
