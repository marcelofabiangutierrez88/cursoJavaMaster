
package contextoestatico;

/**
 *
 * @author Marcelo
 */
public class ContextoEstatico {

  
    public static void main(String[] args) {
        Persona p1= new Persona ("Marcelo");
        System.out.println(p1);
        
        Persona p2=new Persona ("Dante");
        System.out.println(p2);
        
        Persona p3 = new Persona ("Jazmin");
        System.out.println(p3);
        
        System.out.println("contadorPersonas: "+ Persona.getContadorPersona());
    }
    
}

class Persona {
    private int idpersona ;
    private String nombre;
    private static int contadorPersona;
    
    public Persona (String nombre){
        contadorPersona++;
        this.idpersona = contadorPersona;
        this.nombre = nombre;
    }
    
    public int getIdPersona(){
        return this.idpersona;
    }
    public void setIdPersona (int idpersona){
        this.idpersona = idpersona;
    }
    
    public String getNombre (){
        return this.nombre;
    }
    
    public void setNombre (String nombre){
        this.nombre=nombre;
    }
    
    public static int getContadorPersona(){
        return contadorPersona ;
    }
    
    public String toString (){
        return "idPersona: "+idpersona +" "+ "Nombre: " + nombre ;
    }
}
