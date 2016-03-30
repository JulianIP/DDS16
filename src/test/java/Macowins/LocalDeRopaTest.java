package Macowins;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class LocalDeRopaTest {
	
	private Nacional nacional;
	private Internacional internacional;
	private LocalDeRopa macowins;
	private Saco sacoNegro;
	private Saco sacoGucci;
	private Camisa camisaNegra;
	private Pantalon pantalonNegro;

	@Before
	public void init() {
		nacional = new Nacional();
		internacional = new Internacional();
		macowins = new LocalDeRopa(100);
		sacoNegro = new Saco("saco negro", nacional);
		sacoGucci = new Saco("saco gucci", internacional);
		camisaNegra = new Camisa("camisa negra", nacional);
		pantalonNegro = new Pantalon("pantalon negro", internacional);
	}

	@Test
	public void precioFinalDeSacoNacional() {
		Assert.assertEquals(400.0, macowins.precioFinalDe(sacoNegro),0.01);
	}
	
	@Test
	public void precioFinalDeSacoInteracional() {
		Assert.assertEquals(520.0, macowins.precioFinalDe(sacoGucci),0.01);
	}
	
	@Test
	public void precioFinalDeCamisaNacional() {
		Assert.assertEquals(300.0, macowins.precioFinalDe(camisaNegra),0.01);
	}
	
	@Test
	public void precioFinalDePantalonInternacional() {
		Assert.assertEquals(455.0, macowins.precioFinalDe(pantalonNegro),0.01);
	}
		
	@Test
	public void gananciaDelDia() {
		macowins.vender(20150728,sacoGucci,1);
		macowins.vender(20160324,sacoNegro,2);
		macowins.vender(20160324,pantalonNegro,3);		
		
		Assert.assertEquals(2165.0, macowins.gananciaDelDia(20160324),0.01);
	}
    
	

}
