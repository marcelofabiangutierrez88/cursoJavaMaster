
package pkg14.pasoporreferencia;

/**
 *
 * @author Marcelo
 */
public class PasoPorReferencia {

  
    public static void main(String[] args) {
        Persona p = new Persona ();
        p.cambiarNombre("Juan");
        imprimirNombre(p);
        modificarPersona(p);
        imprimirNombre(p);
    }
        public static void imprimirNombre(Persona p1){
            System.out.println("Valor Recibido: " + p1.obtenerNombre());
        }
        
        public static void modificarPersona (Persona arg){
            arg.cambiarNombre("Carlos");
        }
    
    
}
