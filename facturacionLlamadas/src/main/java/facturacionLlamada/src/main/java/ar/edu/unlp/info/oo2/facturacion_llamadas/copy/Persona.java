package facturacionLlamada.src.main.java.ar.edu.unlp.info.oo2.facturacion_llamadas.copy;

import java.util.List;

public interface Persona {
	
	public List<Llamada> getLlamadas();
	public String getTelefono();
	public String getID() ;
	public String getCategoria();
	public String getNombre();
	public void addLlamada(Llamada l);
	
}
