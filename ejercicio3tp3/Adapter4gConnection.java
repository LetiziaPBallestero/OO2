package ejercicio3tp3;

public class Adapter4gConnection implements Connection {

	private G4Connection adaptee;
	
	@Override
	public String sendData(String data, long crc) {
		adaptee.transmit(data , crc);
		return null;
	}

	@Override
	public String pict() {
		return adaptee.getSymb();
	}

}
