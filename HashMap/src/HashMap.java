import java.util.*;

public class ProbandoHashMap {

	public static void main(String[] args) {
	HashMap<String, Float> listaProductos = new HashMap(); 	 
	Scanner sc = new Scanner (System.in);
	int opcionElegida = 0;
	float precio;
	String codigo;
	
	public static void guardarProducto (String codigo , float precio, HashMap<String,Float> listaProductos) {
		if (listaProductos.containsKey(codigo)) {
			System.out.println("No se puede ingresar un producto con el mismo codigo...");
		} else {
			listaProductos.put (codigo, precio);
			
		}
	}
	
	while (opcionElegida != 5) {
		System.out.println("Ingresa el nro de la opcion que desees: ");
		System.out.println(" 1 - Introducir un producto: ");
		System.out.println(" 2 - Modificar el precio: ");
		System.out.println(" 3 - Mostrar todos los productos: ");
		System.out.println(" 4- Eliminar un producto: ");
		System.out.println(" 5 - Salir: ");
		opcionElegida = sc.nextInt();
		
		switch (opcionElegida) {
		case 1 :
			System.out.println("Ingresa el codigo del producto: ");
			codigo = sc.next();
			System.out.println("Ingresa el precio del producto: ");
			precio = sc.nextFloat();
			guardarProducto(codigo, precio,listaProductos);
			break;
		case 2:
			System.out.println("Introduce el codigo del producto que deseas cambiar el precio: ");
			codigo = sc.next();
			modicarPrecio(codigo, listaProductos);
			break;
		case 3:
			 mostrarProducto(listaProductos);
			 break;
		case 4 :
			System.out.println("Introduce el codigo del producto que deseas elminar: ");
			codigo = sc.next();
			eliminarProducto(listaProductos);
			break;
		case 5 :
			break;
			
		default:
			System.out.println("Debes ingresar una opcion valida, intenta otra vez... \n");
			System.out.println("Ingresa el nro de la opcion que desees: ");
		}
		
		
		
		public static void modificarPrecio(String codigo, HashMap<String,Float> listaProductos){
		    Scanner sc = new Scanner(System.in);
		    if (listaProductos.containsKey(codigo)) {
		        System.out.println("Introduce el precio del producto:");
		        listaProductos.put(codigo, sc.nextFloat());            
		    } else {
		        System.out.println("No hay ningun producto con ese código.");
		    }
		}
		

		public static void mostrarProductos(HashMap <String, Float> listaProductos) {
		    String clave;
		    Iterator<String> productos = listaProductos.keySet().iterator();
		    System.out.println("Hay los siguientes productos:");
		    while(productos.hasNext()){
		        clave = productos.next();
		        System.out.println(clave + " - " + listaProductos.get(clave));
		    }        
		}
		
		public static void eliminarProducto(String codigo, HashMap<String,Float> listaProductos) {
		    if (listaProductos.containsKey(codigo)) {
		        listaProductos.remove(codigo);
		    } else {
		        System.out.println("No hay ningun producto con ese código.");  
		    }       
		} 
		
		
		
	}
	
		
		
	}
}
