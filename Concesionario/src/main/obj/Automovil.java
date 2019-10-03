package main.obj;

public class Automovil  extends Vehiculo{
	private String marca;
	private String modelo;
	private int año;
	private double km;
	private int cantPuertas;
	
	public Automovil () {
		
	}
	public Automovil(String marca, String modelo, int año, double km, int cantPuertas) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.año = año;
		this.km = km;
		this.cantPuertas = cantPuertas;
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
	
	
	
	

}
