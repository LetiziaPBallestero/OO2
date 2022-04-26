package facturacionLlamada.src.main.java.ar.edu.unlp.info.oo2.facturacion_llamadas.copy;
// por ahora es solo una clase de datos
public abstract class Llamada {

	private Persona emisor;
	private Persona receptor;
	private int duracion;
	private static double descuentoJuridico = 0.15;
	private static double descuentoFisico = 0.0;
	
	public Llamada() {
	}

	public Llamada(Persona emisor, Persona receptor, int duracion) {
		this.emisor = emisor;
		this.receptor = receptor;
		this.duracion = duracion;
	}

	public Persona getReceptor() {
		return this.receptor;
	}
	
	public Persona getEmisor() {
		return this.emisor;
	}
	
	public int getDuracion() {
		return this.duracion;
	}
	
	
	public double calcularMontoDeLlamadas (String categoria) {
		calcularMontoBruto(); 
		return aplicarDescuentos(calcularMontoBruto() , categoria);
	}
	abstract double calcularMontoBruto();
	public double aplicarDescuentos (double monto , String categoria) {
		if (categoria.equals("Fisica"))
			return monto*descuentoFisico;
		else
			return monto*descuentoJuridico;
	}
}
