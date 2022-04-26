package facturacionLlamada.src.main.java.ar.edu.unlp.info.oo2.facturacion_llamadas.copy;

public class LlamadaInternacional extends Llamada {
	private double plus = 200 ;
	private double recargo = 0.42;

	public LlamadaInternacional (Persona emisor, Persona receptor, int duracion) {}
	
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
