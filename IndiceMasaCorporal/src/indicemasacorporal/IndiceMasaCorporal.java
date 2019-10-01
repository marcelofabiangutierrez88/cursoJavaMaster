
package indicemasacorporal;

import java.util.Scanner;

/**
 *
 * @author marcelo
 */
public class IndiceMasaCorporal {

    public static void main(String[] args) {
         String nombre;
         double altura, peso;
         int edad;
        System.out.println("Tamaño: ");
        Scanner sc = new Scanner (System.in);
        int tamaño = sc.nextInt();
        
        Persona [] Personas = new Persona [tamaño];
        
        
        
        for (int i = 0; i<Personas.length;i++){
           Scanner leo = new Scanner (System.in) ;
            System.out.println("Nombre: ");
            nombre = leo.nextLine();
            System.out.println("Peso: ");
            peso = leo.nextDouble();
            System.out.println("Edad: ");
            edad = leo.nextInt();
            System.out.println("Altura: ");
            altura = leo.nextDouble();
            Personas [i] = new Persona(nombre, peso, altura);
            
        }
        
        
        for (int i = 0; i<Personas.length;i++){
            System.out.println("Nombre: " + Personas[i].getNombre() );
            System.out.println("Peso: " + Personas[i].getNombre());
            System.out.println("Altura: " + Personas[i].getAltura());
            System.out.println("IMC: ");
            double calculoMC;
            calculoMC = Personas[i].masaCorporal(Personas[i].getPeso(), Personas[i].getAltura());
            System.out.println(Personas[i].masaCorporal( Personas[i].getPeso(), Personas[i].getAltura()));       
            System.out.println("Comparativa: ");
            System.out.println(Personas[i].comparativa(calculoMC));
            }
       
    }
    
}
