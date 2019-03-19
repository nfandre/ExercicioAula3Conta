package br.edu.ifsp.spo.lp1a3.banco;

public class ContaPoupanca extends Conta{

	private static double rendimento;
	
	public ContaPoupanca(String numeroConta, String titular, double saldo) {
		super(numeroConta, titular);
	}
	public void aplicarRendimento() {
		
		this.setRendimento(this.getRendimento()*0.001);
	}
	
	public  double getRendimento() {
		return rendimento;
	}

	public  void setRendimento(double rendimento) {
		ContaPoupanca.rendimento = rendimento;
	}
	
	
}
