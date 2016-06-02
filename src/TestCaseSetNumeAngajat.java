import static org.junit.Assert.*;
import junit.framework.TestCase;

import org.junit.Test;


public class TestCaseSetNumeAngajat extends TestCase{

	Angajat ang;
	public static final String numeInit="Georgescu";
	public void setUp() throws Exception {
		this.ang=new Angajat(numeInit,"Gabriel","vanzator","M",21);
	}
	public void testSetNumeNull() {
		String nume=null;
		try{
			ang.setNume(nume);
			fail("Numele accepta null");
			
		}
		catch(Exception e){
			
		}
		
		
		
	}
	public void testSetNumeSpatii() {
		String nume=" ";
		try{
			ang.setNume(nume);
			fail("Numele accepta campuri necompletate");
			
		}
		catch(Exception e){
			
		}
	}
	public void testSetPrenumSpatii(){
		String prenume=" ";
		try{
			ang.setPrenume(prenume);
			fail("Prenumele nu accepta spatii");
		}
		catch(Exception e){
			//e.printStackTrace();
		}
	}
	public void testSetPrenumNULL(){
		String prenume=null;
		try{
			ang.setPrenume(prenume);
			fail("Prenumele nu accepta null");
		}
		catch(Exception e){
			//e.printStackTrace();
		}
	}
	public TestCaseSetNumeAngajat(String name) {
		super(name);
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}




}
