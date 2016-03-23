package Macowins;

public class Venta {
	
	int fecha;
	Prenda prenda;
	int cantidad;
	
	public Venta(int unaFecha, Prenda unaPrenda, int cant){
		fecha=unaFecha;
		prenda=unaPrenda;
		cantidad=cant;
	}

	public int getFecha() {
		return fecha;
	}	
	
	public double precioTotal(LocalDeRopa local){
		
		return cantidad * local.precioFinalDe(prenda);
		
	}
}
