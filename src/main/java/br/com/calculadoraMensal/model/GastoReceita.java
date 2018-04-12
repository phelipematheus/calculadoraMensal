package br.com.calculadoraMensal.model;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class GastoReceita {
	
	private String nome;
	private String data;
	private Float valor;
	private Boolean gasto;
	
	public Boolean getGasto() {
		return gasto;
	}
	public void setGasto(Boolean gasto) {
		this.gasto = gasto;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setData(String data) {
		this.data = data;
	}
	public void setValor(Float valor) {
		this.valor = valor;
	}
	
	public String getNome() {
		return nome;
	}
	public String getData() {
		return data;
	}
	public Float getValor() {
		return valor;
	}
	
}
