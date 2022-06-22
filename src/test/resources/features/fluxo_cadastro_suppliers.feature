Feature: fluxo de cadastro de suppliers
	Eu quero realizar um fluxo de cadastro de suppliers no site https://phptravels.net/admin/
	
	@suppliers @maisqueum
	Scenario: Realizar fluxo de cadastro de suppliers
		Given que estou no site
		When preencho o campo email
		And preencha o campo senha
		And clico no botao login
		Then valido a pagina dashboard
		When clico no botao menu
		And clico no submenu accounts
		And clico na opcao suppliers
		Then valido a pagina suppliers
		When clico no botao addsuppliers
		Then valido a pagina addsuppliers
		When preencha o campo firstname
		And preencha o campo email
		And preencha o campo mobilenumber
		And preencha o campo address1
		And preencha o campo supplierfor
		And preencha o campo lastname
		And preencha o campo password
		And clico no botao seta
		And clico no opcao brasil
		And preencha o campo address2
		And preencha o campo name
		And clico no botao update
		Then valido nome supplier