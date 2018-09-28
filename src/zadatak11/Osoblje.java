package zadatak11;

/**
 * @author Denis.Selimovski
 *
 */
public class Osoblje extends Zaposleni {
	
	public Osoblje() {
		super();
	}

	public Osoblje(String ime, String prezime, String adresa, String telefon, String datumRodjenja) {
		super(ime, prezime, adresa, telefon, datumRodjenja);
	}

	@Override
	public String toString() {
		return super.toString();
	}
	
}