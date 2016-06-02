import java.util.ArrayList;


public class Vanzator {
	public ArrayList<IComandaCroitorie> comenzi;
	public String client;
	
	public Vanzator(String client)
	{
		this.client=client;
		this.comenzi=new ArrayList<>();
	}
	public void iaComanda(IComandaCroitorie comanda)
	{
		this.comenzi.add(comanda);
	}
	
	public void trimiteComenziCroitor()
	{
		for(IComandaCroitorie comanda:comenzi)
		{
			comanda.executaComanda();
		}
	}
	

}
