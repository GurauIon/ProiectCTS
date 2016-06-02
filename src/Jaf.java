
public class Jaf implements Politia{
	 protected boolean jaf =false;
	 public void jafLaCroitorie()
	 {
		 this.jaf=true;
				 System.out.println("Jaf la Croitorie!!!!!");
	 }

	@Override
	public void suna911() {
		if(jaf==true)
		System.out.println("Vine Politia!!!!");
		
	}
	public Jaf()
	{
		
	}

}
