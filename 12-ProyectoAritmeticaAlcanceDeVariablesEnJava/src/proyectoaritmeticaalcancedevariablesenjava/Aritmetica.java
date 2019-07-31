
package proyectoaritmeticaalcancedevariablesenjava;

/**
 *
 * @author Marcelo
 */
public class Aritmetica {
    int a;
    int b;
    
    //constructor vacio
    Aritmetica (){
        
    }
    //constructor con 2 argumentos
    Aritmetica (int a, int b){
        this.a = a;
        this.b = b;
    }
    
    int sumar (){
        return a+b;
    }
    int restar (){
        return a-b;
    }
    int multiplicar (){
        return a*b;
    }
    int dividir (){
        return a/b;
    }
}
