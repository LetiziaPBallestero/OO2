package emprendedores;

public abstract class Estado {
	// si no le pongo nada es clase de paquete 
	Proyecto proyecto;
	
	public Estado (Proyecto proyecto) {
		this.proyecto = proyecto;
	}
	
	public abstract void invertir (Proyecto proyecto , double monto);
	public abstract void cancelar(Proyecto proyecto);
	
	
	
	
}
