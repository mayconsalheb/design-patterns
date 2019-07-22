package br.com.patterns.strategy.exemplo2.investimento;

import java.util.Random;

public class Arrojado implements Investimento{

	
	@Override
	public double realizaInvestimento(Carteira carteira) {
		double saldo = carteira.getSaldo();
		double lucro = getLucroBruto(saldo);
		carteira.setSaldo(saldo+(lucro*PORCENTAGEM_IMPOSTO));
		
		return carteira.getSaldo();
	}
	
	/**
	 * 20% de chances de retornar 5% 
	 * 30% de chances de retornar 3%  
	 * 50% de chances de retornar 0.6%.
	 */
	private double getLucroBruto(double saldo) {
		double lucro = 0;
		double random = new Random().nextDouble();
		
		if(random <= 0.2) {
			lucro = saldo*0.05;
		}else if(random > 0.2 && random <= 0.5) {
			lucro = saldo*0.03;
		}else {
			lucro = saldo*0.006;
		}
		
		return lucro;
	}
}
