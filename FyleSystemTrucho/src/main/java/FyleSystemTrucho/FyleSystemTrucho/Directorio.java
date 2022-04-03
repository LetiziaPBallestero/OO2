package FyleSystemTrucho.FyleSystemTrucho;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Directorio extends Contenido {
	private List<Contenido> contenidos = new ArrayList<>();

	/**
	 * Crea un nuevo Directorio con nombre <nombre> y en la fecha <fecha>.
	 */
	public Directorio(String nombre, LocalDate fecha) {
		super(nombre, fecha, 32);
	}

	// metodos tipicos de listas
	public void agregar(Contenido contenido) {
		this.contenidos.add(contenido);
	}

	public void removerDelDirectorio(Contenido contenido) {
		this.contenidos.remove(contenido);
	}

	/**
	 * Retorna el espacio total ocupado, incluyendo su contenido.
	 */

	public long tamanoTotalOcupado() {
		long tam = this.tamanioKB;
		for (Contenido child : contenidos) {
			tam += child.tamanoTotalOcupado();
		}
		return tam;
	}

	/**
	 * Retorna el archivo con mayor cantidad de bytes en cualquier nivel del
	 * filesystem contenido por directorio receptor
	 */

	public Archivo archivoMasGrande() {
		return this.contenidos.stream().map(a -> a.archivoMasGrande())
				.max(Comparator.comparing(elem -> elem.tamanoTotalOcupado()))
				.orElse(null);
	}
	/*
	 * Voy a dejar acá todas las soluciones que no me salieron para compartir mi
	 * pelotudez con el mundo, y para mostrar que estuve dos días seguidos durante
	 * 5hs cada día para esta cosa <3 :
	 * 
	 * 1.problema c.isFile() no se mete en los otros directorios y descarta los
	 * archivos.
	 * 
	 * List<Contenido> archivos = contenidos.stream().filter(c -> c.isFile())
	 * .collect(Collectors.toList());
	 * 
	 * 2. Dejo la otra solucion que claramente tampoco funciona, es chancha y si
	 * bien agarra archivo, es asqueroso y no cumple bien su cometido List
	 * <Contenido> archivos = new ArrayList<>();
	 * 
	 * for (Contenido child : contenidos) { if (!child.isFile())
	 * child.archivoMasGrande(); else archivos.add(child.getFile()); }
	 * 
	 * return (Archivo)
	 * archivos.stream().max(Comparator.comparing(Contenido::getTamanio)).orElse(
	 * null).getFile();
	 * 
	 * public Contenido getFile() {
		return null;
	}

	public boolean isFile() {
		return false;
	}
	 */

	/*
	 * Retorna el archivo con fecha de creación más reciente en cualquier nivel del
	 * filesystem contenido por directorio receptor.
	 * 
	 */
	public Archivo archivoMasNuevo() {
		return this.contenidos.stream().map(a -> a.archivoMasNuevo())
				.max(Comparator.comparing(elem -> elem.getFecha()))
				.orElse(null);
	}

}
