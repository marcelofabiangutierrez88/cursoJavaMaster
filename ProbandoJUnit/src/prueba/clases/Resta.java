package prueba.clases;

public class Resta {
	private int num1;
	private int num2;
	
public Resta (int num1, int num2) {
	this.num1 = num1;
	this.num2 = num2;
}

public int restar () {
	int result = num1-num2;
	return result;
}

}
