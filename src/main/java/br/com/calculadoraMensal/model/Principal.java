package br.com.calculadoraMensal.model;


import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Principal {

	private String mensagem = "Teste de resposta da classe";
	private String nomeUsuario;
	private Float entradaDinheiro;
	private Float saidaDinheiro;
	private Date dataEntrada;
    private Date dataSaida;
    private List<GastoReceita> entradas;
    
    public Principal() {
    	GastoReceita entrada = new GastoReceita();
    	GregorianCalendar gc = new GregorianCalendar();
    	entrada.setNome("tramóia");
    	entrada.setData(gc.getTime());
    	entrada.setGasto(Boolean.TRUE);
    	entrada.setValor(new Float(1000.00));
    	entradas.add(entrada);
    }
    
	public void apertarAdicionar() {
	    System.out.println("Você apertou um botão");
	}
    
    
    public String getNomeUsuario() {
        return nomeUsuario;
    }


    
    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }


    
    public Float getEntradaDinheiro() {
        return entradaDinheiro;
    }


    
    public void setEntradaDinheiro(Float entradaDinheiro) {
        this.entradaDinheiro = entradaDinheiro;
    }


    
    public Float getSaidaDinheiro() {
        return saidaDinheiro;
    }


    
    public void setSaidaDinheiro(Float saidaDinheiro) {
        this.saidaDinheiro = saidaDinheiro;
    }


    
    public Date getDataEntrada() {
        return dataEntrada;
    }


    
    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }


    
    public Date getDataSaida() {
        return dataSaida;
    }


    
    public void setDataSaida(Date dataSaida) {
        this.dataSaida = dataSaida;
    }


	public String getMensagem() {
		return mensagem;
	}
}
