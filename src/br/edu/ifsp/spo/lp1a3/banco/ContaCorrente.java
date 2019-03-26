package br.edu.ifsp.spo.lp1a3.banco;

public class ContaCorrente extends Conta{




	private double limiteChequeEspecial;
	private static double taxaJurosChequeEspecial = 0.013;
	
	public ContaCorrente(String numeroConta, String titular, double limiteChequeEspecial) {
		super(numeroConta, titular);
		this.setLimiteChequeEspecial(limiteChequeEspecial);
	}

	public void debitarJuros() {
		//TODO: implementar;
		double valorTaxa = getTaxaJurosChequeEspecial() * this.getSaldo();
		depositar(-valorTaxa);
	}
	
	@Override
	public double sacar(double valor) {
		if(this.getSaldo() >= valor) {
			this.setSaldo(this.getSaldo()-valor);
			this.setSaldo((this.getSaldo() -(valor * 0.01)));
		}else {
			if(this.getSaldo() + this.getLimiteChequeEspecial() >= valor) {
				 double saldo = this.getSaldo();
				 double taxa = saldo * 0.01 ;
				 this.setSaldo(0);
				 saldo = saldo - valor; //- taxa;
				 this.setLimiteChequeEspecial(saldo);
				 
			}else {
				System.out.println("Não é possível sacar, o limite foi ultrapassado");
			}
		}
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
