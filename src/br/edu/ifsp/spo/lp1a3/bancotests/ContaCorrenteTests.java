package br.edu.ifsp.spo.lp1a3.bancotests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.edu.ifsp.spo.lp1a3.banco.ContaCorrente;

class ContaCorrenteTests {
	
	@Test
	void configurar_conta_corrente(){
		
		String titular = "Andre";
		String numeroConta = "12345";
		double limiteCheque = 1000;
		ContaCorrente cc = new ContaCorrente(numeroConta,titular,limiteCheque);
		assertNotNull(cc);
		assertEquals(titular, cc.getTitular());
		assertEquals(numeroConta, cc.getNumeroConta());
		
	}
	@Test
	void validar_depositar(){
		String titular = "Andre";
		String numeroConta = "12void345";
		double limiteCheque = 1000;
		double valor=100;
		
		ContaCorrente cc = new ContaCorrente(numeroConta,titular,limiteCheque);
		cc.depositar(valor);
		
		assertEquals(valor, cc.getSaldo());
	}
	@Test
	void validar_sacar() {
		String titular = "Andre";
		String numeroConta = "12345";
		double limiteCheque = 1000;
		ContaCorrente cc = new ContaCorrente(numeroConta,titular,limiteCheque);
		
		double valor = 100, imposto =0.01;
		cc.depositar(valor);
	    cc.sacar(valor);
		valor=0 - (valor*imposto);

		
		assertEquals(valor,cc.getSaldo());
	}
	@Test
	void validar_sacar_usando_limite() {
		String titular = "Andre";
		String numeroConta = "12345";
		double limiteCheque = 1000;
		ContaCorrente cc = new ContaCorrente(numeroConta,titular,limiteCheque);
		
		double valorDeposita = 1000;
		double imposto =0.01;
		double valorSacar = 1200;
		cc.depositar(valorDeposita);
	    cc.sacar(valorSacar);
		assertEquals(0, cc.getSaldo());
		
		limiteCheque =+ valorDeposita - valorSacar ;//-(cc.getSaldo() * imposto);
		assertEquals(limiteCheque, cc.getLimiteChequeEspecial());
	}
}
