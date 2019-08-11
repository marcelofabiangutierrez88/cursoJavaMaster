
package usodeenumeraciones;

/**
 *
 * @author Marcelo
 */
public enum Continentes {
    AFRICA(53),
    EUROPA(46),
    ASIA(44),
    AMERICA(34),
    OCEANIA(14);
    
    //atributos de cada elemento de una enumeracion
    private final int paises;
    
    //constructor de cada elemento de la enumeracion
    Continentes (int paises){
        this.paises=paises;
    }
    public int getPaises(){
        return paises;
    }
}
