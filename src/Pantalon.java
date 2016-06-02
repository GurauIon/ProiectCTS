
public class Pantalon implements IComandaCroitorie {
	public String tip;
	public String materie;
	public Croitor croitor;
	
	 public Pantalon(String tip,String materie,Croitor croitor) {
		this.tip=tip;
		this.materie=materie;
		this.croitor=croitor;
		
		
	}

	@Override
	public void executaComanda() {
		croitor.croiestePantalon(this.tip);
		
	}



	

}
