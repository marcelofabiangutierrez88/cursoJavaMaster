package clases.test;

import static org.junit.Assert.*;
import org.junit.Test;
import clases.Suma;


public class TestSuma {
	
@Test

public void SumaPositivos () {
	System.out.println("Se estan sumando dos numeros positivos....");
	Suma s = new Suma (2,3);
	assertTrue(s.Sumando()==5);
}

@Test
public void SumaNegativos () {
	System.out.println("Se estan sumando dos numeros negativos...");
	Suma s = new Suma (-2,-3);
	assertTrue(s.Sumando()==-5);
}

@Test
public void SumaPositivoNegativo () {
	System.out.println("Se esta sumando un numero positivo con otro negativo");
	Suma s = new Suma (-2,3);
	assertTrue (s.Sumando()==1);
}


}
