package ejercicio3tp3;

public interface Connection {
// dispositivo conoce a Connection 

	public String sendData(String data, long crc);
	public String pict();

}
