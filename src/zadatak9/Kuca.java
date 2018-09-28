package zadatak9;

/**
 * @author Denis.Selimovski
 *
 */
public class Kuca extends Nekretnina {
	
	private double povrsinaOkucnice;

	
	public Kuca() {
		super();
	}

	public Kuca(String adresa, int zona, double kvadratura, Vlasnik vlasnik) {
		super(adresa, zona, kvadratura, vlasnik);
	}
	
	public Kuca(String adresa, int zona, double kvadratura, Vlasnik vlasnik, double povrsinaOkucnice) {
		super(adresa, zona, kvadratura, vlasnik);
		if(0 < povrsinaOkucnice)
			this.povrsinaOkucnice = povrsinaOkucnice;
		else
			throw new IllegalArgumentException("GRESKA - Povrsina okucnice mora biti veca od nule!!!");
	}
	
	
	public double getPovrsinaOkucnice() {
		return povrsinaOkucnice;
	}

	public void setPovrsinaOkucnice(double povrsinaOkucnice) {
		if(0 < povrsinaOkucnice)
			this.povrsinaOkucnice = povrsinaOkucnice;
		else
			throw new IllegalArgumentException("GRESKA - Povrsina okucnice mora biti veca od nule!!!");
	}

	@Override
	public String toString() {
		return super.toString() + ", povrsina okucnice: " + povrsinaOkucnice;
	}

	@Override
	public double izracunajCenu() {
		return this.getKvadratura()*this.cenaKvadrata() + povrsinaOkucnice*this.cenaKvadrata()*0.15;
	}
	
}