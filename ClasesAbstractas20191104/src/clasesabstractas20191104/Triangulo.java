package clasesabstractas20191104;

/**
 *
 * @author marce
 */
public class Triangulo extends Figura {
    private int base;
    private int altura;

    public Triangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    @Override
    public double area() {
        int result = base*altura/2;
        System.out.println("El area es: "+result);
        return result;
    }
    @Override
    public void tipo() {
        System.out.println("Esta figura es un triangulo");
    }
    
    
    
}
