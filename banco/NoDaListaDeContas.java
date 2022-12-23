package pauloEduardoBorgesDoVale.banco;

public class NoDaListaDeContas {

	private NoDaListaDeContas prox;
	private Conta conta;
	private static int tam = 0;
	
	public void incluir(Conta c) {
		if (conta == null) {
		  conta = c;
		  prox = new NoDaListaDeContas();
		  tam++;
		} else {
			prox.incluir(c);
		}
	}
	
	public int size() {
		return tam;
	}
	
	public Conta get(int i){
		if(i <= tam) {
			return conta;
		}
		return null;
	}
	
	public String listar() {
		if (conta == null) {
			return "";
		} else {
			return conta.getNum() +  " " + prox.listar();
		}
	}
	
	public Conta pesquisar(int num) {
		if (conta == null) {
			return null;
		}
		if (conta.getNum() == num) {
			return conta;
		} else {
			return prox.pesquisar(num);
		}	
	}
}
