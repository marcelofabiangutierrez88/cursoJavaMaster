
package ejemplovarargs;

/**
 *
 * @author Marcelo
 */
public class EjemploVarargs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      //Imprimimos varios numeros
      imprimirNumeros(15,20,3,61,75,18,10);
      
      System.out.println();
      imprimirNumerosForEach(15,20,3,61,75,18,10);
      
      System.out.println();
      variosParametros("Marcelo", true, 15,20,14);
      
    }
    public static void imprimirNumeros(int...numeros){
        //recorremos cada elementos
        int elemento;
        for (int i=0;i<numeros.length;i++){
            elemento=numeros[i];
            System.out.print("Elemento"+ i + " : " +elemento);
        }
    }
    public static void imprimirNumerosForEach(int...numeros){
        // usamos un foreach en lugar de un for normal
        for(int numero:numeros){
            System.out.println("El numero es: "+numero);
                    
        }
    }
    public static void variosParametros (String nombre, boolean valido, int...numeros){
        System.out.println("Nombre: "+nombre);
        System.out.println("Valido: "+valido);
        
        //usando foreach
        for(int numero:numeros){
            System.out.println("El numero es: "+numero);
        }
    }
}
