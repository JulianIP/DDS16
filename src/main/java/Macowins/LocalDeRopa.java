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
		
		return unaPrenda.precioFinal(precioFijo);
	}

	public void vender(int unaFecha, Prenda unaPrenda, int cant) {

		Venta unaVenta = new Venta(unaFecha, unaPrenda, cant);
		ventas.add(unaVenta);
	}

	public double gananciaDelDia(int unaFecha) {

		double ganancia=ventas.stream().filter ( venta -> (venta.getFecha()) == unaFecha).
		mapToDouble(venta-> venta.precioTotal(this)).sum();
			

		return ganancia;
	}
	
}
