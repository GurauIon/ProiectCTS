import static org.junit.Assert.*;

import org.junit.Test;


public class TestPretZara {

	float pret=4.5f;
	Zara zara=new Zara();

	@Test
	public void test() {
		assertEquals(pret,zara.pret(), 0.0002);
	}


}
