/*
 Calculo de la estacion del año segun el mes provisto por el usuario. 
Teniendo en cuenta que si el mes esta entre el 12,1,2 es verano
entre 3,4,5 otoño
entre 6,7,8 primavera
entre 9,10,11 verano.
Si ingresa un mes incorrecto, se informa del error.
 */
package calcularestacionañoifelse;

import java.util.Scanner;

/**
 *
 * @author Marcelo
 */
public class CalcularEstacionAñoIfElse {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println ("Ingrese el mes del año correspondiente para saber la estacion: ");
        int mes = Integer.parseInt(scanner.nextLine());
        String estacion;
        if (mes==1||mes==2||mes==12){
            estacion="Verano";
        } else if (mes==3||mes==4||mes==5){
            estacion= "Otoño";
        }else if (mes==6||mes==7||mes==8){
            estacion = "Invierno";
        } else if (mes==9||mes==10||mes==11){
            estacion ="Primavera";
        } else {
            estacion ="El mes es incorrecto, seleccione un mes correspondiente desde el 1 hasta el 12";
        }
        System.out.println("La estacion del año es :" + estacion);
    }
    
}
