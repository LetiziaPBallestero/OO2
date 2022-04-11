package ejercicio3tp3;

public class WifiConn implements Connection {
	private String pict = "WiFi";
	

	@Override
	public String sendData(String data, long crc) {
		return data + crc;
	}

	@Override
	public String pict() {
		return this.pict;
	}

}
