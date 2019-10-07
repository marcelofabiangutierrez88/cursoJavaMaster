import mypersoninterface.PersonInterface;
import mypersoninterface.Persona;

public class MyPersonInterface {

	public static void main(String[] args) {
		Persona person = new Persona (1000,2000,"Marcelo","Gutierrez");
		
		PersonInterface personinterface1 = person;
		
		System.out.println("personinterface1.getName() = " + personinterface1.getName() + "," +
                " personinterface1.calcularRiquezaTotal()= " + personinterface1.calcularRiquezaTotal());
                
        System.out.println("personinterface1.getName() = " + personinterface1.getName() + "," +
                        "personinterface1.calcularRiquezaTotal() = " + personinterface1.calcularRiquezaTotal());
		
        boolean b1 = (person == personinterface1);
        System.out.println("persona y personainterface1 apuntan a la misma instancia de objeto? " + b1);
       
        
        PersonInterface personinterface2 = new Persona(3000, 4000, "Pepito", "Perez");
       
        System.out.println("personinterface2.getName() = " + personinterface2.getName() + "," +
                " personinterface2.calcularRiquezaTotal() = " + personinterface2.calcularRiquezaTotal());
        
    }
   

	}


