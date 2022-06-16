package emprendedores;

public class Conformado extends Estado{
	public Conformado(Proyecto proyecto) {
		super(proyecto);
	}

	@Override
	public void invertir(Proyecto proyecto , double monto) {
		proyecto.agregarMonto(monto);
	}

	@Override
	public void cancelar(Proyecto proyecto) {
		throw new RuntimeException("Esta proyecto se encuentra conformado, no puede cancelarse... gil (?)");
	}

}