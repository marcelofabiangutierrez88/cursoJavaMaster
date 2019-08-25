
package datos;
import excepciones.*;
/**
 *
 * @author Marcelo
 */
public class ImplementacionMySql implements AccesoDatos {
    private boolean simularError;

    @Override
    public void insertar() throws AccesoDatosEx {
        if (simularError){
            throw new EscrituraDatosEx("Error en la escritura de datos");
        } else {
            System.out.println("Insertar desde MySql");
        }
    }

    @Override
    public void listar() throws AccesoDatosEx {
      if (simularError){
          throw new LecturaDatosEx("Error en la lectura de datos");
      } else {
          System.out.println("Listar desde MySql");
      }
    }

    public boolean IsSimularError(){
        return simularError;
    }
    @Override
    public void simularError(boolean simularError) {
        this.simularError = simularError;
    }
    
}
