
package manejocolecciones;
import java.util.*;
/**
 *
 * @author Marcelo
 */
public class ManejoColecciones {

    public static void main(String[] args) {
      List miLista = new ArrayList();
      miLista.add("1");
      miLista.add("2");
      miLista.add("3");
      miLista.add("4");
      //Elemento repetido
      miLista.add("4");
      imprimir(miLista);
      
      Set miSet = new HashSet();
      miSet.add("100");
      miSet.add("200");
      miSet.add("300");
      miSet.add("400");
      // no permite elementos duplicados, los ignora
      miSet.add("400");
      imprimir(miSet);
      
      Map miMapa = new HashMap();
      //llave , valor
      miMapa.put("1", "Marcelo");
      miMapa.put("2","Jazmin");
      miMapa.put("3", "Dante");
      miMapa.put("4", "Dante-Jazmin");
      //se imprimen todas las llaves
      imprimir(miMapa.keySet());
      // se imprimen todos los valores
      imprimir(miMapa.values());
    }
    private static void imprimir (Collection coleccion){
        for(Object elemento : coleccion){
            System.out.println(elemento + "");
        }
        System.out.println("");
    }
}
