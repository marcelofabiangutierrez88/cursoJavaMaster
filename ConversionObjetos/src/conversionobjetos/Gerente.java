
package conversionobjetos;

/**
 *
 * @author Marcelo
 */
public class Gerente extends Empleado{
    private String departamento;
    
    public Gerente (String nombre, double sueldo, String departamento){
        super(nombre, sueldo);
        this.departamento = departamento;
    }
    
    // sobreescribimos el metodo de la clase padre 
    public String obtenerDetalles(){
        //con super traigo los atributos del metodo de la clase padre
        return super.obtenerDetalles()+ ", departamento: "+departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    
}
