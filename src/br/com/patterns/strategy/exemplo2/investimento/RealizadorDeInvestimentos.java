package br.com.patterns.strategy.exemplo2.investimento;

public class RealizadorDeInvestimentos {

	public void investir(Carteira carteira, Investimento investimento) {
		System.out.println("Saldo: "+carteira.getSaldo());
		System.out.println("Saldo após investimento: "+investimento.realizaInvestimento(carteira));
	}
	
	public static void main(String[] args) {
		RealizadorDeInvestimentos investimentos = new RealizadorDeInvestimentos();
		
		for(int ind=0; ind<20; ind++) {
			System.out.println("=================================================");
			Carteira carteira1 = new Carteira();
			carteira1.setSaldo(100);
			investimentos.investir(carteira1, new Conservador());
			
			Carteira carteira2 = new Carteira();
			carteira2.setSaldo(100);
			investimentos.investir(carteira2, new Moderado());
			
			Carteira carteira3 = new Carteira();
			carteira3.setSaldo(100);
			investimentos.investir(carteira3, new Arrojado());
		}
	}
}
