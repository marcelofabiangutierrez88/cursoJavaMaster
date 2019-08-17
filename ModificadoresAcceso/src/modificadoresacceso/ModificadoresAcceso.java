package modificadoresacceso;
import paquete1.Clase2;
import paquete2.Clase3;
import paquete2.Clase4;

/**
 *
 * @author Marcelo
 */
public class ModificadoresAcceso {

 
    public static void main(String[] args) {
      // prueba de acceso a Clase1 desde otras clases
      //Acceso a Clase1 desde Clase2
      System.out.println("***Acceso desde Clase2 a Clase1 (mismo paquete)***");
      new Clase2().pruebaDesdeClase2();
      
      //acceso  a clase1 desde clase 2
      //clase 3 extiende desde clas1
      System.out.println("\n***Acceso desde Clase3 a Clase1(Diferente paquete, pero es subclase)***");
      new Clase3().pruebaDesdeClase3();
      
      //Acceso a clase1 desde clase4
      //clase4 NO es una subclase y esta en otro paquete
      System.out.println("\n***Acceso desde Clase4 a Clase1(Diferente paquete, no es subclase***");
      new Clase4().pruebaDesdeClase4();
              
    }
    
}
