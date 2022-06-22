package steps;

import static org.junit.Assert.assertTrue;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AddAgentsPage;

public class AddAgentsSteps {

	BaseSteps baseSteps = new BaseSteps();

	private AddAgentsPage addAgentsPage = new AddAgentsPage(baseSteps.driver);
		
	@Then("valido a pagina addagents")
	public void valido_a_pagina_addagents() {
		assertTrue(addAgentsPage.validarDivAddAgent("Add Agent"));
	}
	
	@When("preencho o campo first name")
	public void preencho_o_campo_first_name() {
		addAgentsPage.preenchoInputFirstname("Lorival02");
	}
	
	@When("preencho campo email")
	public void preencho_campo_email() {
		addAgentsPage.preenchoInputEmail("lorivalc02@gmail.com");
	}

	@When("preencho campo mobilenumber")
	public void preencho_campo_mobilenumber() {
	    addAgentsPage.preenchoinputMobilenumber("11199999");
	}
	
	@When("preencho campo address1")
	public void preencho_campo_address1() {
	    addAgentsPage.preenchoinputAddress1("Avenida Faria Lima");
	}
	
	@When("preencho campo lastname")
	public void preencho_campo_lastname() {
	    addAgentsPage.preenchoinputLastname("Silva");
	}
	
	@When("preencho campo password")
	public void preencho_campo_password() {
	   addAgentsPage.preenchoinputPassword("77777777");
	}
	
	@When("clicar botao seta")
	public void clicar_botao_seta() {
	    addAgentsPage.clicobuttonSeta();
	}
	
	@When("clicar opcao brasil")
	public void clicar_opcao_brasil() {
	    addAgentsPage.clicoDivBrasil();
	}
	
	@When("preencho campo address2")
	public void preencho_campo_address2() {
	    addAgentsPage.preenchoinputAddress2(" Avenida Paulista");
	}
	
	@When("clicar botao update")
	public void clicar_botao_update() {
	    addAgentsPage.clicarbuttonUpdate();
	}
	
}
