package br.edu.ifsp.spo.lp1a3.bancoException;

public class ContaCorrenteLimiteMenorZero extends RuntimeException {
	public ContaCorrenteLimiteMenorZero() {
		super();
		mensagem();
	}
	void mensagem(){
		System.out.println("Limite n�o pode ser menor que zero");
	}
}
