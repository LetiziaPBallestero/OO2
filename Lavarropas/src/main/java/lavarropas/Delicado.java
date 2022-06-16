package lavarropas;

public class Delicado extends Lavado {

	public int realizarLavado(Lavarropas l) {
		return super.iniciarLavado(l, 100, 40) 
				+ super.postLavado(l, 100, 15, 0);
	}
}
