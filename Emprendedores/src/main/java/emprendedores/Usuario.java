package emprendedores;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	private List<Proyecto> proyectos;
	private String userName; 
	
	public Usuario (String name) {
		this.userName = name;
		this.proyectos = new ArrayList<Proyecto>();
	}
	
	public void crearProyecto(String titulo, double montoNecesario) {
		proyectos.add (new Proyecto(titulo,montoNecesario, this));
	}
}
