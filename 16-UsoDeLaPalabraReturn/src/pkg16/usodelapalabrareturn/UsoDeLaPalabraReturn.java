
package pkg16.usodelapalabrareturn;

/**
 *
 * @author Marcelo
 */
public class UsoDeLaPalabraReturn {

    
    public static void main(String[] args) {
       Suma s = crearObjetoSuma ();
       int resultado = s.a + s.b;
       System.out.println("el resultado es: "+resultado);
        
    }
    
    public static Suma crearObjetoSuma (){
        Suma s = new Suma (3, 4);
        return s;
    }
    }

class Suma {
    int a, b;
Suma (int a, int b){
    this.a = a;
    this.b=b;
}
    
}
