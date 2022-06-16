package lavarropas;

public class Diario extends Lavado {
	

	public int realizarLavado(Lavarropas l) {
		return super.iniciarLavado(l, 50, 20) 
				+ super.postLavado(l, 50, 7, 3);
	}
}
