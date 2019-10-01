
package prueba.clases;

import static org.junit.Assert.*;

import org.junit.Test;


public class TestClaseSuma2 {
	
@Test
public void SumarPositivos() {
	System.out.println("Sumando dos numeros positivos: ....");
	Suma s = new Suma(2,3);
	assertTrue(s.sumar()==5);
	
}

@Test
public void SumarNegativos () {
	System.out.println("Sumando dos numeros negativos: ....");
	Suma s = new Suma (-2,-3);
	assertTrue(s.sumar()==-5);
	
}

@Test
public void SumarPositivoNegativo () {
	System.out.println("Sumando un numero negativo y otro positivo....");
	Suma s = new Suma (-2,3);
	assertTrue(s.sumar()==1);
}

@Test
public void RestarPositivos () {
	System.out.println("Restando dos numeros positivos, resultado mayor a cero...");
	Resta r = new Resta (4,3);
	assertTrue (r.restar()==1);
}

@Test
public void RestarDeNuevo() {
	System.out.println("Restando dos numeros positivos, resultado menor a cero....");
	Resta r = new Resta (3,4);
	assertTrue (r.restar()==-1);
	
}
@Test
public void RestandoNegativos() {
	System.out.println("Restando dos numeros negativos .. .. .");
	Resta r = new Resta (-3,-4);
	assertTrue (r.restar() == -7);
}

}
