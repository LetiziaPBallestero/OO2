package emprendedores;

public class Vigente extends Estado {
	public Vigente(Proyecto proyecto) {
		super(proyecto);
	}

	@Override
	public void invertir(Proyecto proyecto, double monto) {
		proyecto.agregarMonto(monto);
		if (proyecto.consultarMontoActual() >= proyecto.consultarMontoNecesario())
			proyecto.setEstado(new Conformado(proyecto));
	}

	@Override
	public void cancelar(Proyecto proyecto) {
		proyecto.setEstado(new Cancelado(proyecto));
	}

}
