package zadatak11;

/**
 * @author Denis.Selimovski
 *
 */
public class MedicinskaSestra extends Zaposleni {
	
	private String smena;

	
	public MedicinskaSestra() {
		super();
	}

	public MedicinskaSestra(String smena) {
		super();
		this.smena = smena;
	}
	
	public MedicinskaSestra(String ime, String prezime, String adresa, String telefon, String datumRodjenja) {
		super(ime, prezime, adresa, telefon, datumRodjenja);
	}

	public MedicinskaSestra(String ime, String prezime, String adresa, String telefon, String datumRodjenja, String smena) {
		super(ime, prezime, adresa, telefon, datumRodjenja);
		this.smena = smena;
	}

	
	public String getSmena() {
		return smena;
	}

	public void setSmena(String smena) {
		this.smena = smena;
	}

	@Override
	public String toString() {
		return super.toString() + ", smena: " + smena;
	}
	
}