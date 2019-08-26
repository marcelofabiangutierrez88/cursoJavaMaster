
package propiedadesdelsistema;
import java.util.*;
/**
 *
 * @author Marcelo
 */
public class PropiedadesDelSistema {

    public static void main(String[] args) {
        Properties propiedades = System.getProperties();
        Enumeration nombrePropiedades = propiedades.propertyNames();
        while(nombrePropiedades.hasMoreElements()){
            String nombrePropiedad = (String) nombrePropiedades.nextElement();
            String valorPropiedad = propiedades.getProperty(nombrePropiedad);
            System.out.println("Llave: "+nombrePropiedad +"="+valorPropiedad);
        }
        
    }
    
}
