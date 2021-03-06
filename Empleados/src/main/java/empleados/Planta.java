package empleados;

public class Planta extends Empleado {
    private int cantHijos; 
    private int antiguedad;
    private boolean matrimonio;  
    private double basico  = 50000 ;

    public Planta (int hijos, boolean matrimonio , int antiguedad) {
        this.cantHijos = hijos; 
        this.matrimonio = matrimonio;
        this.antiguedad = antiguedad;

    }
   
        public double basico(){
            return this.basico;
        }
    /*
    $5.000 si está casado
    $2.000 por cada hijo
    $2.000 por cada año de antigüedad
    */
        public double adicional() {
            double ad = 0.0;
            if (this.matrimonio)
                ad += 5000;
            ad += ((2000)*this.cantHijos) + ((2000)*this.antiguedad);
            return ad;
        }
    }