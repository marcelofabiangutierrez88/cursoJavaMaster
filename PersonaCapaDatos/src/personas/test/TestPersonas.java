package personas.test;
import java.sql.SQLException;
import java.util.List;
import personas.dto.PersonaDTO;
import personas.jdbc.PersonaDao;
import personas.jdbc.PersonaDaoJDBC;
/**
 *
 * @author Marcelo
 */
public class TestPersonas {

    public static void main(String[] args) {
        //utilizando el tipo interface
        PersonaDao personaDao= new PersonaDaoJDBC();
        //se crea un nuevo registro
        //se usa la clase persona DTO la cual se usa para transferir
        //la informacion entre capas.
        
       // PersonaDTO persona = new PersonaDTO();
        //persona.setNombre("Prueba");
        //persona.setApellido("Apellido de prueba");
        try{
          //  personaDao.insert(persona);
             personaDao.delete(new PersonaDTO(8));
            //PersonaDTO personaTmp =new PersonaDTO();
            //personaTmp.setId_persona(1);
            //personaTmp.setNombre("Marcelo");
            //personaTmp.setApellido("Gutierrez");
            //personaDao.update(personaTmp);
            List<PersonaDTO> personas = personaDao.select();
            for (PersonaDTO personaDTO: personas){
                System.out.print(personaDTO);
                System.out.println();
            }
               
            }catch (SQLException e){
              System.out.println("Excepcion en la capa de prueba");
              e.printStackTrace();
        }
    }
    
}
