
package clasesabstractas;

import abstracto.domain.*;

/**
 *
 * @author Marcelo
 */
public class ClasesAbstractas {

    
    public static void main(String[] args) {
        FiguraGeometrica rectangulo = new Rectangulo("Rectangulo");
        FiguraGeometrica triangulo = new Triangulo("Triangulo");
        FiguraGeometrica circulo = new Circulo("Circulo");
        
        System.out.println("\n"+rectangulo);
        rectangulo.dibujar();
        System.out.println("\n"+triangulo);
        triangulo.dibujar();
        System.out.println("\n"+circulo);
        circulo.dibujar();
        
        
        
    }
    
}
