package zadatak9;

/**
 * @author Denis.Selimovski
 *
 */
public class Vlasnik {
	
	private String imePrezime;
	private String jmbg;
	private String brojLicneKarte;
	
	public Vlasnik() {
	}

	public Vlasnik(String imePrezime, String jmbg, String brojLicneKarte) {
		if(imePrezime.matches("^[a-zA-Z]+[\\-'\\s]?[a-zA-Z ]+$"))
			this.imePrezime = imePrezime;
		else
			throw new IllegalArgumentException("GRESKA - Unesite ispravno Vase ime i prezime!!!");
		if(jmbg.length() == 13 && jmbg.matches("[0-9]+"))
			this.jmbg = jmbg;
		else
			throw new IllegalArgumentException("GRESKA - JMBG mora da sadrzi 13 cifara!!!");
		if(brojLicneKarte.length() == 9 && brojLicneKarte.matches("[0-9]+"))
			this.brojLicneKarte = brojLicneKarte;
		else
			throw new IllegalArgumentException("GRESKA - Broj licne karte mora da sadrzi 9 cifara!!!");
	}

	
	public String getImePrezime() {
		return imePrezime;
	}
	
	public void setImePrezime(String imePrezime) {
		if(imePrezime.matches("^[a-zA-Z]+[\\-'\\s]?[a-zA-Z ]+$"))
			this.imePrezime = imePrezime;
		else
			throw new IllegalArgumentException("GRESKA - Unesite ispravno Vase ime i prezime!!!");
	}

	public String getJmbg() {
		return jmbg;
	}

	public void setJmbg(String jmbg) {
		if(jmbg.length() == 13 && jmbg.matches("[0-9]+"))
			this.jmbg = jmbg;
		else
			throw new IllegalArgumentException("GRESKA - JMBG mora da sadrzi 13 cifara!!!");
	}

	public String getBrojLicneKarte() {
		return brojLicneKarte;
	}

	public void setBrojLicneKarte(String brojLicneKarte) {
		if(brojLicneKarte.length() == 9 && brojLicneKarte.matches("[0-9]+"))
			this.brojLicneKarte = brojLicneKarte;
		else
			throw new IllegalArgumentException("GRESKA - Broj licne karte mora da sadrzi 9 cifara!!!");
	}

	@Override
	public String toString() {
		return " " + imePrezime + ", JMBG: " + jmbg + ", broj licne karte: " + brojLicneKarte;
	}
	
}