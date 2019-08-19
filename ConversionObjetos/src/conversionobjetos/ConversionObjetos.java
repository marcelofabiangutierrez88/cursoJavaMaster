
package conversionobjetos;

/**
 *
 * @author Marcelo
 */
public class ConversionObjetos {

   
    public static void main(String[] args) {
        // 1 creamos un tipo de la clase de mas alta jerarquia
        Empleado empleado;
        //esto es upcasting, no hay necesidad de una notacion especial
        empleado = new Escritor ("Marcelo", 15000,TipoEscritura.CLASICO);
        
        imprimirDetalles(empleado);
        
        // 2 podemos hacer lo mismo con la clase gerente
        //upcasting
        empleado = new Gerente ("Dante", 18000,"Sistemas");
        
        imprimirDetalles(empleado);
    }
    private static void imprimirDetalles(Empleado empleado){
        String resultado = null;
        //imprimir detalles es general por polimorfismo
        System.out.println("\nDetalle: "+empleado.obtenerDetalles());
        
        //pero los detalles de cada clase necesitan un upcasting
        if( empleado instanceof Escritor){
            // convierte el objeto downcasting
            Escritor escritor = (Escritor)empleado;
            //Podemos acceder a los metodos de la clase escritor
            resultado = ((Escritor)empleado).tipoEscritura.getDescripcion();
            
            System.out.println("Resultado tipoEscritura: "+resultado);
            
        }else if( empleado instanceof Gerente){
            //hacemos downcasting en la misma linea de codigo
            resultado = ((Gerente) empleado).getDepartamento();
            
            System.out.println("resultado departamento: "+resultado);
        }
    }
    
}
