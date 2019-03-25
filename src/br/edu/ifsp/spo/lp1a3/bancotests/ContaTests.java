package br.edu.ifsp.spo.lp1a3.bancotests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.edu.ifsp.spo.lp1a3.banco.Conta;

class ContaTests {
	
	
	@Test
	void conseguir_criar_uma_conta_com_titular_e_numero() {
		//1.configuração
		String titular = "Andre";
		String numeroConta = "12345";
		//2. execução
		Conta conta = new Conta(numeroConta,titular);
		
		//3. validação ; assersão
		assertNotNull(conta);
		assertEquals(titular, conta.getTitular());
		assertEquals(numeroConta, conta.getNumeroConta());
	}

	@Test
	void validar_transferir_para_outra_conta() {
		
		Conta conta = new Conta("11125","andre");
		Conta outraConta = new Conta("242432","jose");
		
		double valor = 100;
		
		conta.transferirPara(outraConta, valor);
		assertEquals(valor, outraConta.getSaldo());
		
	}
	
	@Test
	void validar_toString() {
		Conta conta = new Conta("11125","andre");
		
		String retorno =" <numeroConta: 11125, titular: andre, saldo: 0.0>";
		assertEquals(retorno, conta.toString());
	}
	
	@Test
	void validar_Esquals_Object() {
		Conta a =new Conta("11111","andre");
		Conta b = new Conta("11111","andre");
		
		boolean resultado1 = a.equals(b);
		boolean resultado2 = b.equals(a);
		
		assertTrue(resultado1);
		assertTrue(resultado2);
	}
	
}
