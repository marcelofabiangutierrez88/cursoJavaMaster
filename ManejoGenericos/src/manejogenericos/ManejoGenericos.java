
package manejogenericos;

/**
 *
 * @author Marcelo
 */
public class ManejoGenericos {

    public static void main(String[] args) {
     ClaseGenerica<Integer>objetoInt= new ClaseGenerica<Integer>(15);
     objetoInt.obtenerTipo();
     ClaseGenerica<String>objetoStr = new ClaseGenerica<>("Prueba");
     objetoStr.obtenerTipo();
    }
    
}
