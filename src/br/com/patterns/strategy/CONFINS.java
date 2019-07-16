package br.com.patterns.strategy;

public class CONFINS implements Imposto{

	@Override
	public void realizaCalculo(Orcamento orcamento) {
		System.out.println("CONFINS: "+orcamento.getValor()*1.21);
	}

}
