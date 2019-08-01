
package pkg13.proyectocaja;

/**
 *
 * @author Marcelo
 */
public class ProyectoCaja {

    public static void main(String[] args) {
        int valorAncho =3;
        int valorAlto = 2;
        int valorProfundidad = 6;
        
        Caja calcularVolumen = new Caja (valorAncho,valorAlto,valorProfundidad);
        
        System.out.println("Calcular el volumen de una caja, imprimo los valores para el ejercicio: ");
        System.out.println("\nValor provisto para el Ancho = "+valorAncho);
        System.out.println("\nValor provisto para el Alto = "+valorAlto);
        System.out.println("\nValor provisto de la Profunidad = "+valorProfundidad);
        
        System.out.println("\nEl valor del volumen es = "+calcularVolumen.calcularVolumen());
                
        
    }
    
}
