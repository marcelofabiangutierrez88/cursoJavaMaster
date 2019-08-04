
package herencia;

/**
 *
 * @author Marcelo
 */
public class Persona {
    
    private String nombre;
    private char genero;
    private int edad;
    private String direccion;
    
    //constructor vacio
    
    public Persona(){}
    
    //constructor con 1 argumento
    public Persona(String nombre){
        this.nombre = nombre; 
    }
    //constructor con todos los atributos
    public Persona (String nombre, char genero, int edad , String direccion){
        this.nombre=nombre;
        this.genero=genero;
        this.edad=edad;
        this.direccion = direccion;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the genero
     */
    public char getGenero() {
        return genero;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(char genero) {
        this.genero = genero;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", genero=" + genero + ", edad=" + edad + ", direccion=" + direccion + '}';
    }
    
    
}