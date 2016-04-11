package Macowins;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class LocalDeRopaTest {
	
	private Nacional nacional;
	private Internacional internacional;
	private LocalDeRopa macowins;
	private Saco sacoNegro;
	private Saco sacoArmani;
	private Camisa camisaNegra;
	private Pantalon pantalonNegro;
	private Armani armani;
	private Sarkany sarkany;
	private Sombrero sombreroMarron;
	private Zapatos zapatosChetos;

	@Before
	public void init() {
		armani=new Armani();
		sarkany=new Sarkany();
		nacional = new Nacional();
		internacional = new Internacional();
		macowins = new LocalDeRopa(100);
		sacoNegro = new Saco("saco negro", nacional,2,sarkany);
		sacoArmani = new Saco("saco gucci", internacional,4,armani);
		camisaNegra = new Camisa("camisa negra", nacional,sarkany);
		pantalonNegro = new Pantalon("pantalon negro", internacional,100,armani);
		sombreroMarron= new Sombrero ("sombrero marron",nacional,0.5,sarkany);	
		zapatosChetos= new Zapatos ("zapatos chetos", nacional,43,sarkany);
	
		
	}

	@Test
	public void precioFinalDeSacoNacionalSarkany() {
		Assert.assertEquals(462.0, macowins.precioFinalDe(sacoNegro),0.01);
	}
	
	@Test
	public void precioFinalDeSacoInteracionalArmani() {
		Assert.assertEquals(943.8, macowins.precioFinalDe(sacoArmani),0.01);
	}
	
	@Test
	public void precioFinalDeCamisaNacionalSarkany() {
		Assert.assertEquals(330.0, macowins.precioFinalDe(camisaNegra),0.01);
	}
	
	@Test
	public void precioFinalDePantalonInternacionalArmani() {
		Assert.assertEquals(965.25, macowins.precioFinalDe(pantalonNegro),0.01);
	}
	
	@Test
	public void precioFinalDeSombreroNacionalSarkany() {
		Assert.assertEquals(357.5, macowins.precioFinalDe(sombreroMarron),0.01);
	}
	
	@Test
	public void precioFinalDeZapatosNacionalesSarkany() {
		Assert.assertEquals(965.25, macowins.precioFinalDe(zapatosChetos),0.01);
	}
	
	
	
	@Test
	public void gananciaDelDia() {
		macowins.vender(20150728,sacoArmani,1);
		macowins.vender(20160324,sacoNegro,2);
		macowins.vender(20160324,pantalonNegro,3);	
		macowins.vender(20160324,sombreroMarron,2);
		macowins.vender(20160324, zapatosChetos, 1);
		
		
		Assert.assertEquals(5500.0, macowins.gananciaDelDia(20160324),0.01);
	}
    
	

}
