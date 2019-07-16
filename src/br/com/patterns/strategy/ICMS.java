package br.com.patterns.strategy;

public class ICMS implements Imposto{

	@Override
	public void realizaCalculo(Orcamento orcamento) {
		System.out.println("ICMS: "+orcamento.getValor()*1.05);
	}

}
