/**
 * Esta clase permite realizar operaciones aritmeticas como sumar, restar,etc
 * 
 * @author: Marcelo Gutierrez
 * @version:1.0
 */
package ejemplojavadoc;

/**
 *
 * @author Marcelo
 */
public class Aritmetica {
    /**
     * Primera variable
     */
    int a ;
    /**
     * Segunda variable
     */
    int b;
    /**
     * Constructor vacio de la clase
     */
    Aritmetica(){
        
    }
    
    Aritmetica (int a, int b){
        this.a=a;
        this.b=b;
    }
    /**
     * Este metodo realiza la suma de las dos variables enteros
     * @return int el resultado de la suma
     */
    public int sumar(int a,int b){
        return a+b;
    }
    /**
     * Este metodo realiza la resta de las dos variables enteras
     * @return int el resultado de la resta
     *
     */
    public int restar(int a,int b){
        return a-b;
    }
    /**
     * Este metodo realiza la multiplicacion de los dos enteros
     * @return int el resultado de la multiplicacion
     */
    public int multiplicar(int a, int b){
        return a*b;
    }
    /** Este metodo realiza la division de los dos enteros
     * @return int el resultado de la division
     */
    public int dividir (int a, int b){
        return a/b;
    }
}


