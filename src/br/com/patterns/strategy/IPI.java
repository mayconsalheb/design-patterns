package br.com.patterns.strategy;

public class IPI implements Imposto{

	@Override
	public void realizaCalculo(Orcamento orcamento) {
		System.out.println("IPI: "+orcamento.getValor()*1.15);
	}

}
