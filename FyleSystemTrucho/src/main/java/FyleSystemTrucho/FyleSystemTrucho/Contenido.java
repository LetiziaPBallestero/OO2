package FyleSystemTrucho.FyleSystemTrucho;

import java.time.LocalDate;

public abstract class Contenido {
	protected LocalDate fecha; 
	protected String nombre; 
	protected long tamanioKB;
	
	public Contenido (String nombre, LocalDate fecha, long tam) {
		super();
		this.nombre = nombre;
		this.fecha = fecha; 
		this.tamanioKB = tam; 
	}
	
	public String getNombre() {
		return nombre;
	}

	public LocalDate getFecha() {
		return fecha;
	}
	
	public long getTamanio() {
		return tamanioKB;
	}
	
	/* Estos métodos son para todas las implementaciones
	 * erroneas que quedan en el recuerdo (?)
	 * public abstract Contenido getFile();
	 
	
	public abstract boolean isFile(); 
	*/
	public long tamanoTotalOcupado() {
		return tamanioKB;
	}
	
	public abstract Archivo archivoMasGrande();
	public abstract Archivo archivoMasNuevo();

}
