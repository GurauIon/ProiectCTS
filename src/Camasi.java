
public abstract  class Camasi implements IComponenta {



	@Override
	public Impacheteaza inpacheteaza() {
		
		return new Invelitoare();
	}

	@Override
	public abstract float pret() ;
	//gurau
}
