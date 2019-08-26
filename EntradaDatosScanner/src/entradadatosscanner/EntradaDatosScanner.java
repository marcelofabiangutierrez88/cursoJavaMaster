
package entradadatosscanner;
import java.util.*;
/**
 *
 * @author Marcelo
 */
public class EntradaDatosScanner {

    public static void main(String[] args) {
        String captura = null;
        Scanner scan = new Scanner (System.in);
        System.out.println("Introduce un dato: ");
        captura = scan.nextLine();
        while (captura!=null){
            System.out.println("Dato Introducido: "+captura);
            captura = scan.nextLine();
        }
        
    }
    
}
