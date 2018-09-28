package zadatak11;

import java.util.ArrayList;

/**
 * @author Denis.Selimovski
 *
 */
public class Bolnica {
	
	private String nazivBolnice;
	private String direktor;
	private ArrayList<Lekar> lekari;
	private ArrayList<MedicinskaSestra> sestre;
	private ArrayList<Osoblje> osoblje;
	
	
	public Bolnica() {
	}

	public Bolnica(String nazivBolnice, String direktor, ArrayList<Lekar> lekari, ArrayList<MedicinskaSestra> sestre,
			ArrayList<Osoblje> osoblje) {
		this.nazivBolnice = nazivBolnice;
		this.direktor = direktor;
		this.lekari = lekari;
		this.sestre = sestre;
		this.osoblje = osoblje;
	}

	
	public String getNazivBolnice() {
		return nazivBolnice;
	}

	public void setNazivBolnice(String nazivBolnice) {
		this.nazivBolnice = nazivBolnice;
	}

	public String getDirektor() {
		return direktor;
	}

	public void setDirektor(String direktor) {
		this.direktor = direktor;
	}

	public ArrayList<Lekar> getLekari() {
		return lekari;
	}

	public void setLekari(ArrayList<Lekar> lekari) {
		this.lekari = lekari;
	}

	public ArrayList<MedicinskaSestra> getSestre() {
		return sestre;
	}

	public void setSestre(ArrayList<MedicinskaSestra> sestre) {
		this.sestre = sestre;
	}

	public ArrayList<Osoblje> getOsoblje() {
		return osoblje;
	}

	public void setOsoblje(ArrayList<Osoblje> osoblje) {
		this.osoblje = osoblje;
	}

	@Override
	public String toString() {
		return "Bolnica - " + nazivBolnice + ", direktor=" + direktor + ", lekari=" + lekari + ", sestre="
				+ sestre + ", osoblje=" + osoblje;
	}
	
}