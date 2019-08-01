
package pkg13.proyectocaja;

/**
 *
 * @author Marcelo
 */
public class Caja {
    int ancho;
    int alto;
    int profundidad;
    
    Caja (){
        
    }
    Caja (int ancho, int alto, int profundidad){
        this.ancho=ancho;
        this.alto =alto;
        this.profundidad=profundidad;
    }
    int calcularVolumen (){
    return ancho*alto*profundidad;
}
}
