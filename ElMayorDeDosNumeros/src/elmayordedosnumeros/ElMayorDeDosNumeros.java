/*
 *minutos para finalizar461 soluciones del estudiante
Solicitar al usuario dos valores:

numero1 (int)

numero2 (int)

Se debe imprimir el mayor de los dos números (la salida debe ser identica a la que sigue):

Proporciona el numero1:
Proporciona el numero2:
El numero mayor es:
<numeroMayor>
 * 
 * 
 */
package elmayordedosnumeros;

import java.util.Scanner;

/**
 *
 * @author Marcelo
 */
public class ElMayorDeDosNumeros {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println ("Ingrese el primer numero: ");
        int numero1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Ingrese el segundo numero: ");
        int numero2= Integer.parseInt(scanner.nextLine());
        
        if (numero1>numero2) {
                System.out.println ("El numero mayor es : "+numero1);
          } else {
            System.out.println ("El numero mayor es: "+ numero2);
        }        
    }
    
}
