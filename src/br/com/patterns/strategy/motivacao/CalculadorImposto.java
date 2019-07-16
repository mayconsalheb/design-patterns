package br.com.patterns.strategy.motivacao;

import br.com.patterns.strategy.Orcamento;

public class CalculadorImposto{

	public void calcular(Orcamento orcamento, String imposto) {
		if("ISS".equals(imposto)) {
			System.out.println("ISS: "+orcamento.getValor()*1.1);
		}
		
		if("ICMS".equals(imposto)) {
			System.out.println("ICMS: "+orcamento.getValor()*1.05);
		}
		
		if("IPI".equals(imposto)) {
			System.out.println("IPI: "+orcamento.getValor()*1.15);
		}
		
		if("CONFINS".equals(imposto)) {
			System.out.println("CONFINS: "+orcamento.getValor()*1.21);
		}
	}

}
