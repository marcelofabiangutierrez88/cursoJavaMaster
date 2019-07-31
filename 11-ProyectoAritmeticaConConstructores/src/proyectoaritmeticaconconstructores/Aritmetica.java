
package proyectoaritmeticaconconstructores;

/**
 *
 * @author Marcelo
 */
public class Aritmetica {
    //Atributos de la clase
    int a ;
    int b;
    
    //constructor vacio
    Aritmetica (){
        
    }
    // contructor con argumentos
    Aritmetica (int arg1, int arg2){
        a = arg1;
        b = arg2;
    }
    // este metodo suma los atributos de la clase
    
    int sumar (){
        return a+b;
    }
    
}
