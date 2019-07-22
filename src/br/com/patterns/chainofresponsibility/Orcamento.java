package br.com.patterns.chainofresponsibility;

import java.util.List;

public class Orcamento {
	private List<Item> itens;

	public double getValor() {
		return itens.stream().mapToDouble(x->x.getValor()).sum();
	}
	public List<Item> getItens() {
		return itens;
	}

	public void setItens(List<Item> itens) {
		this.itens = itens;
	} 
}
