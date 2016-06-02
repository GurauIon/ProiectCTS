
public abstract  class Pantaloni implements IComponenta {


	@Override
	public Impacheteaza inpacheteaza() {
		
		return new Invelitoare();
	}

	@Override
	public  abstract float pret() ;

}
