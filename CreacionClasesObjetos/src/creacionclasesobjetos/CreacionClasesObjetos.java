
package creacionclasesobjetos;

/**
 *
 * @author Marcelo
 */
public class CreacionClasesObjetos {

   
    public static void main(String[] args) {
        //objetos
        Persona persona1 = new Persona();
        Persona persona2 = new Persona ();
        
        //llamando al metodo del objeto creado
        System.out.println("Valores por default del objeto persona");
        persona1.desplegarNombre();
        
        //modificando valores del objeto creado
        
        persona1.nombre ="Marcelo";
        persona1.apellidoPaterno ="Gutierrez";
        persona1.apellidoMaterno = "Godoy";
        
        //volvemos a llamar al metodo
        System.out.println ("\n nuevos valores asignados a la clase persona");
        persona1.desplegarNombre();
       
        System.out.println ("\n segundo objeto");

        persona2.nombre ="Dante";
        persona2.apellidoPaterno ="Gutierrez";
        persona2.apellidoMaterno ="Fantini";
        
        persona2.desplegarNombre();
        
    }
    
}
