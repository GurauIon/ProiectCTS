
public class Sacou implements IComandaCroitorie{
	public String denumire;
	public String materie;
	public String tip;
	public String marimi;
	private Croitor croitor;
	
	
	public Sacou(String denumire,String materie,String tip ,String marimi,Croitor croitor)
	{
		this.denumire=denumire;
		this.materie=materie;
		this.tip=tip;
		this.marimi=marimi;
		this.croitor=croitor;
	}

	@Override
	public void executaComanda() {
		croitor.croiesteSacou(this.tip);
		
		
	}

}
