package zadatak9;

/**
 * @author Denis.Selimovski
 *
 */
public abstract class Nekretnina {
	
	private String adresa;
	private int zona;
	private double kvadratura;
	private Vlasnik vlasnik;
	
	protected Nekretnina() {
	}

	protected Nekretnina(String adresa, int zona, double kvadratura, Vlasnik vlasnik) {
		this.adresa = adresa;
		if(0 < zona && 5 > zona)
			this.zona = zona;
		else
			throw new IllegalArgumentException("GRESKA - Zona mora biti u opsegu od 1 do 4!!!");
		if(0 < kvadratura)
			this.kvadratura = kvadratura;
		else
			throw new IllegalArgumentException("GRESKA - Kvadratura mora biti veca od nule!!!");
		this.vlasnik = vlasnik;
	}

	
	public String getAdresa() {
		return adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	public int getZona() {
		return zona;
	}

	public void setZona(int zona) {
		if(0 < zona && 5 > zona)
			this.zona = zona;
		else
			throw new IllegalArgumentException("GRESKA - Zona mora biti u opsegu od 1 do 4!!!");
	}

	public double getKvadratura() {
		return kvadratura;
	}

	public void setKvadratura(double kvadratura) {
		if(0.0 < kvadratura)
			this.kvadratura = kvadratura;
		else
			throw new IllegalArgumentException("GRESKA - Kvadratura mora biti veca od nule!!!");
	}

	public Vlasnik getVlasnik() {
		return vlasnik;
	}

	public void setVlasnik(Vlasnik vlasnik) {
		this.vlasnik = vlasnik;
	}
	
	public double cenaKvadrata() {
		switch (zona) {
			case 1:
				return 3000;
			case 2:
				return 2000;
			case 3:
				return 1000;
			default:
				return 500;
		}
	}
	
	public abstract double izracunajCenu();

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " - adresa: " + adresa + ", zona: " + zona + ", kvadratura: " + kvadratura + ", vlasnik:" + vlasnik
				+ ", cena: " + izracunajCenu();
	}	
	
}