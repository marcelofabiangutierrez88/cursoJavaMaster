
package proyectoaritmeticaalcancedevariablesenjava;

/**
 *
 * @author Marcelo
 */
public class ProyectoAritmeticaAlcanceDeVariablesEnJava {

    
    public static void main(String[] args) {
        // variables locales 
        int operandoA = 6;
        int operandoB= 2;
        
        Aritmetica objeto1 = new Aritmetica (operandoA , operandoB);
        
        //imprimimos los valores de los operandos
        System.out.println ("OperandoA = "+ operandoA);
        System.out.println ("OperandoB = "+ operandoB);
        
        //imprimimos la suma
        System.out.println ("\nResultado de la suma: " + objeto1.sumar());
        System.out.println ("\nResultado de la resta: " + objeto1.restar());
        System.out.println("\nResultado de la multiplicacion: "+objeto1.multiplicar());
        System.out.println("\nResultado de la division: "+ objeto1.dividir());
    }
    
    
}
