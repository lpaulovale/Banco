package pauloEduardoBorgesDoVale.banco;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class NoDaListaDeContasTest {

	@Test
	public void testarInclusaoPesquisa() {
		Conta c = new Conta();
		c.setNum(1);
		c.credito(99);
		
		NoDaListaDeContas inicio = new NoDaListaDeContas();
		inicio.incluir(c);
		Conta outra = inicio.pesquisar(1);
		
		assertEquals(99, outra.getSaldo(), 0.0001);
	}
	
	private void assertEquals(int i, double saldo, double d) {
		// TODO Auto-generated method stub
		
	}

	@Test
	public void testarInclusaoPesquisaDeVariasContas() {
		Conta c1 = new Conta();
		c1.setNum(1);
		c1.credito(10);
		
		Conta c3 = new Conta();
		c3.setNum(3);
		c3.credito(30);

		Conta c2 = new Conta();
		c2.setNum(2);
		c2.credito(20);

		
		NoDaListaDeContas inicio = new NoDaListaDeContas();
		inicio.incluir(c1);
		inicio.incluir(c3);
		inicio.incluir(c2);
		
		Conta outra = inicio.pesquisar(3);
		assertEquals(30, outra.getSaldo(), 0.0001);
		
		outra = inicio.pesquisar(9);
		assertNull(outra);
		
		Assert.assertEquals("1 3 2 ", inicio.listar());
	}
}
