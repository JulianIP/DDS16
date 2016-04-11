package Macowins;

import java.util.*;

public class LocalDeRopa {

	ArrayList<Venta> ventas;
	double precioFijo;

	public LocalDeRopa(double valorFijo) {
		precioFijo = valorFijo;
		ventas = new ArrayList<Venta>();

	}

	public double precioFinalDe(Prenda unaPrenda) {
		double precioOriginal = (unaPrenda.getPrecioBase() + precioFijo) * unaPrenda.tasa();
		
		return precioOriginal*unaPrenda.coeficienteDeMarca(precioOriginal);
	}

	public void vender(int unaFecha, Prenda unaPrenda, int cant) {

		Venta unaVenta = new Venta(unaFecha, unaPrenda, cant);
		ventas.add(unaVenta);
	}

	public double gananciaDelDia(int unaFecha) {

		double ganancia = 0;

		for (Venta unaVenta : ventas) {
			if (unaFecha == unaVenta.getFecha()) {
				ganancia += unaVenta.precioTotal(this);
			}
		}

		return ganancia;
	}
	
}
