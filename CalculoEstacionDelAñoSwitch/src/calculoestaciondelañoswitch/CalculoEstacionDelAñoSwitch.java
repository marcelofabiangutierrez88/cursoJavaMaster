/*
 Calculo de la estacion del año segun el mes provisto por el usuario. 
Teniendo en cuenta que si el mes esta entre el 12,1,2 es verano
entre 3,4,5 otoño
entre 6,7,8 primavera
entre 9,10,11 verano.
Si ingresa un mes incorrecto, se informa del error.
Utilizando Switch
 */
package calculoestaciondelañoswitch;

import java.util.Scanner;

/**
 *
 * @author Marcelo
 */
public class CalculoEstacionDelAñoSwitch {

  
    public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);
    System.out.println (" Eliga el mes para saber en que estacion se encuentra : ");
    int mes = Integer.parseInt(scanner.nextLine());
    String estacion;
    
    switch (mes){
        case 1 : case 2 : case 12 :
            estacion = "Verano";
        break;
        case 3: case 4: case 5 :
            estacion="Otoño";
            break;
        case 6: case 7 : case 8 :
            estacion = "Invierno";
            break;
        case 9: case 10: case 11:
            estacion = "Primavera";
            break;
        default : 
            estacion = "El mes seleccionado no es correcto";
    }
        System.out.println (" la estacion es : "+ " "+ estacion);
    }
    
}
