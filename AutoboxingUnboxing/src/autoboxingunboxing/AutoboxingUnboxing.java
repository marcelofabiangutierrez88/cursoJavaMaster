
package autoboxingunboxing;

/**
 *
 * @author Marcelo
 */
public class AutoboxingUnboxing {

  
    public static void main(String[] args) {
        //Autoboxing (se convierten a tipo primitivo tipos object)
        Integer enteroObj=10;
        Float flotanteObj=15.2F;
        Double doubleObj=40.1;
        System.out.println("Autoboxing");
        System.out.println("Entero obj: "+enteroObj.intValue());
        System.out.println("Flotante obj: "+flotanteObj.floatValue());
        System.out.println("Double obj: "+doubleObj.doubleValue());
        
        //Unboxing (se convierten tipos object a tipo primitivo)
        int entero=enteroObj;
        float flotante=flotanteObj;
        double doble=doubleObj;
        
        System.out.println("\nUnboxing");
        System.out.println("Entero:"+entero);
        System.out.println("Flotante: "+flotante);
        System.out.println("Double: "+doubleObj);

    }
    
}
