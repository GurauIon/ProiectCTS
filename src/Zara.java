import java.util.Arrays;


public class Zara  extends Camasi{
	//JUnit
public String[] tipuriCamasi(){
	String[] stocZara={"zara de bumbac","Zara sintetic","zara natural","zara de in"};
	System.out.println("Stocul contine urmatoarele tipuri de camasi Zara: "+	
	Arrays.toString(stocZara));
	return stocZara;
}


	@Override
	public String nume() {
		
		return "Zara";
	}

	@Override
	public float pret() {
		
		return 4.5f;
	}

}
