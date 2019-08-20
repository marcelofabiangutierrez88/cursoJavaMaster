
package abstracto.domain;

/**
 *
 * @author Marcelo
 */
public abstract class FiguraGeometrica {
    protected String tipoFigura;
    
    protected FiguraGeometrica (String tipoFigura){
        this.tipoFigura = tipoFigura;
    }
    public abstract void dibujar();
    
    public String getTipoFigura(){
        return tipoFigura;
    }
    public void setTipoFigura(String tipoFigura){
        this.tipoFigura = tipoFigura;
    }
    public String toString (){
        return "Tipo figura: "+this.tipoFigura;
    }
    
}
