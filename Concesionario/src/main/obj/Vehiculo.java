package main.obj;

public class Vehiculo {
	private String marca;
	private String modelo;
	private int año;
	private double km;
	private int cantPuertas;

	public Vehiculo () {
		
	}
	
	public Vehiculo (String marca, String modelo, int año, double km, int cantPuertas) {
		this.año = año;
		this.cantPuertas = cantPuertas;
		this.km = km;
		this.marca= marca;
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public double getKm() {
		return km;
	}

	public void setKm(double km) {
		this.km = km;
	}

	public int getCantPuertas() {
		return cantPuertas;
	}

	public void setCantPuertas(int cantPuertas) {
		this.cantPuertas = cantPuertas;
	}
	
	public String chequeaEstado (double km) {
		String bandera = null;
		if (km >0 && km<= 9999) {
			bandera = "El motor se encuentra ok.";
		}else if (km >10000 && km <=19999) {
			bandera = "El motor deberia ser revisado para la tranquilidad del cliente.";
		}else if (km>20000 && km <=49000) {
			bandera = "El motor tiene que ser revisado y certificar que el motor esta ok";		
		}else if (km>50000) {
			bandera = "El motor debe tener una reparacion";
		} else {
			bandera = "Parametro erroneo, verificar km y volver a ingresar datos.";
		}
		return bandera;
			
	}
	
	
}


