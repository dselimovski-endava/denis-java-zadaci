package zadatak11;

import java.util.ArrayList;

/**
 * @author Denis.Selimovski
 *
 */
public class Firma {
	
	private ArrayList<Bolnica> bolnice;

	
	public Firma() {
	}
	
	public Firma(ArrayList<Bolnica> bolnice) {
		this.bolnice = bolnice;
	}

	
	public ArrayList<Bolnica> getBolnice() {
		return bolnice;
	}

	public void setBolnice(ArrayList<Bolnica> bolnice) {
		this.bolnice = bolnice;
	}

	@Override
	public String toString() {
		int brojLekara = 0;
		int brojSestara = 0;
		int brojOsoblja= 0;
		
		for (Bolnica bolnica : bolnice) {
			brojLekara += bolnica.getLekari().size();
			brojSestara += bolnica.getSestre().size();
			brojOsoblja += bolnica.getOsoblje().size();
		}
		
		return "Firma - broj bolnica: " + bolnice.size() + ", broj lekara: " + brojLekara + ", broj medicinskih sestara: " + brojSestara + ", broj ostalog osoblja: " + brojOsoblja;
	}	

}