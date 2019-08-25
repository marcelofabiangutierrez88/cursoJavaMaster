
package manejodeexcepciones1;
import domain.*;
/**
 *
 * @author Marcelo
 */
public class ManejoDeExcepciones1 {

    
    public static void main(String[] args) {
        try {
            Division division = new Division (10,0);
            division.visualizarOperacion();
            } catch (OperationException oe){
                System.out.println("Ocurrio un error !!!"); 
                oe.printStackTrace();
            }
     
        
    }
    
}
