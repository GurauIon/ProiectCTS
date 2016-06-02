


public class Incendiu implements Pompieri
{
	public boolean arde=false;
	public void incendiuLaCroitorie()
	{
		this.arde=true;
		System.out.println("A luat ceva foc la Croitorie!!!!!!");
	}
	

	@Override
	public void sunaPompieri() {
		if(arde==true)
			System.out.println("Vin Pompierii!!!");
		
	}
	public Incendiu()
	{
		
	}
	
}
