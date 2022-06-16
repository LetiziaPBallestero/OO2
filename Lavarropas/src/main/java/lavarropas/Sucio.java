package lavarropas;

public class Sucio extends Lavado {

	public int realizarLavado(Lavarropas l) {
		return super.iniciarLavado(l, 100, 100) 
				+ super.iniciarLavado(l, 100, 30) 
				+ super.postLavado(l, 100, 15, 10);
	}
}
