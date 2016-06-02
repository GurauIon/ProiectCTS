import static org.junit.Assert.*;

import org.junit.Test;


public class TestPretPantalonClasic {

	float pret=5.0f;
	pantalonClasic pantalon=new pantalonClasic();

	@Test
	public void test() {
		assertEquals(pret, pantalon.pret(), 0.0002);
	}


}
