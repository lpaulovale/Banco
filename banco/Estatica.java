package pauloEduardoBorgesDoVale.banco;

public class Estatica {
	
	static int x = 0;

	public Estatica() {
		x++;
	}
	
	public static void listaX() {
		System.out.println(x);
	}
}
