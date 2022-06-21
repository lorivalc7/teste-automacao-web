package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AddSuppliersPage;
import pages.SuppliersPage;

public class SuppliersSteps {
	
	BaseSteps baseSteps = new BaseSteps();
	
	private SuppliersPage suppliersPage = new SuppliersPage(baseSteps.driver);
	private AddSuppliersPage addSuppliersPage;
	
	@Then("valido a pagina suppliers")
	public void valido_a_pagina_suppliers() {
	    suppliersPage.validarSmallSuppliers("Suppliers");
	}
	
	@When("clico no botao addsuppliers")
	public void clico_no_botao_addsuppliers() {
	    addSuppliersPage = suppliersPage.clicoButtonAdd();
	}
	
	@Then("valido nome supplier")
	public void valido_nome_supplier() {
	    suppliersPage.validarTdNome("Lorival01");
	}
	
}
