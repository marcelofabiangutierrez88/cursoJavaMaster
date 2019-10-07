package mypersoninterface;

public class Persona implements PersonInterface {
	
	int ahorroEfectivo;
	int fondoRetiro;
	String firstName;
	String lastName;
	
	

	public Persona(int ahorroEfectivo, int fondoRetiro, String firstName, String lastName) {
		super();
		this.ahorroEfectivo = ahorroEfectivo;
		this.fondoRetiro = fondoRetiro;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	@Override
	public int calcularRiquezaTotal() {
		System.out.println((ahorroEfectivo + fondoRetiro));;
        return (ahorroEfectivo + fondoRetiro);
	}

	@Override
	public String getName() {
		 return firstName + " " + lastName;
	}
	

}
