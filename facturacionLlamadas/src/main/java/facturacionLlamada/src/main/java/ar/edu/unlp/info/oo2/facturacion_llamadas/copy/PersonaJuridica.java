package facturacionLlamada.src.main.java.ar.edu.unlp.info.oo2.facturacion_llamadas.copy;

import java.util.ArrayList;
import java.util.List;

public class PersonaJuridica implements Persona {
	protected List<Llamada> llamadas;
	protected String categoria = "Juridica";
	protected String nombre;
	protected String telefono;
	protected String cuit;
	protected String documento;
	
	public PersonaJuridica (String nTelefono, String cuit, 
			String nombre) {
		this.llamadas = new ArrayList<Llamada>();
		this.telefono = nTelefono; 
		this.cuit = cuit;
		this.nombre = nombre;
	}
	
	public void addLlamada(Llamada l) {
		llamadas.add(l);
	}
	public List<Llamada> getLlamadas() {
		return this.llamadas;	
	}
	public String getTelefono() {
		return this.telefono;
	}
	public String getID() {
		return this.cuit;
	}
	
	public String getCategoria() {
		return categoria;
	}
	public String getNombre() {
		return nombre;
	}
}
