package poolconexiones;
import capadatos.pool.PoolConexionesMySql;
import java.sql.*;

/**
 *
 * @author Marcelo
 */
public class TestPoolConexiones {

  
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try{
            //probando pool mysql y ejecutamos una consulta
            conn = PoolConexionesMySql.getConexion();
            System.out.println("Utilizando el pool de conexiones MySql");
            stmt = conn.prepareStatement ("SELECT * FROM persona");
            rs = stmt.executeQuery();
            while (rs.next()){
                System.out.println(" "+rs.getInt(1));
                System.out.println(" "+rs.getString(2));
                System.out.println(" "+rs.getString(3));
            }
             conn.close();

        }catch (SQLException ex){
        ex.printStackTrace();
    }
}
    
}
