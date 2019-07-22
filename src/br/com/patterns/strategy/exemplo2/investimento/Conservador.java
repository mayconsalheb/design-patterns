package br.com.patterns.strategy.exemplo2.investimento;

public class Conservador implements Investimento{

	@Override
	public double realizaInvestimento(Carteira carteira) {
		double saldo = carteira.getSaldo();
		double lucro = saldo*0.008*PORCENTAGEM_IMPOSTO;
		carteira.setSaldo(saldo+lucro);
		return carteira.getSaldo();
	}
}
