package pauloEduardoBorgesDoVale.banco;

import static org.junit.Assert.*;

import org.junit.Test;

public class TesteBanco {

	@Test
	public void testarInclusaoDeConta() {
		Banco b = new Banco();
		Conta c1 = new Conta();
		c1.setNum(1);
		c1.credito(99);
		
		b.incluir(c1);
		assertEquals(99, b.saldo(1), 0.001);
	}
	
	@Test
	public void testarInclusaoDeVariasContas() {
		Banco b = new Banco();
		Conta c1 = new Conta();
		c1.setNum(1);
		c1.credito(10);
		b.incluir(c1);

		Conta c2 = new Conta();
		c2.setNum(2);
		c2.credito(20);
		b.incluir(c2);
		
		Conta c3 = new Conta();
		c3.setNum(3);
		c3.credito(30);
		b.incluir(c3);
	
		Conta c4 = new Conta();
		c4.setNum(4);
		c4.credito(40);
		b.incluir(c4);
		
		assertEquals(10, b.saldo(1), 0.001);
		assertEquals(20, b.saldo(2), 0.001);
		assertEquals(30, b.saldo(3), 0.001);
		assertEquals(40, b.saldo(4), 0.001);
	}
	
	@Test
	public void testarSaldoDeContaInexistente() {
		Banco b = new Banco();
		Conta c1 = new Conta();
		c1.setNum(1);
		c1.credito(99);
		
		b.incluir(c1);
		assertEquals(99, b.saldo(1), 0.001);
		assertEquals(-999999, b.saldo(10), 0.001);
	}
	
	@Test
	public void testarExtrato() {
		Banco b = new Banco();
		Conta c1 = new Conta();
		c1.setNum(1);
		
		b.incluir(c1);
		b.deposito(1, 99);
		b.saque(1, 9);
		assertEquals(90, b.saldo(1), 0.001);
		System.out.println(b.extrato(1));
		assertEquals(" Crédito: 99.0. Saldo: 99.0.\n" + 
				" Débito: 9.0. Saldo: 90.0.\n", b.extrato(1));
	}
	
	@Test
	public void testarSaqueDepositoExtratoContaInexistente() {
		Banco b = new Banco();
		Conta c1 = new Conta();
		c1.setNum(1);
		
		b.incluir(c1);
		b.deposito(1, 99);
		b.saque(1, 9);
		assertEquals(90, b.saldo(1), 0.001);

		b.deposito(2, 99);
		b.saque(2, 9);
		
		assertEquals("", b.extrato(2));
		assertEquals(-999999, b.saldo(2), 0.001);
		assertEquals(90, b.saldo(1), 0.001);
	}
	
	@Test
	public void testarDepositoSaqueVariasContas() {
		Banco b = new Banco();
		Conta c1 = new Conta();
		c1.setNum(1);
		b.incluir(c1);

		Conta c2 = new Conta();
		c2.setNum(2);
		b.incluir(c2);
		
		Conta c3 = new Conta();
		c3.setNum(3);
		b.incluir(c3);
	
		Conta c4 = new Conta();
		c4.setNum(4);
		b.incluir(c4);

		b.deposito(1, 11);
		b.deposito(2, 22);
		b.deposito(3, 33);
		b.deposito(4, 44);
		
		assertEquals(11, b.saldo(1), 0.001);
		assertEquals(22, b.saldo(2), 0.001);
		assertEquals(33, b.saldo(3), 0.001);
		assertEquals(44, b.saldo(4), 0.001);
		
		b.saque(1, 1);
		b.saque(2, 2);
		b.saque(3, 3);
		b.saque(4, 4);
		
		assertEquals(10, b.saldo(1), 0.001);
		assertEquals(20, b.saldo(2), 0.001);
		assertEquals(30, b.saldo(3), 0.001);
		assertEquals(40, b.saldo(4), 0.001);
	}
}
