package lavarropas;

public class Lavarropas {
	// parte del strategy
	private Lavado lavado;
	
	public void setLavado(Lavado estrategia) {
		this.lavado = estrategia;
	}
	
	public int realizarLavado() {
        return lavado.realizarLavado(this);

	}
	
	// metodos que ya estaban 
	public void agregarAgua(int porcentaje) {}
	public void agregarJabonEnPolvo() {}
	public void lavar(int minutos) {}
	public void vaciarAgua() {}
	public void agregarEnjuague() {}
	public void enjuaga(int minutos) {}
	public void centrifugar(int minutos) {}

}
