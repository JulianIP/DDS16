package Macowins;

public class Zapatos extends Prenda {
	
	public Zapatos(String unNombre, Procedencia unaProcedencia, int talle, Marca unaMarca){
		
		precioBase=400+5*talle;
		procedencia = unaProcedencia;
		nombre=unNombre;
		marca=unaMarca;
	}
}
