
package sobreescritura;

/**
 *
 * @author Marcelo
 */
public class Sobreescritura {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Marcelo", 15000);
        System.out.println("Metodo de la clase padre: "+empleado.obtenerDetalles());
        
        Gerente gerente = new Gerente ("Ricardo",50000,"Sistemas");
        System.out.println("Metodo Sobreescrito = " + gerente.obtenerDetalles());
    }
    
}
