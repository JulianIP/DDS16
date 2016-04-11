package Macowins;

public class Saco extends Prenda {

	public Saco(String unNombre, Procedencia unaProcedencia, int cantidadDeBotones, Marca unaMarca){
		
		precioBase=300+10*cantidadDeBotones;
		procedencia = unaProcedencia;
		nombre=unNombre;
		marca=unaMarca;
	}
}
