package zadatak9;

/**
 * @author Denis.Selimovski
 *
 */
public class Stan extends Nekretnina {
	
	private double povrsinaPodruma;
	private double povrsinaTerase;
	
	
	public Stan() {
		super();
	}
	
	public Stan(String adresa, int zona, double kvadratura, Vlasnik vlasnik) {
		super(adresa, zona, kvadratura, vlasnik);
	}
	
	public Stan(String adresa, int zona, double kvadratura, Vlasnik vlasnik, double povrsinaPodruma, double povrsinaTerase) {
		super(adresa, zona, kvadratura, vlasnik);
		if(0 < povrsinaPodruma)
			this.povrsinaPodruma = povrsinaPodruma;
		else
			throw new IllegalArgumentException("GRESKA - Povrsina podruma mora biti veca od nule!!!");
		if(0 < povrsinaTerase)
			this.povrsinaTerase = povrsinaTerase;
		else
			throw new IllegalArgumentException("GRESKA - Povrsina terase mora biti veca od nule!!!");
	}

	
	public double getPovrsinaPodruma() {
		return povrsinaPodruma;
	}

	public void setPovrsinaPodruma(double povrsinaPodruma) {
		if(0 < povrsinaPodruma)
			this.povrsinaPodruma = povrsinaPodruma;
		else
			throw new IllegalArgumentException("GRESKA - Povrsina podruma mora biti veca od nule!!!");
	}

	public double getPovrsinaTerase() {
		return povrsinaTerase;
	}

	public void setPovrsinaTerase(double povrsinaTerase) {
		if(0 < povrsinaTerase)
			this.povrsinaTerase = povrsinaTerase;
		else
			throw new IllegalArgumentException("GRESKA - Povrsina terase mora biti veca od nule!!!");
	}

	@Override
	public String toString() {
		return super.toString() + ", povrsina podruma: " + povrsinaPodruma + ", povrsina terase: " + povrsinaTerase;
	}

	@Override
	public double izracunajCenu() {
		return this.getKvadratura()*this.cenaKvadrata() + ((povrsinaPodruma + povrsinaTerase)*this.cenaKvadrata()*0.33);
	}
	
}