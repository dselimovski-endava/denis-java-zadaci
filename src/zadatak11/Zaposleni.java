package zadatak11;

/**
 * @author Denis.Selimovski
 *
 */
public abstract class Zaposleni {
	
	private String ime;
	private String prezime;
	private String adresa;
	private String telefon;
	private String datumRodjenja;
	
		
	protected Zaposleni() {
	}

	protected Zaposleni(String ime, String prezime, String adresa, String telefon, String datumRodjenja) {
		this.ime = ime;
		this.prezime = prezime;
		this.adresa = adresa;
		this.telefon = telefon;
		this.datumRodjenja = datumRodjenja;
	}
	

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public String getAdresa() {
		return adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	public String getTelefon() {
		return telefon;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}

	public String getDatumRodjenja() {
		return datumRodjenja;
	}

	public void setDatumRodjenja(String datumRodjenja) {
		this.datumRodjenja = datumRodjenja;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " - " + ime + " " + prezime + ", adresa: " + adresa + ", telefon: " + telefon
				+ ", datum rodjenja: " + datumRodjenja;
	}
	
}