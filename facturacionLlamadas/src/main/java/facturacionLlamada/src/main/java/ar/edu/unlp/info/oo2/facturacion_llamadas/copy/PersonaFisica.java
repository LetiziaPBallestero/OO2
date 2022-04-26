package facturacionLlamada.src.main.java.ar.edu.unlp.info.oo2.facturacion_llamadas.copy;

import java.util.ArrayList;
import java.util.List;

public class PersonaFisica implements Persona {
	protected List<Llamada> llamadas;
	protected String categoria = "Fisica";
	protected String nombre;
	protected String telefono;
	protected String documento;
	
	public PersonaFisica (String nTelefono, String documento, String nombre) {
		this.llamadas = new ArrayList<Llamada>();
		this.telefono = nTelefono; 
		this.documento = documento; 
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
		return this.documento;
	}
	
	public String getCategoria() {
		return categoria;
	}
	public String getNombre() {
		return nombre;
	}


}
