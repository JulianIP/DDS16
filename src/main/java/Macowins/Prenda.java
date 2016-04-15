package Macowins;

public abstract class Prenda {

	double precioBase;
	Procedencia procedencia;
	String nombre;
	Marca marca;

	public double tasa() {

		return procedencia.tasa();
	}

	public double coeficienteDeMarca(double precioOriginal) {

		return marca.coeficiente(precioOriginal);
	}

	public double precioFinal(double precioFijo) {
		double precioOriginal = (precioBase + precioFijo) * this.tasa();

		return precioOriginal * this.coeficienteDeMarca(precioOriginal);

	}
}
