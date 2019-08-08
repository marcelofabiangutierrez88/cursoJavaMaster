
package palabrafinal;

/**
 *
 * @author Marcelo
 */
public class PalabraFinal {

 
    public static void main(String[] args) {
       // ClaseFinal.VAR_PRIMITIVO=15; No es posible modificar el valor de un atributo final
       //ClaseFinal.VAR_PERSONA=new Persona(); No es posible modificar un objeto marcado como final
       
       // no se puede cambiar la referencia pero si el valor del objeto
       ClaseFinal.VAR_PERSONA.setNombre("Marcelo");
       System.out.println(ClaseFinal.VAR_PERSONA.getNombre());
    }
    
}
