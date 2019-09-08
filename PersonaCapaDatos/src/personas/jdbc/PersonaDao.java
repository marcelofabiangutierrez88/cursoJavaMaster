package personas.jdbc;
import java.sql.SQLException;
import java.util.List;
import personas.dto.PersonaDTO;

/**
 *Esta interfaz contiene los metodos con las operaciones basicas
 * sobre la tabla Persona
 * CRUD(Create, Read, Update, Delete)
 * Se debe crear una clase concreta para implementar el codigo asociado al metodo
 * 
 * @author Marcelo
 */
public interface PersonaDao {
    public int insert (PersonaDTO persona) throws SQLException;
    public int update (PersonaDTO persona) throws SQLException;
    public int delete (PersonaDTO persona) throws SQLException;
    public List <PersonaDTO> select() throws SQLException;
    
}
