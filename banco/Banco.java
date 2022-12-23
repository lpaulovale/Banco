package pauloEduardoBorgesDoVale.banco;

public class Banco {
	
	private NoDaListaDeContas contas = new NoDaListaDeContas();
	//private VetorDeContas contas = new VetorDeContas();
	
	public void incluir(Conta c) {
		contas.incluir(c);
	}
	
	private Conta pesquisar(int n) {
		return contas.pesquisar(n);
	}
	
	public void saque(int n, double v) {
		Conta c = pesquisar(n);
		if (c != null) {
		   c.debito(v);
		}
	}
	
	public void deposito(int n, double v) {
		Conta c = pesquisar(n);
		if (c != null) {
		   c.credito(v);
		}
	}
	
	public double saldo(int n) {
		Conta c = pesquisar(n);
		if (c != null) {
		   return c.getSaldo();
		}
		return -999999;
	}
	
	public String extrato(int n) {
		Conta c = pesquisar(n);
		if (c != null) {
		   return c.getExtrato();
		}
		return "";
	}
}
