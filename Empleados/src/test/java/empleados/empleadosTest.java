package empleados;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class empleadosTest {
	private Empleado empleadoTemporarioSinHijos; 
	private Empleado empleadoTemporarioSinMatrimonio; 
	private Empleado empleadoPlanta; 
	private Empleado empleadoPasante; 
	
	@BeforeEach
	void setUp() {
		// double horas , int hijos , boolean matrimonio
		empleadoTemporarioSinHijos = new Temporario (40,0,true);
		empleadoTemporarioSinMatrimonio = new Temporario(40,1,false);
		//int hijos, boolean matrimonio , int antiguedad
		empleadoPlanta = new Planta (1,true,5);
		// examenes adicionales int 
		empleadoPasante = new Pasante(2); 
	}
	
	@Test
	void testEmpleadoTemporario() {
		assertEquals(32590, empleadoTemporarioSinHijos.getSueldo());
		assertEquals(29740 , empleadoTemporarioSinMatrimonio.getSueldo());
	}
	
	@Test
	void testEmpleadoPlanta() {
		// basico 50000
		// adc 17000
		// descuento  7.350 
		assertEquals(59650 , empleadoPlanta.getSueldo());
	}
	
	@Test 
	void testEmpleadoPasante() {
		// basico 20000
		// ad 4000
		// desc 2800
		assertEquals(21200 , empleadoPasante.getSueldo());
	}
}
