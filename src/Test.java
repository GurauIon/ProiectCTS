import java.io.ObjectInputStream.GetField;


public class Test {

	public static void main(String[] args) {
		System.out.println("Singleton\n");
	Croitorie c1=new Croitorie("TopModel", "vasile alxandri", "Bucuresti", "0757792132");
	Croitorie c2=new Croitorie("AlbNegru", "vasile alxandri", "Bucuresti", "0757792132");
	if(c1==c2)
			System.out.println("Referinte identice!");
		else
			System.out.println("Obiecte diferite!");
	
	Manager manager1=new Manager("Gheorghiu", "Gheorghe", "Stefan cel Mare nr 45", 29, 4);
	Manager manager2=new Manager("Ionescu", "Gabriel", "Mihai Eminescu nr 34" , 26, 2);
	Angajat a1=new Angajat("Serbanescu", "Andrei", "vanzator", "M", 28);
	Angajat a2=new Angajat("Simionescu", "Elena", "DirectorVanzari", "F", 37);
	Angajat a3=new Angajat("Gavrila", "Ioana", "Masurator", "F", 28);
	Angajat a4=new Angajat("Airinei", "Vasile", "Croitor", "M", 45);
	
	manager1.adauga(a1);
	manager1.adauga(a2);
	manager1.adauga(a3);
	manager1.adauga(a4);
	System.out.println("\n");
	System.out.println("Managerul :"+manager1.nume+ " "+manager1.prenume+ "are urmatorii subortdonati: ");
	for(Angajat a:manager1.getSubordonati())
	{
		System.out.println(a.toString());
	}
	
	System.out.println("Facade\n");
	
	Incendiu arde=new Incendiu();
	Jaf jaf=new Jaf();
	arde.incendiuLaCroitorie();
	arde.sunaPompieri();
	jaf.jafLaCroitorie();
	jaf.suna911();
	
	System.out.println("Command\n");
	Croitor croitor=new Croitor("Vasilache Petru");
	String client="Anton Ilie";
	Vanzator v=new Vanzator(client);
	v.iaComanda(new Sacou("Ialiano", "Bumbac", "copil", "s", croitor));
	v.iaComanda(new Pantalon("barbat", "bumbac", croitor));
	v.trimiteComenziCroitor();
	
	
	System.out.println("Builder\n");
	ComandaBuilder comandaBuilder=new ComandaBuilder();
	Comanda pantaloni=comandaBuilder.comandaPantaloni();
	System.out.println("Pantaloni si camasa.");
	pantaloni.afisProduse();
	System.out.println("pret de :" +pantaloni.getPret());
	System.out.println("\n");
	
	ComandaBuilder comandaBuilder1=new ComandaBuilder();
	Comanda MaiMulte=comandaBuilder.comandaMaiMulte();
	System.out.println("Sa vedem ce avem :");
	MaiMulte.afisProduse();
	System.out.println("pret de :" +MaiMulte.getPret());
	System.out.println("\n");
	

	}

}
