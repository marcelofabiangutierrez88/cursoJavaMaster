
package polimorfismo;

/**
 *
 * @author Marcelo
 */
public class Polimorfismo {

    public static void main(String[] args) {
        Empleado emp = new Empleado ("Marcelo",2000);
        System.out.println("**Imprimiendo desde clase padre***");
        imprimirDetalles(emp);
        
        Gerente ger = new Gerente ("Ricardo", 3000, "Marketing");
        System.out.println("**Imprimiendo desde clase hija***");        
        imprimirDetalles(ger);
        
        // Se puede ver que el tipo que recibe el metodo es del tipo padre(Empleado)
        //sin embargo al momento de ejecutar el metodo, se ejecuta el hijo(Gerente)
        // esto es polimorfismo, multiples formas pero en tiempo de ejecucion.
    }
    public static void imprimirDetalles(Empleado emp){
        System.out.println(emp.obtenerDetalles());
    }
}
