package br.com.patterns.strategy.motivacao;

import br.com.patterns.strategy.Orcamento;

public class ApplicationBoot {

	public static void main(String[] args) {
		CalculadorImposto calcularImposto = new CalculadorImposto();
		
		Orcamento orcamento = new Orcamento();
		orcamento.setValor(1000d);
		
		calcularImposto.calcular(orcamento, "ISS");
		calcularImposto.calcular(orcamento, "ICMS");
		calcularImposto.calcular(orcamento, "IPI");
		calcularImposto.calcular(orcamento, "CONFINS");
	}

}
