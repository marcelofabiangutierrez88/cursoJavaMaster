
package foreach;

/**
 *
 * @author Marcelo
 */
public class ForEach {

  
    public static void main(String[] args) {
        Persona[] personas={new Persona("Marcelo"),new Persona("Jazmin")};
        
        for(Persona p:personas){
            String nombre = p.getNombre();
            System.out.println("Nombre Persona: "+nombre);
        }
        System.out.println("");
        int[] edades={15,20,35,50};
        for(int edad:edades){
            System.out.println("Edad:" +edad);
        }
    }
}

         
  

