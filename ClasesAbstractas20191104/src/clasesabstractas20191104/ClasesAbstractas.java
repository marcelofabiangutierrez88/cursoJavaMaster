package clasesabstractas20191104;

/**
 *
 * @author marce
 */
public class ClasesAbstractas {
    public static void main(String[] args) {
      
        Figura fi = new Triangulo (8,4);
        fi.area();
        fi.tipo();
        
        Figura fi2 = new Circulo (2);
        fi2.area();
        fi2.tipo();
    }
    
}
