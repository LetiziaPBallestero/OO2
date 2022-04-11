package ejercicio3tp3;

public class G4Connection{
	private String symb = "4G";
	
	public String transmit (String data , long crc) {
		return data + crc;
	}
	
	public String getSymb() {
		return this.symb;
	}
}
