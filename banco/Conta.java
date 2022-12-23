package pauloEduardoBorgesDoVale.banco;

public class Conta {
	
    private int num;
    private double saldo;
    private String extrato = "";
    private PessoaFisica titular;
	
	public PessoaFisica getTitular() {
		return titular;
	}

	public void setTitular(PessoaFisica titular) {
		this.titular = titular;
	}

	public String getExtrato() {
		return extrato;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int n) {
		num = n;
	}

	public double getSaldo() {
		return saldo;
	}

	public void credito(double val) {
		saldo = saldo + val;
		extrato = extrato + " Crédito: " + val +
				". Saldo: " + getSaldo() + ".\n";
	}

	public void debito(double val) {
		saldo = saldo - val;
		extrato = extrato + " Débito: " + val +
				". Saldo: " + getSaldo() + ".\n";
	}
}
