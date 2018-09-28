package zadatak10;

import java.util.ArrayList;

/**
 * @author Denis.Selimovski
 *
 */
public class Firma {
	
	private double kapital;
	private ArrayList<Proizvod> listaProizvoda;
	
	
	public Firma() {
	}
	
	public Firma(double kapital, ArrayList<Proizvod> listaProizvoda) {
		this.kapital = kapital;
		this.listaProizvoda = listaProizvoda;
	}

	
	public double getKapital() {
		return kapital;
	}
	
	public void setKapital(double kapital) {
		this.kapital = kapital;
	}
	
	public ArrayList<Proizvod> getListaProizvoda() {
		return listaProizvoda;
	}
	
	public void setListaProizvoda(ArrayList<Proizvod> listaProizvoda) {
		this.listaProizvoda = listaProizvoda;
	} 
	
	public void porudzbina() {
		double iznosPorudzbine = 0;
		for(Proizvod proizvod : listaProizvoda) {
			iznosPorudzbine += proizvod.izracunajCenu();
		}
		if(kapital >= iznosPorudzbine) {
			System.out.println("Uspesno izvrsena porudzbina");
			kapital -= iznosPorudzbine;
			System.out.println("Trenutni kapital: " + kapital);
			System.out.println("Porudzbina: " + listaProizvoda.toString());
			listaProizvoda.clear();
			System.out.println("Korpa ispraznjena: " + listaProizvoda.toString());
		}
		else {
			System.out.println("Nemate dovoljno sredstava!!!\n" + "Trenutni kapital: " + kapital);
		}
	}
	
}