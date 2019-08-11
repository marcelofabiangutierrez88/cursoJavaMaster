
package usodeenumeraciones;

/**
 *
 * @author Marcelo
 */
public class UsoDeEnumeraciones {

   
    public static void main(String[] args) {
        //valores de la enumeracion
        System.out.println("Valor 1: "+Dias.LUNES);
        
        //hacemos un test del dia seleccionado
        indicarDia(Dias.MARTES);
        
        //enumeracion de paises
        System.out.println("Continentes Nro4: "+Continentes.AMERICA);
        System.out.println("Paises en America: "+Continentes.AMERICA.getPaises());
        
        //hacemos el test de paises por continente
        System.out.println("");
        indicarPaises(Continentes.AFRICA);
        
        //imprimiendo los continentes
        System.out.println("");
        imprimirContinentes();
        
        
    }
    public static void indicarDia(Dias dias){
        switch(dias){
            case LUNES:
                System.out.println("Primer dia de la semana");
                break;
            case MARTES:
                System.out.println("Segundo dia de la semana");
                break;
            case MIERCOLES:
                System.out.println("Tercer dia de la semana");
                break;
            case JUEVES:
                System.out.println("Cuarto dia de la semana");
                break;
            case VIERNES:
                System.out.println("Quinto dia de la semana");
                break;
            case SABADO:
                System.out.println("Sexto dia de la semana");
                break;
            case DOMINGO:
                System.out.println("Septimo dia de la semana");
            default:
                System.out.println("Seguimos con los demas dias");
        }
    }
    public static void indicarPaises(Continentes continentes){
        switch(continentes){
            //podemos usar algun valor constante de la enumeracion directamente
            case AFRICA:
                System.out.println("Nro de paises en: "+continentes + ": "+continentes.getPaises());
                break;
            case EUROPA:
                System.out.println("Nro de paises en: "+continentes+": "+continentes.getPaises());
                break;
            case AMERICA:
                 System.out.println("Nro de paises en: "+continentes+": "+continentes.getPaises());
                break;
            case ASIA:
                 System.out.println("Nro de paises en: "+continentes+": "+continentes.getPaises());
                 break;
            case OCEANIA:
                 System.out.println("Nro de paises en: "+continentes+": "+continentes.getPaises());
                 break;
            default:
                System.out.println("Seguimos con todos los casos...");
                
        }
    }
    public static void imprimirContinentes(){
        //utilizamos foreach
        for (Continentes c :Continentes.values()){
            System.out.println("Continente "+ c + " Contiene "+c.getPaises()+" paises.");
        }
    }
    
}
