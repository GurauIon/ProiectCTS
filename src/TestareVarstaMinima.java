import static org.junit.Assert.*;
import junit.framework.TestCase;

import org.junit.Test;


public class TestareVarstaMinima extends TestCase {

       Angajat ang;
       public static final int varstaInit=19;
       public TestareVarstaMinima(String nume)
       {
    	   super(nume);
    	   
       }
   	protected void setUp() throws Exception {
		super.setUp();
		System.out.println("Pregatire test!");
		this.ang=new Angajat("Ionescu", 
				"Marian", "vanzator", "M", varstaInit);
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testSetVarsta() {
		int varstaMinima=18;
		try {
			ang.setVarsta(varstaMinima);
			assertEquals("Test setVarsta cu valoare minima",
								varstaMinima,ang.getVarsta());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void testSetVarstaMaxima() {
		int varstaMaxima=65;
		try {
			ang.setVarsta(varstaMaxima);
			assertEquals("Test setVarsta cu valoare maxima",
								varstaMaxima,ang.getVarsta());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void testVarstaZero(){
			int varstaNoua = 0;
			try{
				ang.setVarsta(varstaNoua);
					fail("Lipsa exceptie pe valoare = 0");
				}
				catch(Exception e){
					
				}
			}


}
