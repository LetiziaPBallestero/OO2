package empleados;

public class Temporario extends Empleado {
    private double horasDeTrabajo; 
    private int cantHijos; 
    private boolean matrimonio;  
    private double basico  = 20000 ;

    public Temporario (double horas , int hijos , boolean matrimonio) {
        this.horasDeTrabajo = horas; 
        this.cantHijos = hijos; 
        this.matrimonio = matrimonio;
    }
    
    /* 
    20.000 + hs de trabajo*300 
    */ 
        public double basico(){
            return (this.basico + (this.horasDeTrabajo*300));
        }
    /*
    $5.000 si está casado
    $2.000 por cada hijo
    */
        public double adicional() {
            double ad = 0.0;
            if (this.matrimonio)
                ad += 5000;
            ad += ((2000)*this.cantHijos);
            return ad;
        }
    }
