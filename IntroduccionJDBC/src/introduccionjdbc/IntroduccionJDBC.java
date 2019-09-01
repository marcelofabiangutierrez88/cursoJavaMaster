
package introduccionjdbc;
import java.sql.*;

/**
 *
 * @author Marcelo
 */
public class IntroduccionJDBC {

   
    public static void main(String[] args) {
        //cadena de conexion mysql, el parametro de useSSL es opcional
        String url = "jdbc:mysql://localhost:3306/sga?useSSL=false";
        //cargamos el driver de mysql
        try{
            Class.forName("com.mysql.jdbc.Driver");
            //creamos un objeto de conexion
            Connection conexion = (Connection)DriverManager.getConnection(url,"root","admin");
            //creamos un objeto de tipo statement
            Statement instruccion = conexion.createStatement();
            //creamos el query
            String sql = "select id_persona, nombre, apellido from persona";
            ResultSet result = instruccion.executeQuery(sql);
            while(result.next()){
                System.out.println("ID: " + result.getInt(1));
                System.out.println("NOMBRE: "+result.getString(2));
                System.out.println("APELLIDO: "+result.getString(3));
            }
            result.close();
            instruccion.close();
            conexion.close();
        }catch (ClassNotFoundException | SQLException e){
            e.printStackTrace();
        }
    }
    
}
