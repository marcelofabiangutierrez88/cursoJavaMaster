
package claseobject;

/**
 *
 * @author Marcelo
 */
public class ClaseObject {

   
    public static void main(String[] args) {
        Empleado emp1 = new Empleado ("Marcelo",2000);
        Empleado emp2 = new Empleado ("Marcelo", 20000);
        
        compararObjetos (emp1, emp2);
    }
    private static void compararObjetos (Empleado emp1, Empleado emp2){
        // llamada al metodo tostring 
        System.out.println("Contenido del objeto: "+emp1);
        System.out.println("Contenido del segundo objeto: "+emp2);
        
        //revision por diferencia
        if (emp1==emp2)
        System.out.println("Los objetos tienen la misma direccion de memoria");
        else
        System.out.println("Los objetos tienen diferente direccion de memoria");
        
        
        //revision por metodo equals 
        if(emp1.equals(emp2))
            System.out.println("Los objetos tienen el mismo contenido, son iguales");
        else
            System.out.println("Los objetos NO tienen el mismo contenido, NO son iguales");
        
        //revisamos el metodo hashcode
        if (emp1.hashCode()==emp2.hashCode())
            System.out.println("Los objetos tienen el mismo codigo hash");
        else
            System.out.println("Los objetos No tienen el mismo codigo hash");
}
}
