package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AddSuppliersPage;

public class AddSuppliersSteps {

	BaseSteps baseSteps = new BaseSteps();

	private AddSuppliersPage addSuppliersPage = new AddSuppliersPage(baseSteps.driver);

	@Then("valido a pagina addsuppliers")
	public void valido_a_pagina_addsuppliers() {
		addSuppliersPage.validarDivAddSupplier("Add Supplier");
	}

	@When("preencha o campo firstname")
	public void preencha_o_campo_firstname() {
		addSuppliersPage.preenchoInputFirstname("Lorival01");
	}

	@When("preencha o campo email")
	public void preencha_o_campo_email() {
		addSuppliersPage.preenchoInputEmail("lorivalc01@gmail.com");
	}

	@When("preencha o campo mobilenumber")
	public void preencha_o_campo_mobilenumber() {
		addSuppliersPage.preenchoInputMobilenumber("1191101");
	}

	@When("preencha o campo address1")
	public void preencha_o_campo_address1() {
		addSuppliersPage.preenchoInputAddress1("Avenida Tiradentes01");
	}

	@When("preencha o campo supplierfor")
	public void preencha_o_campo_supplierfor() {
		addSuppliersPage.preenchoInputSupplierfor("Cars01");
	}

	@When("preencha o campo lastname")
	public void preencha_o_campo_lastname() {
		addSuppliersPage.preenchoInputLastname("Silva01");
	}

	@When("preencha o campo password")
	public void preencha_o_campo_password() {
		addSuppliersPage.preenchoInputPassword("0000000102");
	}

	@When("clico no botao seta")
	public void clico_no_botao_seta() {
		addSuppliersPage.clicoButtonSeta();
	}

	@When("clico no opcao brasil")
	public void clico_no_opcao_brasil() {
	    addSuppliersPage.clicoDivBrasil();
	}

	@When("preencha o campo address2")
	public void preencha_o_campo_address2() {
		addSuppliersPage.preenchoInputAddress2("Avenida São Paulo01");
	}

	@When("preencha o campo name")
	public void preencha_o_campo_name() {
		addSuppliersPage.preenchoInputName("Lorival01");
	}
	@When("clico no botao update")
	public void clico_no_botao_update() {
	    addSuppliersPage.clicoDivButtonupdate();
	}
	
}
