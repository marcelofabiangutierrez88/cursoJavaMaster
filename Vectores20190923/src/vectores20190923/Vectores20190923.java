
package vectores20190923;

import java.util.Scanner;

/**
 *
 * @author marcelo
 */
public class Vectores20190923 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int edad [] = new int[4];
        String nombre[]=new String [4];
        
        String nombreMayor, nombreMenor;
        int edadMayor, edadMenor, promedio, acumulador, mayorEdad, menorEdad;
        
        int i  = 0;
        System.out.println("Lectura de datos...");
        System.out.println("Nombre "+(i+1)+":");
        nombre[i]=entrada.nextLine();
        System.out.println("Edad: " );
        edad[i] = entrada.nextInt();
        
        nombreMayor = nombre[i];
        nombreMenor = nombre[i];
        edadMayor = edad [i];
        edadMenor = edad [i];
        mayorEdad =0;
        menorEdad = 0;
        
        
        for(i = 1; i< nombre.length;i++){
            entrada.nextLine();
            System.out.println("Nombre "+(i+1)+":");
            nombre[i] = entrada.nextLine();
            System.out.println("Edad:");
            edad[i]=entrada.nextInt();
            if (edad[i]>edadMayor){
              edadMayor = edad[i];
              nombreMayor = nombre[i];
            }
            if (edad[i]<edadMenor){
                edadMenor = edad [i];
                nombreMenor = nombre [i];
            }
            if (edad[i]>18){
                mayorEdad=mayorEdad+1;
            } else {
                menorEdad= menorEdad+1;
            }
                        
        }
        System.out.println("Nombre de mayor edad: " + nombreMayor);
        System.out.println("Edad: "+edadMayor);
        System.out.println("");
        System.out.println("Nombre de menor edad: " + nombreMenor);
        System.out.println("Edad: " + edadMenor);
        System.out.println("Mayores de edad son: "+mayorEdad);
        System.out.println("Menores de edad son : "+menorEdad);
        
        
    }
    
}
