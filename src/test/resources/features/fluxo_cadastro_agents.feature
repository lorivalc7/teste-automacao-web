Feature: fluxo de cadastro de agents
	Eu quero realizar um fluxo de cadastro de agents no site https://phptravels.net/admin/
	
	@agents @maisqueum
	Scenario: Realizar fluxo de cadastro de agents
		Given que estou no site
		When preencho o campo email
		And preencha o campo senha
		And clico no botao login
		Then valido a pagina dashboard
		When clico no botao menu
		And clico no submenu accounts
		And clico na opcao agents
		Then valido a pagina agents
		When clico no botao addagents
		Then valido a pagina addagents
		When preencho o campo first name
		And preencho campo email
		And preencho campo mobilenumber
		And preencho campo address1
		And preencho campo lastname
		And preencho campo password
		And clicar botao seta
		And clicar opcao brasil
		And preencho campo address2
		And clicar botao update
		Then valido nome agents
			