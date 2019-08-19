
package conversionobjetos;

/**
 *
 * @author Marcelo
 */
public class Escritor extends Empleado {
    //utilizamos la enumeracion para las opciones de tipo de escritura
    
    final TipoEscritura tipoEscritura;
    
    public Escritor (String nombre, double sueldo, TipoEscritura tipoEscritura){
        super(nombre,sueldo);
        this.tipoEscritura = tipoEscritura;
    }
    public String obtenerDetalles(){
        return super.obtenerDetalles()+", tipo de escritura: "+tipoEscritura.getDescripcion();
    }
    public TipoEscritura getTipoEscritura(){
        return tipoEscritura;
    }
    public String getTipoEscrituraEnTexto(){
        return tipoEscritura.getDescripcion();
    }
}
