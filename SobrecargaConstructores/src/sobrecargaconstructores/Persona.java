
package sobrecargaconstructores;

/**
 *
 * @author Marcelo
 */
public class Persona {
    private int idPersona;
    private String nombre;
    private int edad;
    private static int contadorPersonas;
    
    private Persona(){
        this.idPersona = ++contadorPersonas;
    }
    
    //Sobrecarga de constructor
    public Persona(String nombre, int edad){
        this(); //llamo al constructor sin argumentos por medio de this
        this.nombre = nombre;
        this.edad=edad;
    }
    

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + ", nombre=" + nombre + ", edad=" + edad + '}';
    }

   
    public int getIdPersona() {
        return idPersona;
    }


    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
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
    
    
}
