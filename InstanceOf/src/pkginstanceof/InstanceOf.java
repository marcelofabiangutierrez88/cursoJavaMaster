
package pkginstanceof;

/**
 *
 * @author Marcelo
 */
public class InstanceOf {

  
    public static void main(String[] args) {
        FiguraGeometrica figura;
        figura = new Elipse();
        FiguraGeometrica figura1;
        figura1= new Circulo();
        //determina solo el tipo que corresponde a la jerarquia
        determinaTipo(figura,figura1);
        
        // determina todos los tipos posibles
        System.out.println("\nTodos sus tipos: ");
        determinaTodosLosTipos(figura,figura1);
    }
    
    private static void determinaTodosLosTipos(FiguraGeometrica figura,FiguraGeometrica figura1){
        if (figura instanceof Elipse){
            //Procesa algo particular de una elipse
            System.out.println("Es un Elipse");
        }
        if(figura instanceof Circulo){
            //procesa algo en particular de un circulo
            System.out.println("Es un circulo");
        }
        if (figura instanceof FiguraGeometrica){
            //procesa algo en particular de una figura geometrica
            System.out.println("Es una figura geometrica");
        }
        if(figura instanceof Object){
            // procesa algo en particular  de la clase object
            System.out.println("Es un object");
        }else {
            System.out.println("No se encontro al tipo");
        }
    }
    
    private static void determinaTipo(FiguraGeometrica figura,FiguraGeometrica figura1){
        if(figura instanceof Elipse){
            //procesa algo en particular de una elipse
            System.out.println("es una elipse");
        }else if (figura instanceof Circulo){
            System.out.println("procesa algo en particular de un circulo");
        }else if (figura instanceof FiguraGeometrica){
            //procesa algo en particular de una figura geometrica
            System.out.println("Es una figura geometrica");
        }else if (figura instanceof Object){
            //procesa algo en particular de object
            System.out.println("Es un object");
        }else{
            System.out.println("No se encontro el tipo");
        }
    }
    
}
