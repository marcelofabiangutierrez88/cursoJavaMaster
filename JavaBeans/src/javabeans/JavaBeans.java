
package javabeans;
import beans.PersonaBean;
/**
 *
 * @author Marcelo
 */
public class JavaBeans {

    public static void main(String[] args) {
        PersonaBean bean = new PersonaBean();
        bean.setNombre("Marcelo");
        bean.setEdad(31);
        
        System.out.println("Nombre: "+bean.getNombre());
        System.out.println("Edad: "+bean.getEdad());
     
    }
    
}
