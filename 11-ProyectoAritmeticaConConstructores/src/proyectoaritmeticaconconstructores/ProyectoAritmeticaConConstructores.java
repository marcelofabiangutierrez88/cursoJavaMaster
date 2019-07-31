
package proyectoaritmeticaconconstructores;

/**
 *
 * @author Marcelo
 */
public class ProyectoAritmeticaConConstructores {

    public static void main(String[] args) {
        // creamos un objeto de la clase aritmetica 
        Aritmetica objeto1 = new Aritmetica ();
        objeto1.a = 5;
        objeto1.b=10;
        int resultado = objeto1.sumar();
        System.out.println ("El resultado de la suma es : "+ resultado);
        
        // creamos un segundo objeto del tipo artimetica
        Aritmetica objeto2 = new Aritmetica (2,4);
            System.out.println ("El resultado de la suma del objeto 2 es : " + objeto2.sumar());
        
    }
    
}
