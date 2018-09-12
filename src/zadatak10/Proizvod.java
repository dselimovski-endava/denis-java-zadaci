package zadatak10;

/**
 * @author Denis.Selimovski
 *
 */
public abstract class Proizvod {
	
	private String nazivProizvoda;
	private double cenaProizvoda;
	private String rokTrajanja;

	
	protected Proizvod() {
	}
	
	protected Proizvod(String nazivProizvoda, double cenaProizvoda, String rokTrajanja) {
		this.nazivProizvoda = nazivProizvoda;
		this.cenaProizvoda = cenaProizvoda;
		this.rokTrajanja = rokTrajanja;
	}


	public String getNazivProizvoda() {
		return nazivProizvoda;
	}
	
	public void setNazivProizvoda(String nazivProizvoda) {
		this.nazivProizvoda = nazivProizvoda;
	}
	
	public double getCenaProizvoda() {
		return cenaProizvoda;
	}
	
	public void setCenaProizvoda(double cenaProizvoda) {
		this.cenaProizvoda = cenaProizvoda;
	}
	
	public String getRokTrajanja() {
		return rokTrajanja;
	}
	
	public void setRokTrajanja(String rokTrajanja) {
		this.rokTrajanja = rokTrajanja;
	}
	
	
	public abstract double izracunajCenu();

	
	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " - " + nazivProizvoda + ", cena bez PDV-a: " + 
	cenaProizvoda + ", rok trajanja: " + rokTrajanja + ", cena sa PDV-om: " + izracunajCenu();
	}
	
}
