
package Datos;
import java.sql.*;

/**
 *
 * @author Marcelo
 */
public class Conexion {
    private static String JDBC_DRIVER = "com.mysql.jdbc.Driver";    
    private static String JDBC_URL = "jdbc:mysql://localhost/sga?useSSL=false";
    private static String JDBC_USER = "root";
    private static String JDBC_PASS = "admin";
    private static Driver driver = null;
    
    public static synchronized Connection getConexion()
            throws SQLException{
        if (driver == null){
            try{
                Class jdbcDriverClass = Class.forName(JDBC_DRIVER);
                driver = (Driver)jdbcDriverClass.newInstance();
                DriverManager.registerDriver(driver);
            }catch (Exception e){
                System.out.println("Fallo en cargar el driver JDBC");
                e.printStackTrace();
            }
        }
        return DriverManager.getConnection(JDBC_URL,JDBC_USER,JDBC_PASS);
    }
    public static void close(ResultSet rs){
        try{
            if(rs!=null){
                rs.close();
            }
        }catch (SQLException sqle){
            sqle.printStackTrace();
        }
    }
    public static void close (PreparedStatement stmt){
        try{
            if(stmt!=null){
                stmt.close();
            }
        }catch (SQLException sqle){
            sqle.printStackTrace();
        }
    }
    public static void close (Connection conn){
        try{
            if(conn!=null){
                conn.close();
            }
        }catch (SQLException sqle){
            sqle.printStackTrace();
        }
    }
}


