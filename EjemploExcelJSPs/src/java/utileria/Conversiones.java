 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utileria;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author marce
 */
public class Conversiones {
    private static final String FORMATO_FECHA = "dd-MM-yyyy";
    
    /**
     * Metodo que permite convertir una fecha en una cadena 
     * con un formato especificado 
     * @param fecha 
     * @return 
     */
    
    public static String format (Date fecha){
        SimpleDateFormat formateador = new SimpleDateFormat (FORMATO_FECHA);
        return formateador.format(fecha);
    }
    
}
