package Topografias.Topografias;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TopografiaTest {

	AreaCompuesta t1;
	AreaCompuesta t2;
	AreaCompuesta t3;
	AreaCompuesta t4;
	AreaCompuesta t5;
	
	AreaCompuesta t6;
	AreaCompuesta superT;
	AreaCompuesta pantano;
	Area tierra;
	Area agua;
	Area aguaPantano;
	Area tierraPantano;

	@BeforeEach
	void setUp() throws Exception {
		t1 = new AreaCompuesta();
		t2 = new AreaCompuesta();
		t3 = new AreaCompuesta();
		t4 = new AreaCompuesta();
		t5 = new AreaCompuesta();
		t6 = new AreaCompuesta();
		superT = new AreaCompuesta();
		
		pantano = new AreaCompuesta(); 
		aguaPantano = new Area(0.7);
		tierraPantano = new Area(0.7);
		pantano.addTopo(aguaPantano);
		pantano.addTopo(tierraPantano);
		
		
		tierra = new Area(0.0);
		agua = new Area(1.0);
	}

	@Test
	public void cuantaAgua() {
		t1.addTopo(agua);
		assertEquals(1.0, t1.getAgua());
	}

	@Test
	public void cuantaTierra() {
		t2.addTopo(tierra);
		assertEquals(1.0, t2.getTierra());
	}
	@Test
	public void isMatch() {
		t3.addTopo(agua);
		t3.addTopo(tierra);
		assertNotEquals(t1 , t3);
	}
	@Test
	public void hasTheSameWatter() {
		t4.addTopo(agua);
		t4.addTopo(agua);
		t4.addTopo(agua);
		t4.addTopo(tierra);
		assertEquals(0.75 , t4.getAgua());
	} 
	
	@Test 
	public void isASwamp() {
		t5.addTopo(pantano);
		assertEquals(0.7 , t5.getAgua() , 1e-3);
		assertEquals(0.3 , t5.getTierra() , 1e-3);
	}
	
	public void compo() {
		t6.addTopo(agua);
		t6.addTopo(agua);
		t6.addTopo(agua);
		t6.addTopo(tierra);
		
		superT.addTopo(agua);
		superT.addTopo(t6);
		
		assertEquals(5 , superT.getElementos());
		assertEquals(0.8 , superT.getAgua());
	}

}
