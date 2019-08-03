
package encapsulamiento;

/**
 *
 * @author Marcelo
 */
public class Encapsulamiento {

 
    public static void main(String[] args) {
        Persona persona1 = new Persona ("Juan","Perez",true);
        
        System.out.println(persona1.getNombre());
        persona1.setNombre("Marcelo");
        System.out.println(persona1.getNombre());
        
        System.out.println (persona1);
    }
    
}
