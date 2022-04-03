package FyleSystemTrucho.FyleSystemTrucho;

import java.time.LocalDate;

/* 
 *  *  De cada archivo se conoce 
 *  	el nombre, 
 *  	fecha de creación 
 *  	y tamaño en bytes
 */
public class Archivo extends Contenido {

	/**
	 * Crea un nuevo archivo con nombre <nombre>, de <tamano> tamano y en la fecha
	 * <fecha>.
	 */
	public Archivo(String nombre, LocalDate fecha, long tamano) {
		super(nombre, fecha , tamano);
	}

	/* Estos métodos son para todas las implementaciones erroneas
	 * que quedan en el recuerdo (?)
	 * public Contenido getFile() {
	 
		return this;
	}
	
	public boolean isFile() {
		return true;
	} */ 
	
	public Archivo archivoMasGrande() {
		return this;
	}
	
	public Archivo archivoMasNuevo() {
		return this;
	}


}
