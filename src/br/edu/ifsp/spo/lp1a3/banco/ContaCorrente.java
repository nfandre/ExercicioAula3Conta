package br.edu.ifsp.spo.lp1a3.banco;

public class ContaCorrente extends Conta{




	private double limiteChequeEspecial;
	private static double taxaJurosChequeEspecial;
	
	public ContaCorrente(String numeroConta, String titular, double saldo) {
		super(numeroConta, titular, saldo);
		
	}

	public void debitarJuros() {
		//TODO: implementar;
	}
	
	@Override
	public double sacar(double valor) {
		this.setSaldo(this.getSaldo()-valor);
		this.sacar((this.getSaldo() * -0.01));
		return this.getSaldo();
	}

	
	public double getLimiteChequeEspecial() {
		return limiteChequeEspecial;
	}
	public void setLimiteChequeEspecial(double limiteChequeEspecial) {
		this.limiteChequeEspecial = limiteChequeEspecial;
	}
	public static double getTaxaJurosChequeEspecial() {
		return taxaJurosChequeEspecial;
	}
	public static void setTaxaJurosChequeEspecial(double taxaJurosChequeEspecial) {
		ContaCorrente.taxaJurosChequeEspecial = taxaJurosChequeEspecial;
	}
	
	
	
}
