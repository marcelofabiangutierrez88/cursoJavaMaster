
package polimorfismo;

/**
 *
 * @author Marcelo
 */
public class Empleado {
    protected String nombre;
    protected double sueldo;
    
    // constructor con los argumentos de la clase 
    protected Empleado(String nombre, double sueldo){
        this.nombre = nombre;
        this.sueldo = sueldo;
    }
    
    public String obtenerDetalles(){
        return "Nombre: "+ nombre+
                ", sueldo: "+sueldo ;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    
}
