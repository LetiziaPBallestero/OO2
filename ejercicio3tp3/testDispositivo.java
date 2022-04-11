package ejercicio3tp3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class testDispositivo {
	private Dispositivo Dispositivo4g;
	private Dispositivo DispositivoWifi;
	private Dispositivo DispositivoCambia; 
	
	private Dispositivo Dispositivo16;
	private Dispositivo Dispostivio32;
	
	private CRC16_Calculator calculadora16;
	private CRC32_Calculator calculadora32;

	@BeforeEach
	void setUp() {
		// para coneccion
		Dispositivo4g= new Dispositivo();
		DispositivoWifi= new Dispositivo();
		DispositivoCambia= new Dispositivo();
		// para calculadoras
		Dispositivo16 = new Dispositivo();
		Dispostivio32 = new Dispositivo();
		// las calculadoras
		calculadora16 = new CRC16_Calculator();
		calculadora32 = new CRC32_Calculator();
	}
	
	@Test
	void send() {
		Dispositivo4g.establecerConeccion4G();
		DispositivoWifi.establecerWiFiConnecion();
		
		DispositivoCambia.establecerConeccion4G();
		assertEquals("4G" , DispositivoCambia.showBanner());
		DispositivoCambia.establecerWiFiConnecion();
		assertEquals("WiFi" , DispositivoCambia.showBanner());
		
	}
	
	@Test
	void calculadora() {
		
	}
	
	
	
}
