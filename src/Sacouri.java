
public abstract  class Sacouri implements IComponenta{



	@Override
	public Impacheteaza inpacheteaza() {
		
		return new Invelitoare();
	}

	@Override
	public abstract float pret() ;

}
