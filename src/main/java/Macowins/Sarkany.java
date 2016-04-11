package Macowins;

public class Sarkany implements Marca {

	public double coeficiente(double precioOriginal) {
		
		if (precioOriginal>500) return 1.35;
		
		else return 1.10;
	}

}
