package calculos;
/**Analice el código que se muestra a continuación. 
 * Indique qué defectos encuentra y cómo pueden corregirse.	
 * ABAJO ESTÁ EL CÓDIGO CON UN INTENTO DE MEJORA					
*/ 

public class Calculos {
	
	public void imprimirValores() {
		int totalEdades = 0;
		double promedioEdades = 0;
		double totalSalarios = 0;
		
		// el foreach podría remplazarse por un stream, 
		// además de modularizarse un poco más 
		// pero primero vamos dentro del foreach
		
		for (Empleado empleado : personal) {
			// clase Empleado, objeto empleado itera la lista personal
			totalEdades = totalEdades + empleado.getEdad();
			// totalEdades += empleado.getEdad();
			totalSalarios = totalSalarios + empleado.getSalario();
			// totalSalarios += empleado.getSalario();
		}
		
		promedioEdades = totalEdades / personal.size();
			
		
		String message = String.format("El promedio de las edades es %s y el total de salarios es %s", promedioEdades, totalSalarios);
		
		System.out.println(message);
				
	}
	/** 
	 * intento de mejora 
	 * esto es suponiendo que esta en la misma clase donde 
	 * tengo la lista de persona
	 * si no esta deberia ser pasado por parámetro
	 */
		public int totalSalario() {
		 return personal.stream()
				 .mapToInt (p -> p.getSalario())
				 .sum();
		}
		
		public double promedioEdades() {
			return personal.stream()
					.mapToDouble(Empleado::getEdad)
					.average()
					.orElse(Double.NaN);
		}

		public void imprimirValoresMEJORADO() {
			String message = String.format("El promedio de las edades es %s y el total de salarios es %s", promedioEdades(), totalSalario());
			System.out.println(message);
	}

}
