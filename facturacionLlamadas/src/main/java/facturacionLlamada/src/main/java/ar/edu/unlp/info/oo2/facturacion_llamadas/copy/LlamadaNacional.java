package facturacionLlamada.src.main.java.ar.edu.unlp.info.oo2.facturacion_llamadas.copy;

public class LlamadaNacional extends Llamada {
	private double plus = 3 ;
	private double recargo = 0.63;
	
	public LlamadaNacional (Persona emisor, Persona receptor, int duracion) {}
	
	public void setPlus(double p) {
		this.plus = p;
	}
	
	public void setRecargo(double r) {
		this.recargo = this.plus * r;
	}
	
	@Override
	double calcularMontoBruto() {
		return ((super.getDuracion()*plus) + (super.getDuracion()*recargo));
	}
}
