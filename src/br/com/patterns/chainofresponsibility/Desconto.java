package br.com.patterns.chainofresponsibility;

public interface Desconto {
	
	double desconta(Orcamento orcamento);
	void setProximo(Desconto desconto);
}
