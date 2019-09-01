
package manejopersonasjdbc;
import Datos.PersonaJDBC;
import domain.Persona;
import java.util.List;

/**
 *
 * @author Marcelo
 */
public class ManejoPersonasJDBC {

    
    public static void main(String[] args) {
        PersonaJDBC personasJDBC=new PersonaJDBC();
        //prueba del metodo insert
        //personasJDBC.insert("Ariana", "Fantini");
        
        //prueba del metodo update
        //personasJDBC.update(2,"nombre3","apellido3");
        
        //prueba del metodo delete
        personasJDBC.delete(5);
        
        //prueba del metodo select
        List<Persona> personas = personasJDBC.select();
        for(Persona persona: personas){
            System.out.println(persona);
            System.out.println("");
        }
     
    }
    
}
