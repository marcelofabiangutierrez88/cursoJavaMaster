
package paquete1;

/**
 *
 * @author Marcelo
 */
public class Clase2 {
    public Clase2(){
    // prueba de constructores
    System.out.println("");
    //constructor publico
    new Clase1(1);
    //constructor protegido
    new Clase1(1,2);
    //constructor default o package
    new Clase1(1,2,3);
    //constructor private
    //new Clase1(1,2,3,4);
    System.out.println("Constructor Private: Acceso denegado");
 
}

public void pruebaDesdeClase2(){
//acceso a clase1 desde clase2
Clase1 c1 = new Clase1();
System.out.println("");
System.out.println("Atributo publico: "+c1.atrPublico);
System.out.println("Atributo protegido: "+c1.atrProtegido);
System.out.println("Atributo default: "+c1.atrPaquete);
System.out.println("Atributo private: Acceso denegado");

System.out.println("");
System.out.println("Metodo publico: "+c1.metodoPublico());
System.out.println("Metodo protegido: "+c1.metodoProtegido());
System.out.println("Metodo default: "+c1.metodoPaquete());
System.out.println("Metodo private: Acceso denegado");



}

}