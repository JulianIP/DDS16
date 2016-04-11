package Macowins;

public abstract class Prenda{

	double precioBase;
	Procedencia procedencia;
	String nombre;
	Marca marca;
	
	public double getPrecioBase() {
		
		return precioBase;
	}
	
	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}
	
	public double tasa(){
		
		return procedencia.getTasa();
	}

	public double coeficienteDeMarca(double precioOriginal) {
		
		return marca.coeficiente(precioOriginal);
	}
}
