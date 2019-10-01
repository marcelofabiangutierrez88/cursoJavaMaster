
package indicemasacorporal;

/**
 *
 * @author marcelo
 */
public class Persona {
    String nombre;
 ;
    double altura, peso;
    
    
    public Persona(){
        
    }
    
    public Persona(String nombre,  double altura, double peso){
        this.altura=altura;
      ;
        this.nombre = nombre;
        this.peso = peso;
        
        
    }

    Persona(String nombre, double peso, int edad, double altura) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

 

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    public double masaCorporal (double peso, double altura){
        double mc;
        mc = peso / altura*2;
        
        return mc;
       
    }
    
    public String  comparativa (double mc){
        
        String cadena = null;
        if (mc < 16){
          cadena ="Delgadez severa";
           // System.out.println(cadena);
        } else if (mc>16 && mc<=16.99){
           cadena = "Delgadez moderada";
            //System.out.println(cadena);
        }  else if (mc > 17 && mc<=18.49){
          cadena = "Delgadez Aceptable";
            //System.out.println(cadena);
        } else if (mc>18.5 && mc <=24.99){
          cadena ="Peso Normal";
            //System.out.println(cadena);
          
        }else if (mc>25 && mc<=29.99){
            cadena = "Sobrepeso";
            //System.out.println(cadena);
        }else {
            System.out.println("Error");
        }
        
    return cadena;
}}
