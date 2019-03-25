package br.edu.ifsp.spo.lp1a3.banco;

public class ContaPoupanca extends Conta{

	private static double TaxaRendimento;
	
	public ContaPoupanca(String numeroConta, String titular) {
		super(numeroConta, titular);
	}
	public void aplicarRendimento() {
		
		super.setSaldo(this.getSaldo() + (this.getSaldo()* TaxaRendimento));
	}

	public  void setRendimento(double taxaRendimento) {
		ContaPoupanca.TaxaRendimento = taxaRendimento;
	}
	
	
}
