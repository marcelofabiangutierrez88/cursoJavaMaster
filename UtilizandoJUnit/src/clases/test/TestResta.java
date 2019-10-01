package clases.test;

import static org.junit.Assert.*;
import org.junit.Test;
import clases.Resta;


public class TestResta {
	
@Test
public void RestaPositivos () {
	System.out.println("Se estan restando dos numeros positivos ....");
	Resta r = new Resta (4,3);
	assertTrue (r.Restando() == 0);
		
}
@Test
public void RestaNegativos () {
	System.out.println("Se estan restando dos numeros negativos.....");
	Resta r = new Resta (-1,-1);
	assertTrue (r.Restando()==0);
}

@Test
public void RestaNegativoPositivo () {
	System.out.println("Se estan restando un numero positivo y otro negativo");
	Resta r = new Resta (4,-2);
	assertTrue (r.Restando()==6);
}

}
