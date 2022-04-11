package ejercicio3tp3;

/** este codigo es un asco y le falta refactoring
**/

public class Dispositivo {
	private Connection connection; 
	private Display display; 
	private Ringer ringer; 
	private Calculator crcCalculator;
	// lo inicializo default para despues no confundirme 
	private String data = "un mensaje";
	
	public String send ( String data) {
		long crc = this.crcCalculator.crcFor(data);
		return connection.sendData(data, crc);
	}
	
	// se establece desde afuera la conexion, para probar ambos casos 
	// de instaciarlo en el mismo codigo 
	// y de que venga de afuera
	public void establecerCalculadora( Calculator c) {
		this.crcCalculator = c;
	}
	
	public void establecerCRC32() {
		this.crcCalculator = new CRC32_Calculator();
	}
	
	public void establecerConeccion4G () {
		this.connection = new Adapter4gConnection();
		showBanner(getTypeConnection()); 
		ring();
	}
	
	public void establecerWiFiConnecion() {
		this.connection = new WifiConn(); 
		showBanner(getTypeConnection()); 
		ring();
	}
	
	// estos metodos son para testear boludeces y por separado 
	public String ring () {
		return this.ringer.ring();
	}
	
	public String getTypeConnection() {
		return this.connection.pict();
	}
	
	public String showBanner(String i) {
		return this.display.showBanner (i);
	}
	
	
	
	
}
