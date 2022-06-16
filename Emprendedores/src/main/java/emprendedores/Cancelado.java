package emprendedores;

public class Cancelado extends Estado{
	public Cancelado (Proyecto proyecto) {
		super(proyecto);
	}
	
	@Override
	public void invertir(Proyecto proyecto, double monto) {
		throw new RuntimeException("Este proyecto se encuentra cancelado");	

		
	}

	@Override
	public void cancelar(Proyecto proyecto) {
		throw new RuntimeException("Este proyecto ya se encuentra cancelado");
	}

}
