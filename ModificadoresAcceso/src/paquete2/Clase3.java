package paquete2;
import paquete1.Clase1;
/**
 *
 * @author Marcelo
 */
public class Clase3 extends Clase1 {
    public Clase3(){
        // constructor protegido al ser una subclase puede acceder
        //aunque este en otro paquete   
        super (1,2);
        //Acceso package, y al estar fuera de paquetes esta restringido
        //super(1,2,3)
        //acceso privado , restringido
        //super(1,2,3,4)
        //
    }
    public void pruebaDesdeClase3(){
        //Acceso a Clase1 desde Clase2
        //Clase 3 extiende de Clase 1
        Clase1 c1 = new Clase1();
        System.out.println("");
        System.out.println("Atributo publico: "+c1.atrPublico+ " o heredado"+ atrPublico);
        System.out.println("Atributo protegido ( heredado ): "+metodoProtegido());
        System.out.println("Atributo default: No se puede acceder desde un paquete externo");
        System.out.println("Atributo private: Acceso denegado");
        
        // constructor publico
        
        new Clase3();
            // los demas constructores no se puede probar asi, si no desde el constructor de esta clase
            //Ya que es una subclase de otro paquete
            
        System.out.println("");
        System.out.println("Metodo publico: "+c1.atrPublico);
        System.out.println("Metodo protegido (heredado) : "+metodoProtegido());
        System.out.println("Metodo default: No se puede acceder desde un paquete externo");
        System.out.println("Metodo private: Acceso denegado");
        
            
        
        
    }
    
    
}
