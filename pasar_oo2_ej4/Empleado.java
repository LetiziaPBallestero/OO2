public abstract class Empleado {
/* este codigo falta revisarlo porque esta hecho en biblioteca 
y no tenian eclipse 
y no me gusta vscode para java :( 
/* 


* Diseñe la jerarquía de Empleados de forma tal que cualquier empleado puede responder al mensaje #sueldo. 
* Desarrolle los test cases necesarios para probar todos los casos posibles.
* Implemente en Java
*/ 


    public double templateSueldo() {
        return (
            basico()+
            adicional()+
            descuento()
        );
    }

    abstract double basico();
    abstract double adicional();

    // en todos es igual, así que evito rehacer este metodo en cada clase
    public double descuento() {
        return ((basico()*0.13) + (adicional()*0.5))
    }
}
