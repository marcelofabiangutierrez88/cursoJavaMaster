package clasesabstractas20191104;

/**
 *
 * @author marce
 */
public class Circulo extends Figura {
    private int radio;

    public Circulo(int radio) {
        this.radio = radio;
    }
    
    @Override
    public double area() {
       double pi = 3.14;
       double resultado = pi * radio * radio;
       System.out.println("El area es: "+resultado);
       return resultado;
    }

    @Override
    public void tipo() {
       System.out.println("Esta figura es un circulo");
    }
    
}
