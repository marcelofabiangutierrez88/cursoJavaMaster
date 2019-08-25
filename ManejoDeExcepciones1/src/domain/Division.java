
package domain;

/**
 *
 * @author Marcelo
 */
public class Division {
    //atributo de la clase
    private int numerador;
    private int denominador;
    
    public Division(int numerador, int denominador) throws OperationException{
        if (denominador == 0){
            throw new OperationException ("Denominador igual a cero");
        }
        this.numerador = numerador;
        this.denominador = denominador;
    }
    public void visualizarOperacion(){
        System.out.println("El resultado de la division es: "+ numerador/denominador);
    }
    
    
}
