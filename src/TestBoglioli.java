import static org.junit.Assert.*;

import org.junit.Test;


public class TestBoglioli {

	Boglioli boglioli=new Boglioli();
	String[] tipuriBoglioli={"Sacou X","Sacou XL"};
	
	@Test
	public void test() {
		System.out.println("testam ce tipuri de camasi boglioli avem in stoc:");
		assertArrayEquals(tipuriBoglioli,boglioli.tipuriSacouriBoglioli());
	}

	

}
