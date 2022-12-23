package pauloEduardoBorgesDoVale.banco;

import java.util.ArrayList;

public class UsoDeConta {
	public static void main(String[] args) {
		
		Banco b = new Banco();				
		Conta c1 = new Conta();
		c1.setNum(1);
		Conta c2 = new Conta();
		c2.setNum(2);
		Conta c3 = new Conta();
		c3.setNum(3);
		VetorDeContas contasVec = new VetorDeContas();
		contasVec.incluir(c1);
		contasVec.incluir(c2);
		contasVec.incluir(c3);

		System.out.println("Tamanho:"+contasVec.size());
		for(int i = 0; i < contasVec.size(); i++) {
			System.out.println("Conta" + contasVec.get(i));
		}
		Conta outraVec = contasVec.get(2);
		System.out.println(outraVec.getNum());
		
		NoDaListaDeContas contasLista = new NoDaListaDeContas();
		contasLista.incluir(c1);
		contasLista.incluir(c2);
		contasLista.incluir(c3);
		System.out.println("Tamanho:"+contasLista.size());
		
		/*
		b.incluir(c);
		b.deposito(1, 100);		
		b.saque(1, 90);
		b.saque(1, 3);
	
		NoDaListaDeContas inicio = new NoDaListaDeContas();
		inicio.incluir(c1);
			
		System.out.println(b.extrato(1));
		
		Estatica e1 = new Estatica();
		Estatica e2 = new Estatica();
		Estatica e3 = new Estatica();
		
		e1.listaX();
		Estatica.listaX();
		
		System.out.println(e1.x);
		System.out.println(e2.x);
		System.out.println(e3.x);
		
		e2.x = 10; 
		
		System.out.println(e1.x);
		System.out.println(e2.x);
		System.out.println(e3.x);
//		System.out.println(Estatica.x);*/
	}
}
