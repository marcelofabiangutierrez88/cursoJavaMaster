
package abstracto.domain;

/**
 *
 * @author Marcelo
 */
public class Rectangulo extends FiguraGeometrica{
    public Rectangulo (String tipoFigura){
        super(tipoFigura);
    }
    public void dibujar(){
        System.out.println("Aqui se deberia dibujar un: "+this.getClass().getSimpleName());
    }
    
    
}
