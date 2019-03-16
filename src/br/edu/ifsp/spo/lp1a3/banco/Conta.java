package br.edu.ifsp.spo.lp1a3.banco;

public class Conta {
	
	private  String NumeroConta;
	private String Titular;
	private double Saldo;
	
	
	
	public Conta(String numeroConta, String titular, double saldo) {
		super();
		NumeroConta = numeroConta;
		Titular = titular;
		Saldo = saldo;
	}

	@Override
	public String toString() {
		return
				" <numeroConta: "
				+ this.getNumeroConta()
				+ ", titular: " +this.getTitular()
				+ ", saldo: " +this.getSaldo()
				+ ">";
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean resultado = false;
		
		if(obj.getClass() == this.getClass()) {
			Conta outraConta = (Conta)obj;
			
			resultado = this.getNumeroConta().equals(outraConta.getNumeroConta());
			
			resultado = resultado && this.getTitular().equals(outraConta.getTitular());
		}
		return resultado;
	}

	public void transferirPara(Conta outraConta, double valor) { 
		this.setSaldo(this.sacar(valor));
		outraConta.depositar(valor);
		
	}
	
	public void depositar(double valor) {
		this.setSaldo(this.getSaldo() + valor);
	}
	
	public double sacar(double valor) {
		this.setSaldo(this.getSaldo() - valor);
		return this.getSaldo();
	}
	
	
	public String getNumeroConta() {
		return NumeroConta;
	}
	public void setNumeroConta(String numeroConta) {
		NumeroConta = numeroConta;
	}
	public String getTitular() {
		return Titular;
	}
	public void setTitular(String titular) {
		Titular = titular;
	}
	public double getSaldo() {
		return Saldo;
	}
	public void setSaldo(double saldo) {
		Saldo = saldo;
	}
	
	
}
