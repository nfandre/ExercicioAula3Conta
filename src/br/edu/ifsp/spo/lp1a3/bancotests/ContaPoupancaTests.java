package br.edu.ifsp.spo.lp1a3.bancotests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.edu.ifsp.spo.lp1a3.banco.ContaPoupanca;

class ContaPoupancaTests {

	@Test
	void validar_criar_conta_poupanca() {
		String titular = "Andre";
		String numeroConta = "12345";
		
		ContaPoupanca cp = new ContaPoupanca(numeroConta,titular);
		
		assertNotNull(cp);
		assertEquals(titular, cp.getTitular());
		assertEquals(numeroConta, cp.getNumeroConta());
	}
	
	@Test
	void validar_aplicacao_de_rendimento() {
		String titular = "Andre";
		String numeroConta = "12345";
		
		ContaPoupanca cp = new ContaPoupanca(numeroConta,titular);
		double valor = 100;
		double taxa = 0.01;
		double resultadoRendimento = valor+(valor*0.01);
		cp.depositar(valor);
		cp.setRendimento(taxa);
		cp.aplicarRendimento();
		
		assertEquals(resultadoRendimento, cp.getSaldo());
	}
}
