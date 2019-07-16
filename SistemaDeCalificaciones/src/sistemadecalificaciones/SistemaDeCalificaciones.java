/*
El objetivo del ejercicio es crear un sistema de calificaciones, como sigue:

El usuario proporcionará un valor entre 0 y 10.

Si está entre 9 y 10: imprimir una A

Si está entre 8 y menor a 9: imprimir una B

Si está entre 7 y menor a 8: imprimir una C

Si está entre 6 y menor a 7: imprimir una D

Si está entre 0 y menor a 6: imprimir una F

cualquier otro valor debe imprimir: Valor desconocido

Por ejemplo:

Proporciona un valor entre 0 y 10: 10
A
 */
package sistemadecalificaciones;

import java.util.Scanner;

/**
 *
 * @author Marcelo
 */
public class SistemaDeCalificaciones {
   
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Proporcione un valor entre 0 y 10: ");
        int valor = Integer.parseInt(scanner.nextLine());

        
        if (valor>=9 && valor <=10){
            System.out.println("A");
        }else if (valor >=8 && valor <9){
            System.out.println("B");
        }else if (valor >=7 && valor <8){
            System.out.println("C");
        }else if (valor>=6 && valor<7){
            System.out.println("D");
        }else{
            System.out.println ("F");
        }
    
    }
    
}
