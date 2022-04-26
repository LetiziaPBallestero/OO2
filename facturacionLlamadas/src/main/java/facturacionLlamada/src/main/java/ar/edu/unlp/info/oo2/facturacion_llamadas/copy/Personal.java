package facturacionLlamada.src.main.java.ar.edu.unlp.info.oo2.facturacion_llamadas.copy;

import java.util.ArrayList;
import java.util.List;


public class Personal {
	private List<Persona> listaDePersonas = new ArrayList<Persona>();
	private List<Llamada> listaDeLlamadas = new ArrayList<Llamada>();
	private GuiaTelefonica guiaTelefonica = new GuiaTelefonica();
	
	
	public void agregarTelefono(String numero) {
		this.guiaTelefonica.agregarNumero(numero);
	}
	
	public Persona registrarUsuario(String id, String nombre, String categoria) {
		String telefono = this.guiaTelefonica.numeroDisponible();
		
		Persona persona;
		if (categoria.equals("Fisica"))
			persona = new PersonaFisica (telefono , id , nombre);
		else 
			persona = new PersonaJuridica (telefono , id , nombre);
		
		listaDePersonas.add(persona);
		return persona;
		
	}
	
	public boolean eliminarUsuario(Persona p) {
		
		if (this.listaDePersonas.contains(p)) {
			this.listaDePersonas.remove(p);
			this.guiaTelefonica.removerNumero(p);
			return true;
		} else 
			return false;
	}
	
	public Llamada registrarLlamada(Persona emisor, Persona receptor, String tipo, int duracion) {
		Llamada llamada;
		
		if (tipo == "Nacional")
			llamada = new LlamadaNacional (emisor , receptor , duracion);
		else 
			llamada = new LlamadaInternacional (emisor , receptor , duracion);
		
		this.listaDeLlamadas.add(llamada);
		emisor.addLlamada(llamada);
		return llamada;
	}
	
	public double calcularMontoTotalLlamadas(Persona p) {
		double monto=0.0;
		Persona aux =  listaDePersonas.stream()
				.filter(persona -> persona.getTelefono() == p.getTelefono())
				.findFirst().orElse(null);

		if (aux != null) 
			monto = aux.getLlamadas().stream()
			.mapToDouble(l -> l.calcularMontoDeLlamadas(p.getCategoria())).sum();

		return monto;
	}

	public int cantidadDeUsuarios() {
		return listaDePersonas.size();
	}

	public boolean existeUsuario(Persona persona) {
		return listaDePersonas.contains(persona);
	}
	
}
