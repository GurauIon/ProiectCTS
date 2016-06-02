import java.util.ArrayList;
import java.util.List;


public class Manager implements Conduce{
	public String nume;
	public String prenume;
	public String adresa;
	public int varsta;
	public int vechime;
	public Croitorie croitorie;
	
	public List<Angajat> subordonati;
	
	public Manager(String nume,String prenume,String adresa,
					int varsta,int vechime){
			this.nume=nume;
			this.prenume=prenume;
			this.adresa=adresa;
			this.varsta=varsta;
			this.vechime=vechime;
			this.subordonati=new ArrayList<Angajat>();
	}
	//angajeaza Angajat
	public void adauga(Angajat a)
	{
		subordonati.add(a);
	}
	//concediaza Angajat
	public void concediereAngajat(Angajat a)
	{
		subordonati.remove(a);
	}
	public List<Angajat> getSubordonati()
	{
		return subordonati;
	}


	@Override
	public void esteManager(Croitorie croitorie) {
		System.out.println("Persoana: "+this.nume+" "+this.prenume+
				" este managerul cofetariei "+croitorie.denumire);
		
	}

}

