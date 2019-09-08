
package manejopersonasjdbc;

import Datos.Conexion;
import Datos.PersonaJDBC;
import domain.Persona;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Marcelo
 */
public class ManejoPersonasJDBC {

    
    public static void main(String[] args) {
        PersonaJDBC personasJDBC=new PersonaJDBC();
        //Objeto creacion ,  se va a compartir para todos los queries
        Connection conn = null;
        try{
            conn = Conexion.getConexion();
            if (conn.getAutoCommit()){
                conn.setAutoCommit(false); // la transaccion no se guarda de manera automatica
            }
            PersonaJDBC personas = new PersonaJDBC(conn);
            // se empiezan a ejecutar sentencias
            //recordar que una transaccion agrupa varias sentencias SQL
            //si algo falla no se guardan los cambios en la BD
            
            //cambio correcto
            personas.update(1, "Prueba1", "PruebaApellido");
            
            // cambio incorrecto se superan los 45 caracteres dados en la BD
            //personas.insert("Fausto", "12345678913245678912345678912345678912345678915326548792132");
            //guardando cambios
            conn.commit();
        }catch (SQLException e){
            //Hacemos rollback en caso de error
        try {
            System.out.println("Entramos en rollback");
            e.printStackTrace(System.out);
            conn.rollback();
        }catch (SQLException e1){
            e1.printStackTrace(System.out);
        }
       
        }
     
    }
    
}
