package Topografias.Topografias;

public class Area extends AreaCompuesta {
	private double proporcion_agua;

	public double getAgua() {
		return this.proporcion_agua;
	}

	public Area (double agua) {
		this.proporcion_agua = agua;
	}
	
	public double getTierra() {
		return 1-this.proporcion_agua;
	}
	
	// no se si van acá o no, a ver. 
	public boolean isThisJustWater() {
		return (this.proporcion_agua == 1.0) ? true : false;
	}

	public boolean isThisJustEarth() {
		return (this.proporcion_agua == 0.0) ? true : false;
	}

	public boolean isThisASwamp() {
		return ((this.proporcion_agua == 0.7) ? true : false);
	}
}
