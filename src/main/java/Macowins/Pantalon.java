package Macowins;

public class Pantalon extends Prenda {

	public Pantalon(String unNombre, Procedencia unaProcedencia, double telaUsada, Marca unaMarca){
		
		precioBase=250+telaUsada;
		procedencia = unaProcedencia;
		nombre=unNombre;
		marca=unaMarca;
	}
}
