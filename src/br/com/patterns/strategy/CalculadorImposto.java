package br.com.patterns.strategy;

public class CalculadorImposto{

	public void calcular(Orcamento orcamento, Imposto imposto) {
		imposto.realizaCalculo(orcamento);
	}

}
