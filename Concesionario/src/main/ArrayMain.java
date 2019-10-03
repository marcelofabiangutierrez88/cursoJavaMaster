package main;

import java.util.Scanner;

public class ArrayMain {

	public static void main(String[] args) {
		String marca;
		String modelo;
		int año;
		double km;
		int cantPuertas;
		
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Ingresar la cantidad de vehiculos: ");
		int cantidad = sc.nextInt();
		
			// delimitando la cantidad de autos del consecionario ...
		
		Vehiculo vehiculos [] = new Vehiculo[cantidad];
		
	
			
				// Ingresando valores de cada auto al concesionario....
		
		for (int i =0 ; i<vehiculos.length ; i++) {
			
			Scanner pidoDatos = new Scanner (System.in);
			System.out.println("Ingrese Marca: ");
			marca = pidoDatos.nextLine();
			System.out.println("Ingrese Modelo: ");
			modelo = pidoDatos.nextLine();
			System.out.println("Ingrese el año de fabricacion: ");
			año = pidoDatos.nextInt();
			System.out.println("Ingrese el kilometraje del auto: ");
			km = pidoDatos.nextDouble();
			System.out.println("Ingrese la cantidad de puertas: ");
			cantPuertas = pidoDatos.nextInt();
			
			vehiculos[i] = new Vehiculo (marca,modelo,año,km,cantPuertas);
		}
		
			// mostrando los autos disponibles en la concesionaria....
		
		for (int i = 0; i<vehiculos.length ; i++) {
			System.out.println("Marca: " + vehiculos[i].getMarca());
			System.out.println("Modelo: " +vehiculos[i].getModelo());
			System.out.println("Año: " + vehiculos[i].getAño());
			System.out.println("Kilometraje: " +vehiculos[i].getKm());
			System.out.println("Cantidad de Puertas: "+vehiculos[i].getCantPuertas());
			
			
			// se verifica el estado del auto segun Km......
			
			double bandera = vehiculos[i].getKm();
			System.out.println("Estado del auto segun kilometraje:");
			System.out.println(vehiculos[i].chequeaEstado(bandera));
		}
		
		 	// verificando auto mas antiguo
		
		for (int i = 0; i<vehiculos.length ;i++) {
			int ant1 = 1960;
			int ant = vehiculos[i].getAño();
			if (ant<ant1) {
				System.out.println("El auto mas antiguo es, marca :"+vehiculos[i].getMarca() + " Modelo: "+vehiculos[i].getModelo() + " año: " + vehiculos[i].getAño());
			}
		}
		
			// verificando autos con 4 puertas y 5 puertas
		
		for (int i =0 ; i<vehiculos.length; i++ ) {
			int cuatroPuertas = 0;
			int cincoPuertas = 0;
			if (vehiculos[i].getCantPuertas() ==4 ) {
				cuatroPuertas = cuatroPuertas +1;
			} else if (vehiculos[i].getCantPuertas() ==5) {
				cincoPuertas = cincoPuertas +1;
			} else {
				System.out.println("Valor no informado....");
			}
				
		}
		
		
		
		

	}

}
