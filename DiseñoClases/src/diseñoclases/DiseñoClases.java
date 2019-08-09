
package diseñoclases;


/**
 *
 * @author Marcelo
 */
public class DiseñoClases {

    public static void main(String[] args) {
        //creamos objetos tipo producto
        Producto producto1=new Producto("camisa",50); 
        Producto producto2=new Producto("pantalon",100);
        
        //creamos un objeto tipo orden
        Orden orden1=new Orden();
        
        //agregamos los productos a la orden
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        
        //imprimimos la orden
        orden1.mostrarOrden();
    }
    
}
