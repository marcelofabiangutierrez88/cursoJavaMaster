
package proyectoaritmetica;

/**
 *
 * @author Marcelo
 */
public class ProyectoAritmetica {

    
    public static void main(String[] args) {
        //creamos objeto de la clase artimetica
        Aritmetica sumando = new Aritmetica ();
        Aritmetica restando = new Aritmetica ();
        Aritmetica multiplicando = new Aritmetica ();
        Aritmetica dividiendo = new Aritmetica ();
       
        // llamamos al metodo de la clase
        int resultado = sumando.sumar(15, 8);
        System.out.println("El resultado de la suma es : " +  resultado); 
        
        int resultadoResta = restando.restar(15, 8);
        System.out.println("El resultado de la resta es : "+ resultadoResta);
        
        int resultadoMultiplicacion = multiplicando.multiplicar(15, 8);
        System.out.println ("El resultado de la multiplicacion es: "+ resultadoMultiplicacion);
        
        int resultadoDivision = dividiendo.division(15, 5);
        System.out.println ("El resultado de la division es: " + resultadoDivision);
    }
    
}
