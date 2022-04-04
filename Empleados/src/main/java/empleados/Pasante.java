package empleados;

public class Pasante extends Empleado {
    private int examenesRendidos; 
    private double basico = 20000;

    public Pasante (int examenes) {
        this.examenesRendidos = examenes; 
    }
    
    /* 
    20.000
    */ 
        public double basico(){
            return this.basico;
        }
    /*
    $2.000 por examen rendido
    */
        public double adicional() {
            return (this.examenesRendidos*2000);
        }
    }