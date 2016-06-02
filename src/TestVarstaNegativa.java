import static org.junit.Assert.*;
import junit.framework.TestCase;

import org.junit.Test;


public class TestVarstaNegativa extends TestCase{

	Angajat ang;
	public static final int varstaInit=21;
	public TestVarstaNegativa(String nume)
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
		this.ang=null;
	}
	public void testSetValoriNegative(){
		int varstaNegativa=-23;
	
		try{
			ang.setVarsta(varstaNegativa);
			fail("Metoda nu arunca exceptie pe valorile negative");
			}
			catch(Exception ex){
			
			}
			
	}
	






}
