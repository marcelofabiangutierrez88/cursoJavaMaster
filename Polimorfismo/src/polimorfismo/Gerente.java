
package polimorfismo;

/**
 *
 * @author Marcelo
 */
public class Gerente extends Empleado{
    private String departamento;
    
    //contructor con argumentos, se usa super para traer los argumentos de la clase padre
    
    public Gerente (String nombre, double sueldo, String departamento){
        super(nombre, sueldo);
        this.departamento = departamento;
    }
    
    //sobreescritura de metodo heredado
    
    public String obtenerDetalles(){
        // Para no repetir codigo podemos utilizar
        // el metodo del padre y solo agregar este metodo al hijo
        //esto es invocar un metodo sobreescrito
        return super.obtenerDetalles() + ", departamento: "+departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
}
