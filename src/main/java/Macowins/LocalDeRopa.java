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
		double precioFinal = (unaPrenda.getPrecioBase() + precioFijo) * unaPrenda.tasa();
		return precioFinal;
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

	public static void main(String[] args) {

		Nacional nacional = new Nacional();
		Internacional internacional = new Internacional();
		Saco unSaco = new Saco("saco negro", nacional);
		LocalDeRopa macowins = new LocalDeRopa(100);
		Saco otroSaco = new Saco("saco gucci", internacional);

		Camisa unaCamisa = new Camisa("camisa negra", nacional);

		/*
		 * System.out.println(macowins.precioFinalDe(unSaco));
		 * System.out.println(macowins.precioFinalDe(otroSaco));
		 * System.out.println(macowins.precioFinalDe(unaCamisa));
		 */

		macowins.vender(20160323, unSaco, 2);

		macowins.vender(20160325, otroSaco, 1);

		macowins.vender(20160324, unaCamisa, 1);

		System.out.println(macowins.gananciaDelDia(20160324));

	}
}
