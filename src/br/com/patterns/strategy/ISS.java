package br.com.patterns.strategy;

public class ISS implements Imposto{

	@Override
	public void realizaCalculo(Orcamento orcamento) {
		System.out.println("ISS: "+orcamento.getValor()*1.1);
	}

}
