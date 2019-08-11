
package bloquecodigo;

/**
 *
 * @author Marcelo
 */
public class Persona {
    private final int idPersona;
    private static int contadorPersonas;
    
    static{
        //inicializamos el idpersona con valor 10
        contadorPersonas=10;
        System.out.println("Ejecuta bloque estatico");
    }
    
    {
        System.out.println("Ejecuta bloque inicializador");
        idPersona=++contadorPersonas;
    }
    Persona(){
        System.out.println("Ejecuta constructor");
    }
    public int getIdPersona(){
        return idPersona;
    }
}
