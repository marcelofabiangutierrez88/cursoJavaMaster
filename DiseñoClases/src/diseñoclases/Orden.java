/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diseñoclases;

/**
 *
 * @author Marcelo
 */
public class Orden {
    private int idOrden;
    private Producto productos[];
    private static int contadorOrdenes;
    private int contadorProductos;
    private static final int MAX_PRODUCTOS = 10;
    
    public Orden(){
    this.idOrden = ++contadorOrdenes;
    productos = new Producto[MAX_PRODUCTOS];
 
}
    public void agregarProducto (Producto producto){
        //si los productos agregados no superan el maximo de productos 
        //agregamos el nuevo producto al arreglo
        if (contadorProductos < MAX_PRODUCTOS){
            //agregamos el nuevo producto incrementamos el contador
            productos[contadorProductos++] = producto;
        }
        else {
            System.out.println("Se ha superado la cantidad maxima de productos "+MAX_PRODUCTOS);
        }
    }
    public double calcularTotal(){
        double total = 0;
        for(int i=0;i<contadorProductos;i++){
            total +=productos[i].getPrecio();
        }
        return total;
    }
    public void mostrarOrden(){
        System.out.println("Orden #: "+idOrden);
        System.out.println("Total de la orden:$ "+calcularTotal());
        System.out.println("Productos en la orden: ");
        for (int i=0;i<contadorProductos;i++){
            System.out.println(productos[i]);
            
        }
    }

}
