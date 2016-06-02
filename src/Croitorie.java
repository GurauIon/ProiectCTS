
public class Croitorie {
	public String denumire;
	public String adresa;
	public String oras;
	public String  telefon;

	
	private static Croitorie singletonInstance=null;
	
	private Croitorie()
	{
		
	}
	
	public Croitorie(String denumire,String adresa,String oras,String telefon)
	{
		this.denumire=denumire;
		this.adresa=adresa;
		this.oras=oras;
		this.telefon=telefon;
	}
	
	public static Croitorie getInstance(String denumire,String adresa,String oras,
			int nrAngajati,String telefon)
			{
		if(singletonInstance==null)
		singletonInstance=new Croitorie(denumire,adresa,oras,telefon);
		return singletonInstance;
		
			}
}
