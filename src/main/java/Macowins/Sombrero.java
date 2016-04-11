package Macowins;

public class Sombrero extends Prenda {

public Sombrero(String unNombre, Procedencia unaProcedencia, double coeficienteMetrosexualidad, Marca unaMarca){
		
		precioBase=150*(1+coeficienteMetrosexualidad);
		procedencia = unaProcedencia;
		nombre=unNombre;
		marca=unaMarca;
	}
	
}
