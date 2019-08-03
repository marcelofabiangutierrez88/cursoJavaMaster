
package usodelapalabrathis;

/**
 *
 * @author Marcelo
 */
public class UsoDeLaPalabraThis {

    public static void main(String[] args) {
        Persona p = new Persona ("Juan");
    }
    
}
class Persona {
    String nombre;
    
Persona(String nombre){
    this.nombre = nombre; // this apunta a un objeto del tipo Persona
    
    //imprimr el objeto persona 
    Imprimir imprimir = new Imprimir ();
    imprimir.imprimir( this); //en este momento this contiene una referencia al objeto Persona
}
}

class Imprimir {
    public void imprimir (Persona p){
        System.out.println ("Impresion argumento: "+p); // valor del objeto persona recibido como argumento
        System.out.println("Objeto actual (this): "+this); // este operador this apunta al objeto imprimir
    }
}
