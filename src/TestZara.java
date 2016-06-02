import static org.junit.Assert.*;

import org.junit.Test;


public class TestZara {

	Zara zara=new Zara();
	String[] stocZara={"zara de bumbac","Zara sintetic","zara natural","zara de in"};
	@Test
	public void test() {
		System.out.println("Testare stoc de camasi Zara");
		assertArrayEquals(stocZara,zara.tipuriCamasi());
	}
}


