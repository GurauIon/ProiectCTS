
public class ComandaBuilder {
	public Comanda comandaPantaloni(){
		Comanda comanda=new Comanda();
		comanda.adaugaComponente(new pantalonTineret());
		comanda.adaugaComponente(new Zara());
		return comanda;
	}
	public Comanda comandaSacouri(){
		Comanda comanda =new Comanda();
		comanda.adaugaComponente(new Biaggini());
		comanda.adaugaComponente(new pantalonClasic());
		return comanda;
	}
	public Comanda comandaMaiMulte(){
		Comanda comanda=new Comanda();
		comanda.adaugaComponente(new camasaIn());
		comanda.adaugaComponente(new Boglioli());
		comanda.adaugaComponente(new pantalonClasic());
		return comanda;
	}
	public ComandaBuilder(){}


}
