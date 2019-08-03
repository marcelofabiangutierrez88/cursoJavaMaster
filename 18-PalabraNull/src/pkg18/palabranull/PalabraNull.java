
package pkg18.palabranull;

/**
 *
 * @author Marcelo
 */
public class PalabraNull {

   
    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan");
        System.out.println("persona 1: " +persona1.obtenerNombre());
        
        Persona persona2 = persona1;
        System.out.println("persona 2: " +persona2.obtenerNombre());
        
        //utilizando la palabra null
        
        persona1= null;// candidata a ser eliminada por el recolector de basura
        System.gc(); // planifica la llamada al recolector 
        if (persona1!=null)
        System.out.println ("persona 1: "+persona1.obtenerNombre());
        
    }
    
}

class Persona {
String nombre;

Persona(String nombre){
this.nombre = nombre;
}

public String obtenerNombre(){
    return this.nombre;
}
}
