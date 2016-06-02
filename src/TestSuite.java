import static org.junit.Assert.*;

import java.lang.annotation.Annotation;

import org.junit.Test;


public class TestSuite extends junit.framework.TestSuite implements Test{

	public static Test suite(){
		TestSuite colectie = 
				new TestSuite();
		
		colectie.addTestSuite(
				TestCaseSetNumeAngajat.class);
		colectie.addTest(
				new TestareVarstaMinima("testVarstaZero"));
		
		
		return colectie;
	}

	@Override
	public Class<? extends Annotation> annotationType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Class<? extends Throwable> expected() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long timeout() {
		// TODO Auto-generated method stub
		return 0;
	}


}
