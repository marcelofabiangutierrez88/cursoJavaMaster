
package paquete2;
import paquete1.Clase1;

/**
 *
 * @author Marcelo
 */
public class Clase4 {
    public Clase4(){
        // constructor protegido, restringido al no ser una subclase
        //super(1,2)
        //acceso Package y al estar fuera de un paquete esta restringido
        //super(1,2,3)
        //Acceso private, restringido
        //super(1,2,3,4)
    }
    
    public void pruebaDesdeClase4(){
        //Acceso a clase1 desde clase Clase4
        //Clase4 no es subclase y esta en otro paquete
        Clase1 c1 = new Clase1();
        System.out.println("");
        System.out.println("Atributo publico: "+c1.atrPublico);
        System.out.println("Atributo protegido: no se puede acceder desde un paquete externo al NO ser una subclase ");
        System.out.println("Atributo default: no se puede acceder desde un paquete externo");
        System.out.println("Atributo private: Acceso denegado");
        
        // constructor publico
        new Clase1();
        //los demas constructores estan restringidos
        
        System.out.println("");
        System.out.println("Metodo publico: "+c1.atrPublico);
        System.out.println("Metodo protegido: no se puede acceder desde un paquete externo al NO ser una subclase");
        System.out.println("Metodo default: no se puede acceder desde un paquete externo");
        System.out.println("Metodo protegido: Acceso denegado");
        
    }
    
}
