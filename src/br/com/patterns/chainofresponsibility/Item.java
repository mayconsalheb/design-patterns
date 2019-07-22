package br.com.patterns.chainofresponsibility;

public class Item {
	private double valor;
	private String descricao;
	
	public Item(double valor, String descricao) {
		super();
		this.valor = valor;
		this.descricao = descricao;
	}
	
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
