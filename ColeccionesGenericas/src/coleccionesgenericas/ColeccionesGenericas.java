
package coleccionesgenericas;
import java.util.*;

/**
 *
 * @author Marcelo
 */
public class ColeccionesGenericas {

    public static void main(String[] args) {
        List<String>miLista = new ArrayList();
        miLista.add("1");
        miLista.add("2");
        miLista.add("3");
        miLista.add("4");
        imprimir(miLista);
        
        Set<String>miSet = new HashSet<>();
        miSet.add("100");
        miSet.add("200");
        miSet.add("300");
        miSet.add("300");
        imprimir (miSet);
        
        Map<String, String>miMapa = new HashMap<>();
        miMapa.put("1","Marcelo");
        miMapa.put("2","Jazmin");
        miMapa.put("3","Dante");
        miMapa.put("4","JazDante");
        imprimir(miMapa.keySet());
        imprimir(miMapa.values());
            
    }
    static void imprimir(Collection<String> col){
      for(String elemento:col){
          System.out.println(elemento + " ");
      }
      System.out.println();
    }
    
}
