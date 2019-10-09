
package beans;

/**
 *
 * @author marcelo
 */
public class Rectangulo {
    private int base;
    private int altura;

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
    * Agregando un metodo que no mapea con ninguna propiedad sino que
    * es el resultado de un calculo
    * 
    * @return int valor del area
    */ 
    
    public int getArea(){
        return this.base * this.altura;
    }
    
}
