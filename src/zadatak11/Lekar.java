package zadatak11;

/**
 * @author Denis.Selimovski
 *
 */
public class Lekar extends Zaposleni {
	
	private String fakultet;

	
	public Lekar() {
		super();
	}

	public Lekar(String fakultet) {
		super();
		this.fakultet = fakultet;
	}
	
	public Lekar(String ime, String prezime, String adresa, String telefon, String datumRodjenja) {
		super(ime, prezime, adresa, telefon, datumRodjenja);
	}

	public Lekar(String ime, String prezime, String adresa, String telefon, String datumRodjenja, String fakultet) {
		super(ime, prezime, adresa, telefon, datumRodjenja);
		this.fakultet = fakultet;
	}

	
	public String getFakultet() {
		return fakultet;
	}

	public void setFakultet(String fakultet) {
		this.fakultet = fakultet;
	}

	@Override
	public String toString() {
		return super.toString() + ", fakultet: " + fakultet;
	}
	
}