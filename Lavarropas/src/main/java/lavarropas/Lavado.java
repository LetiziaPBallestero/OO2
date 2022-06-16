package lavarropas;

public abstract class Lavado {
	public abstract int realizarLavado (Lavarropas l);
	

    // Template Method
    public int iniciarLavado(Lavarropas l, int porcentajeAgua, int minutosLavado){
        l.agregarAgua(porcentajeAgua);
        l.agregarJabonEnPolvo();
        l.lavar(minutosLavado);
        l.vaciarAgua();
        
        return minutosLavado;
    }
    
    public int postLavado (Lavarropas l, int porcentajeAgua, int minutosEnjuague , int minutosCentrifugado) {
    	l.agregarEnjuague();
        l.enjuaga(minutosEnjuague);
        l.centrifugar(minutosCentrifugado);
        
        return minutosEnjuague + minutosCentrifugado;
    }
	
}
