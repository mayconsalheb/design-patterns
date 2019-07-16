package br.com.patterns.strategy;

public class ApplicationBoot {

	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento();
		orcamento.setValor(1000d);

		Imposto iss = new ISS();
		Imposto icms = new ICMS();
		Imposto ipi = new IPI();
		Imposto confins = new CONFINS();
		
		CalculadorImposto calculador = new CalculadorImposto();
		calculador.calcular(orcamento, iss);
		calculador.calcular(orcamento, icms);
		calculador.calcular(orcamento, ipi);
		calculador.calcular(orcamento, confins);
	}

}
