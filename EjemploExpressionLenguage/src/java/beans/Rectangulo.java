package beans;

/**
 *
 * @author marcelo
 */
public class Rectangulo {
    private int base = 5;
    private int altura =10;

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    
    /**
     * Metodo agregado que no mapea ninguna propiedad si no que es el resultado
     * de un calculo.
     */
    
    public int getArea(){
        return this.base*this.altura;
    }
    
}
