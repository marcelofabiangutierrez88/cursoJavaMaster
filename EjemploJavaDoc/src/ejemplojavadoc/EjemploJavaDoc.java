/*
Derechos reservados MarceloGutierrez
*/
package ejemplojavadoc;

/**
 *Clase para probar el concepto de javadoc
 * @author Marcelo Gutierrez
 * @version 1.0
 */
public class EjemploJavaDoc {

    /**
     * Metodo que ejecuta la prueba de la clase aritmetica
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Creacion de objetos tipo aritmetica para las operaciones de sumar,restar,dividir y multiplicar
         */
        
        int resultadoSuma = new Aritmetica().sumar(4, 3);
        System.out.println("El resultado de la suma es: "+resultadoSuma);
        
        int resultadoResta = new Aritmetica().restar(10,6);
        System.out.println("El resultado de la resta es: "+resultadoResta);
        
        int resultadoDivision = new Aritmetica().dividir(25,5);
        System.out.println("El resultado de la division es: "+resultadoDivision);
        
        int resultadoMultiplicacion=new Aritmetica().multiplicar(40,4);
        System.out.println("El resultado de la multiplicacion es: "+resultadoMultiplicacion);
        
        
    }
    
}
