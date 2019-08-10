
package matrices;

/**
 *
 * @author Marcelo
 */
public class Matrices {

    public static void main(String[] args) {
        //1 declaramos matriz tipo enteros
        int edades[][];
        //2 instanciamos la matriz
        edades =new int [3][2];
        //3 declaramos los valores de la matrix
        edades[0][0]=30;
        edades[0][1]=15;
        edades[1][0]=20;
        edades[1][1]=45;
        edades[2][0]=5;
        edades[2][1]=38;
        
        //4 imprimimos valores
        System.out.println("Matriz enteros indice 0 0: " +edades[0][0]);
        System.out.println("Matriz enteros indice 0 1: " +edades[0][1]);
        System.out.println("Matriz enteros indice 1 0: " +edades[1][0]);
        System.out.println("Matriz enteros indice 1 1: " +edades[1][1]);
        System.out.println("Matriz enteros indice 2 0: " +edades[2][0]);
        System.out.println("Matriz enteros indice 2 1: " +edades[2][1]);
        
        //declaramos e instanciamos una matiz de tipo object
        Persona personas[][]=new Persona[1][2];
        //asignamos valores a la matriz
        personas[0][0]=new Persona ("Marcelo");
        personas[0][1]=new Persona ("Jazmin");
        //imprimimos los valores
        System.out.println("Matriz personas indice 0 0: "+personas[0][0]);
        System.out.println("Matriz personas indice 0 1: "+personas[0][1]);
        
        //recorremos matriz con un ciclo for anidado
        System.out.println();
        for(int i=0;i<personas.length;i++){
            for (int j=0;j<personas[i].length;j++){
                System.out.println("Matriz de personas indice: "+ i + " - "+j+ " : "+personas[i][j]);
            }
        }
        

    }
    
}
