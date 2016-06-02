
public class Angajat {
	public String nume;
	public String prenume;
	public String functia;
	public String gen;
	public int varsta;
	
	public Angajat(String nume,String prenume,String functia,
			String gen,int varsta){
		this.nume=nume;
		this.prenume=prenume;
		this.functia=functia;
		this.gen=gen;
		this.varsta=varsta;
	}
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) throws Exception {
		//validare input nume
		if(nume==null)
			throw new Exception("Numele nu accepta null");
		if(nume==" ")
			throw new Exception("Numele nu accepta spatii");
		this.nume = nume;
	}
	public String getPrenume() {
		return prenume;
	}
	public void setPrenume(String prenume) throws Exception {
		if(prenume==null)
			throw new Exception("Prenumele nu trebuie sa fie NULL");
		if(prenume==" ")
			throw new Exception("Prenumele nu trebuie sa fie necompletat");
		this.prenume = prenume;
	}
	public String getFunctia() {
		return functia;
	}
	public void setFunctia(String functia) {
		this.functia = functia;
	}
	public String getGen() {
		return gen;
	}
	public void setGen(String gen) {
		this.gen = gen;
	}
	public int getVarsta() {
		return varsta;
	}
	public void setVarsta(int varsta) throws Exception {
		if(varsta < 0)
					throw new Exception("Varsta nu trebuie sa fie negativa");
		if(varsta<18)
			throw new Exception("Varsta nu trebuie sa fie mai mica de 18 ani");
		if(varsta==0)
			throw new Exception("Varsta nu trebuie sa fie egala cu 0");
		if(varsta>65)
			throw new Exception("Varsta nu trebuie sa depaseasca 65 de ani");
			this.varsta = varsta;
		
	}
	@Override
	public String toString() {
		return this.nume+" "+this.prenume+" "+this.functia+" "+this.gen+" "+this.varsta;
	}
	
	
	

}

