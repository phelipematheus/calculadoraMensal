package br.com.calculadoraMensal.model;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Principal {

	private String mensagem = "Teste de resposta da classe";
	
	
	public String getMensagem() {
		return mensagem;
	}
}
