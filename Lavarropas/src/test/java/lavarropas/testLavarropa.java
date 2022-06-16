package lavarropas;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class testLavarropa {

	Lavarropas lavarropa; 
	Lavarropas lavarropa2;
	
	Lavado delicado;
	Lavado sucio;
	Lavado normal;
	
	
	@BeforeEach
	void setUp() {
		// toy usando los constructores default
		lavarropa = new Lavarropas();
		lavarropa2 = new Lavarropas(); 
		
		delicado = (Lavado) new Delicado();
		sucio = (Lavado) new Sucio();
		normal = (Lavado) new Diario();
	}
	
	@Test
	void testLavadoNormal() {
		lavarropa.setLavado(normal);
		assertEquals(30 , lavarropa.realizarLavado());
	}
	
	@Test 
	void testLavadoDelicado() {
		lavarropa.setLavado(delicado);
		assertEquals((40+15) , lavarropa.realizarLavado());
	}
	
	@Test 
	void testLavadoSucio() {
		lavarropa.setLavado(sucio);
		assertEquals((100 + 30 + 15 + 10) , lavarropa.realizarLavado());
	}
	
	
}
