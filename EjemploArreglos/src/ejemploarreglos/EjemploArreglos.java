
package ejemploarreglos;

/**
 *
 * @author Marcelo
 */
public class EjemploArreglos {

   
    public static void main(String[] args) {
        //1- Declaramos arreglo de tipo int
        int edades[];
        //2- Instanciamos el arreglo int
        edades=new int [3];
        //inicializamos los valores del arreglo
        edades[0]=30;
        edades[1]=15;
        edades[2]=20;
        //imprimirmos los valores de manera standart
        System.out.println("Arreglo de enteros indice 0: "+edades[0]);
        System.out.println("Arreglo de enteros indice 1: "+edades[1]);
        System.out.println("Arreglo de enteros indice 2: "+edades[2]);
        
        
        //declaramos un arreglo de tipo object
        
        Personas personas[];
        //instanciando...
        personas = new Personas[4];
        // inicializando valores
        personas[0]=new Personas("Marcelo");
        personas[1]=new Personas("Dante");
        personas[2]=new Personas ("Jazmin");
        //imprimimos valores del arreglo
        System.out.println("Arreglo de personas indice 0: "+personas[0]);
        System.out.println("Arreglo de personas indice 1: "+personas[1]);
        System.out.println("Arreglo de personas indice 2: "+personas[2]);
        System.out.println("Arreglo de personas indice 3: "+personas[3]);
        
        //Arreglo utilizando notacion simplificada
        
        String nombres[]={"Jose","Pedro","Tomas","Pancracio"};
        //imprimiendo arreglos utilizando for
        
        for (int i=0;i<nombres.length;i++){
            System.out.println("Arreglo String indice "+i+":"+nombres[i]);
        }

        
        
    }
    
}
