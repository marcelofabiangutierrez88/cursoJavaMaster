package clases.main;
import clases.Suma;

import java.util.Scanner;

import clases.Resta;

public class ClaseImplementa {

	public static void main(String[] args) {
		int num1;
		int num2;
		
		System.out.println("Este proyecto esta creado para ver el funcionamiento de los "
				+ "test unitarios con JUnit\n, esta es una simple implementacion de las\n"
				+ "clases creadas.. Lo que se queria practicar esta en el paquete test\n"
				+ "\n Autor = Marcelo Gutierrez");
		System.out.println("\n........Se implementan el metodo suma y resta .......");
		System.out.println("#########################################################");
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Ingrese el primer valor a operar....");
		num1= sc.nextInt();
		System.out.println("Ingrese el segundo valor a operar ....");
		num2 = sc.nextInt();
		
		
		Suma s = new Suma (num1,num2);
		System.out.println("El resultado de la suma de los valores ingresados es : "+s.Sumando()); 
		
		Resta r = new Resta (num1,num2);
		System.out.println("El resultado de la resta de los valores ingresados es: " +r.Restando());

	}

}
