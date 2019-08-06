
package sobrecargaconstructores;

/**
 *
 * @author Marcelo
 */
public class SobrecargaConstructores {

  
    public static void main(String[] args) {
        Persona persona1 = new Persona("Marcelo",31);
        System.out.println("Persona 1 = "+persona1);
        
        Empleado empleado1 = new Empleado("Marcelo",31,25000);
        System.out.println("Empleado 1 = "+empleado1);
    }
    
}
