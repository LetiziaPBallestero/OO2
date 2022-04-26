package facturacionLlamada.src.main.java.ar.edu.unlp.info.oo2.facturacion_llamadas.copy;


import java.util.ArrayList;
import java.util.List;


public class GuiaTelefonica {
	private List<String> numerosSinUsar;
	private List<String> numerosUsados;
	
	public GuiaTelefonica () {
		this.numerosSinUsar = new ArrayList<String>();
		this.numerosUsados = new ArrayList<>();
	}
 
	public void agregarNumero(String numero) {
		if (this.numerosUsados.contains(numero))
			return;
		else 
			this.numerosUsados.add(numero);
			this.numerosSinUsar.remove(numero);
	}
	
	public String numeroDisponible() {
		return  this.numerosSinUsar.stream()
				.findFirst().toString();
	}
	
	public void removerNumero(Persona p) {
		this.numerosUsados.remove(p.getTelefono());
		this.numerosSinUsar.add(p.getTelefono());
	}
}
