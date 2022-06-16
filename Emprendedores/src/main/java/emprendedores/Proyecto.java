package emprendedores;

public class Proyecto {
	private String titulo;
	private double montoActual;
	private double montoNecesario;
	private Usuario propietario;
	private Estado estado;

	public Proyecto(String t, double mNecesario, Usuario propietario) {
		this.titulo = t;
		this.montoNecesario = mNecesario;
		this.montoActual = 0;
		this.propietario = propietario;

		this.estado = new Vigente(this);
	}

	// metodos relacionados con el state pattern
	protected void setEstado(Estado estado) {
		this.estado = estado;
	}
	
	public Estado getEstado () {
		return this.estado;
	}

	public void cancelar() {
		this.estado.cancelar(this);
	}
	
	public void invertir(double monto) {
		this.estado.invertir(this, monto);
	}

	// otros metodos 
	protected void agregarMonto (double monto) {
		this.montoActual += monto;
	}
	public double consultarMontoActual() {
		return this.montoActual;
	}

	public double consultarMontoNecesario() {
		return this.montoNecesario;
	}

}
