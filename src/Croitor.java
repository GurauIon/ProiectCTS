
public class Croitor {
	private String nume;
	public Croitor(String nume)
	{
		this.nume=nume;
	}
	
	 public void croiesteSacou(String tipSacou)
	 {
		 System.out.println("A fost executat un Sacou de tip:" +tipSacou);
	 }
	 public void croiestePantalon(String tipPantalon)
	 {
		 System.out.println("A fost executat un Pantalon de tip:" +tipPantalon);
	 }

}
