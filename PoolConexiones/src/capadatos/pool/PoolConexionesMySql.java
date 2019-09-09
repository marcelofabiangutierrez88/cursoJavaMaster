package capadatos.pool;
import java.sql.*;
import javax.sql.DataSource;
import org.apache.commons.dbcp2.BasicDataSource;

/**
 *
 * @author Marcelo
 */
public class PoolConexionesMySql {
    public static DataSource getDataSource(){
        BasicDataSource ds = new BasicDataSource();
        ds.setDriverClassName("com.mysql.jdbc.Driver");
        ds.setUsername("root");
        ds.setPassword("admin");
        ds.setUrl("jdbc:mysql://localhost:3306/sga?useSLL=false");
        //se define el tamaño del pool de conexiones
        ds.setInitialSize(5); // 5 conexiones iniciales
        return ds;
    }
    public static Connection getConexion()throws SQLException{
        return getDataSource().getConnection();
    }
}
