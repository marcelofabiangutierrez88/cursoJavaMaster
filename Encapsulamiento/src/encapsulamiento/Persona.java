
package encapsulamiento;

/**
 *
 * @author Marcelo
 */
public class Persona {
    private String nombre;
    private String apellido;
    private boolean borrado;
    
    public Persona(String nombre, String apellido, boolean borrado){
        this.nombre=nombre;
        this.apellido=apellido;
        this.borrado=borrado;
    }
    
    public String getNombre (){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public String getApellido(){
        return this.apellido;
        
    }
    public void setApellido(String apellido){
        this.apellido=apellido;
    }
    public boolean isBorrado(){
        return this.borrado;
    }
    public void setBorrado(boolean borrado){
        this.borrado = borrado;
    }
    
    public String toString (){
        return "nombre: "+nombre+" apellido: "+apellido+" borrado: "+borrado;
    }
}
