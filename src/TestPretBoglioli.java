import static org.junit.Assert.*;

import org.junit.Test;


public class TestPretBoglioli {

	Boglioli boglioli=new Boglioli();
	float pret=5.0f;
	@Test
	public void test() {
		assertEquals(pret, boglioli.pret(), 0.00002);
	}

}
