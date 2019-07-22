package br.com.patterns.strategy.exemplo2.investimento;

import java.util.Random;

public class Moderado implements Investimento{

	@Override
	public double realizaInvestimento(Carteira carteira) {
		double saldo = carteira.getSaldo();
		double lucro = getLucroBruto(saldo);
		carteira.setSaldo(saldo+(lucro*PORCENTAGEM_IMPOSTO));
		
		return carteira.getSaldo();
	}
	
	private double getLucroBruto(double saldo) {
		double lucro = 0;
		Random random = new Random();
		
		switch (random.nextInt(2)) {
		case 0:
			lucro = saldo*0.007;
			break;
		case 1:
			lucro = saldo*0.025;
			break;
		}
		
		return lucro;
	}
}
