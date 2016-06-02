import java.util.Arrays;


public class Boglioli extends Sacouri {

	@Override
	public String nume() {
		
		return "Boglioli";
	}

	@Override
	public float pret() {
		
		return 5.0f;
	}
	//JUnit
public String[] tipuriSacouriBoglioli(){
	String[]tipuriBoglioli={"Sacou X","Sacou XL"};
	System.out.println("la Croitoria TopModel puteti face comanda de urmatoarele  marimi de sacouri Boglioli:"+	
	Arrays.toString(tipuriBoglioli));
	return tipuriBoglioli;

}
}
