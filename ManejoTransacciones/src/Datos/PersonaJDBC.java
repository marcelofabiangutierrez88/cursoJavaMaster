
package Datos;
import domain.Persona;
import java.sql.*;
import java .util.*;

/**
 *
 * @author Marcelo
 */
public class PersonaJDBC {
    //nos apoyamos de la llave primaria autoincrementable de mysql
    //por lo que se omite el campo persona_id
    //se utiliza un preparedstatement, por lo que podemos
    //utilizar parametros (signos ?)
    private java.sql.Connection userConn;
    
    private final String SQL_INSERT ="INSERT INTO persona(nombre, apellido) VALUES (?,?)";
    
    private final String SQL_UPDATE ="UPDATE persona SET nombre=?, apellido=?, WHERE id_persona=?";
    
    private final String SQL_DELETE="DELETE FROM persona WHERE id_persona=?";
    
    private final String SQL_SELECT="SELECT id_persona,nombre,apellido FROM persona ORDER BY id_persona";
    
    public PersonaJDBC(){
        
    }
    public PersonaJDBC(Connection conn){
        this.userConn = userConn;
    }
    
    public int insert(String nombre, String apellido) throws SQLException{
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;       
        int rows=0;
        try{
            conn = (this.userConn!=null)?this.userConn:Conexion.getConexion();
            stmt=conn.prepareStatement(SQL_INSERT);
            int index = 1; // contador de columnas
            stmt.setString(index++, nombre); //param 1=>?
            stmt.setString(index++, apellido); //param 2=>?
            System.out.println("Ejecutando Query:"+SQL_INSERT);
            rows = stmt.executeUpdate();//nro de registos afectados
            System.out.println("Registos afectados:"+rows); 
        }finally{
            Conexion.close(stmt);
            if (this.userConn == null){
                Conexion.close(conn);
            }
        }
        return rows;
    }
    public int update(int id_persona, String nombre, String apellido)throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try{
            conn = (this.userConn!=null)? this.userConn:Conexion.getConexion(); 
            System.out.println("Ejecutando Query: "+SQL_UPDATE);
            stmt = conn.prepareStatement(SQL_UPDATE);
            int index = 1;
            stmt.setString(index++, nombre);
            stmt.setString(index++, apellido);
            stmt.setInt(index,id_persona);
            rows=stmt.executeUpdate();
            System.out.println("Registros actualizados: "+rows);
        }finally{
            Conexion.close(stmt);
            if(this.userConn ==null){
                Conexion.close(conn);
            }
        }
        return rows;
    }
    public int delete(int id_persona) throws SQLException{
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try{
            conn=(this.userConn !=null) ? this.userConn: Conexion.getConexion() ;
            System.out.println("Ejecutando Query: "+SQL_DELETE);
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, id_persona);
            rows = stmt.executeUpdate();
            System.out.println("Registros Eliminados: "+rows);
        }finally{
            Conexion.close(stmt);
            if(this.userConn == null){
                Conexion.close(conn);
            }
        }
        return rows;
    }
    public List<Persona> select() throws SQLException{
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Persona persona = null;
        List <Persona> personas = new ArrayList<Persona>();
        try{
            conn = (this.userConn!=null)?this.userConn : Conexion.getConexion();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs =stmt.executeQuery();
            while(rs.next()){
                int id_persona =rs.getInt(1);
                String nombre= rs.getString(2);
                String apellido = rs.getString(3);
                persona =new Persona();
                persona.setId_persona(id_persona);
                persona.setNombre(nombre);
                persona.setApellido(apellido);
                personas.add(persona);
            }
        }finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            if (this.userConn == null){
                Conexion.close(conn);
            }
        }
        return personas;
    }
    
}
