
package ejerciciolibro;
import java.util.Scanner;

/**
 *
 * @author Marcelo
 */
public class EjercicioLibro {
  
    public static void main(String[] args) {
    


// Ejercicio libro. Pide al usuario proporcionar el nombre, id, precio, simbolo de la moneda y si el envio es gratuito.
// Respetando cada tipo de variable a asignar y su conversion para poder solicitarla al usuario.
//pide la impresion de : titulo del libro + id
//impresion de precio con su simbolo
//impresion si el envio es gratuito o no (boolean )
 
     
     
     Scanner scanner =  new Scanner (System.in);
     System.out.println("Proporciona el nombre: ");
     String nombre = scanner.nextLine();
     System.out.println ("Proporciona el ID : ");
     int idLibro = Integer.parseInt(scanner.nextLine());
     System.out.println ("Proporciona el precio: ");
     double precio = Double.parseDouble(scanner.nextLine());
     System.out.println ("Proporciona el Simbolo");
     char simbolo = scanner.nextLine().charAt(0);
     System.out.println ("Proporciona el envio Gratuito: ");
     boolean envioGratuito = Boolean.parseBoolean(scanner.nextLine());
     
     System.out.println (nombre +"#"+idLibro);
     System.out.println("Precio : " +precio+simbolo+precio);
     System.out.println("Envio Gratuito: " +envioGratuito);
     
 
     
    }
    
}

