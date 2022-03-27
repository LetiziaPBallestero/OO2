package MediaPlayer;

public class AdapterMedia implements Media {
	
	private VideoStream adaptee;
	
	public void play() {
		adaptee.reproduce();
	}
}
