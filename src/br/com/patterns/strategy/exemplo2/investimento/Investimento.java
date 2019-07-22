package br.com.patterns.strategy.exemplo2.investimento;

public interface Investimento {
	static final double PORCENTAGEM_IMPOSTO = 0.75;
	double realizaInvestimento(Carteira carteira);
}
