
package calculadoraentradadatos;
import java.util.*;
import static calculadoraentradadatos.Operaciones.*;

/**
 *
 * @author Marcelo
 */
public class CalculadoraEntradaDatos {
    public static void main(String[] args) {
        System.out.println("Proporciona el primer valor: ");
        Scanner scan = new Scanner (System.in);
        int a = scan.nextInt();
        System.out.println("Proporciona el segundo valor: ");
        int b = scan.nextInt();
        int resultado = sumar(a,b);
        System.out.println("El resultado de la suma es: "+resultado);
        int resultado1 = restar(a,b);
        System.out.println("El resultado de la resta es: "+resultado1);
        int resultado2 = multiplicar(a,b);
        System.out.println("El resultado de la multiplicacion es: "+resultado2);
        int resultado3= dividir (a,b);
        System.out.println("El resultado de la division es: "+resultado3);
    }
    
}
