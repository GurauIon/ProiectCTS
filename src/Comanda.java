
import java.util.ArrayList;
import java.util.List;


public class Comanda {
	private  List<IComponenta>  componente=new ArrayList<IComponenta>();
	public void adaugaComponente(IComponenta componenta)
	{
		componente.add(componenta);
		
	}
	
	//Calcul pret
	public float getPret()
	{
		float pret=0.0f;
		for(IComponenta componenta:componente)
			pret+=componenta.pret();
		return pret;
	}

	//afisare de produse
	public void afisProduse()
	{
		for(IComponenta componenta:componente)
		{
			System.out.println("Denumire:" +componenta.nume());
			System.out.println(" ,Inpacheteaza:" + componenta.inpacheteaza().impacheteaza());
			System.out.println(", PretulTotal de :"+ componenta.pret());
		}
	}
}
