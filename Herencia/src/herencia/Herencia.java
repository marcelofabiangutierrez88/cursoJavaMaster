
package herencia;

import java.util.Date;

/**
 *
 * @author Marcelo
 */
public class Herencia {


    public static void main(String[] args) {
        Empleado empleado1=new Empleado ("Marcelo",25000);
        empleado1.setEdad(31);
        empleado1.setGenero('M');
        empleado1.setDireccion("conesa 5420, general san martin");
        System.out.println("empleado1: "+ empleado1);
        
        Empleado empleado2=new Empleado("Dante",30000);
        empleado1.setEdad(5);
        empleado1.setGenero('M');
        empleado1.setDireccion("Remedios 3029");
        System.out.println("empleado2: "+empleado2);
        
        System.out.println("");
        
        Cliente cliente1=new Cliente(new Date(),true);
        cliente1.setNombre("Ariana");
        cliente1.setEdad(39);
        cliente1.setGenero('F');
        cliente1.setDireccion("Remedios escalada de San Martin 3029");
        System.out.println("cliente1= "+cliente1);
        
        Cliente cliente2= new Cliente (new Date(),false);
        cliente2.setNombre("Jazmin");
        cliente2.setEdad(10);
        cliente2.setGenero('F');
        cliente2.setDireccion("Conesa 5420");
        System.out.println("cliente2 = "+ cliente2);
        
    }
    
}
