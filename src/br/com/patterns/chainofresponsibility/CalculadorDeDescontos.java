package br.com.patterns.chainofresponsibility;

import java.util.ArrayList;
import java.util.List;

public class CalculadorDeDescontos {

	public void desconta(Orcamento orcamento) {
		Desconto porItens = new DescontoPorMaisDeCincoItens();
		Desconto porValor = new DescontoPorMaisDeQuinhentosReais();
		Desconto semDesconto = new SemDesconto();
		
		porItens.setProximo(porValor);
		porValor.setProximo(semDesconto);
		
		System.out.println(porItens.desconta(orcamento));
	}
	
	public static void main(String[] args) {
		Orcamento orcamentoQtdItens = new Orcamento();
		List<Item> itens = new ArrayList<>();
		itens.add(new Item(100, "item 1"));
		itens.add(new Item(100, "item 2"));
		itens.add(new Item(100, "item 3"));
		itens.add(new Item(100, "item 4"));
		itens.add(new Item(100, "item 5"));
		itens.add(new Item(300, "item 6"));
		orcamentoQtdItens.setItens(itens);
		
		Orcamento orcamentoValor = new Orcamento();
		itens = new ArrayList<>();
		itens.add(new Item(400, "item 1"));
		itens.add(new Item(600, "item 2"));
		orcamentoValor.setItens(itens);
		
		CalculadorDeDescontos calculador = new CalculadorDeDescontos();
		calculador.desconta(orcamentoQtdItens);
		calculador.desconta(orcamentoValor);
	}
}
