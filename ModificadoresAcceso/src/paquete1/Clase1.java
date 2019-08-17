
package paquete1;

/**
 *
 * @author Marcelo
 */
public class Clase1 {
    
    //definicion de atributos
    public int atrPublico = 10;
    protected int atrProtegido = 5;
    int atrPaquete = 22;
    private int atrPrivado = 8;
    
    //constructores
    
    public Clase1(){
        
    }
    public Clase1(int i){
        System.out.println("Constructor publico 1");
    }
    protected Clase1(int i, int j){
        System.out.println("Constructor protected 2");
    }
    Clase1(int i, int j, int k){
        System.out.println("Constructor package 3");
    }
    private Clase1(int i, int j, int k, int l){
        System.out.println("Constructor privado 4");
    }
    // definicion de metodos
    public int metodoPublico(){
        return 9;
    }
    protected int metodoProtegido(){
        return 10;
    }
    int metodoPaquete(){
        return 11;
    }
    private int metodoPrivado(){
        return 12;
    }
}
