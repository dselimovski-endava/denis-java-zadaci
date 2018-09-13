package zadatak10;

import java.util.ArrayList;

/**
 * @author Denis.Selimovski
 *
 */

/**
 * Napisati program koji opisuje sledeci scenario:
 * Firma se bavi preprodajom prehrambenih proizvoda. Proizvode razlikujemo po sledecim kategorijama proizvoda:
 * 		- Mlecni proizvodi
 * 		- Kafe
 * 		- Sokovi
 * 		- Meso
 * O svim proizvodima cuvamo informacije: ime proizvoda, cena proizvoda i rok trajanja.
 * Kod mlecnih proizvoda cuvamo i poreklo mleka.
 * Kod kafe da li je u zrnu ili samlevena.
 * O sokovima cuvamo od cega je sok.
 * Kod mesa cuvamo od koje zivotinje je meso.
 * Kod cene mlecnih proizvoda i sokova PDV je 20%, dok je za meso i kafu PDV na cenu 8%.
 * Firma ima polje kapital, listu proizvoda i metodu porudzbina() koja izracuna, proverava da li ima
 * dovoljno sredstava za porudzbinu na osnovu liste proizvoda. Nakon uspesne porudzbine lista ostaje 
 * prazna.
 */

public class Run {

	public static void main(String[] args) {
		
		Proizvod mleko = new MlecniProizvodi("Mleko moja kravica", 119.99, "29.11.2018.", "Srbija");
		//provera da je cena mleka na akcije zbog isteka roka trajanja koji je manji od 5 dana
		Proizvod mlekoAkcija = new MlecniProizvodi("Mleko moja kravica", 119.99, "15.09.2018.", "Srbija");
		Proizvod sok = new Sokovi("Next sok", 107.89, "07.05.2019", "narandza");
		Proizvod meso = new Meso("Pilece belo", 449.50, "19.09.2019.", "piletina");
		//provera da je cena mesa na akcije zbog isteka roka trajanja koji je manji od 5 dana
		Proizvod mesoAkcija = new Meso("Pilece belo", 449.50, "17.09.2018.", "piletina");
		Proizvod kafa = new Kafe("Nescafe", 150, "30.12.2018.", TipKafe.SAMLEVENA);
		
		ArrayList<Proizvod> lista1 = new ArrayList<>();
		lista1.add(mleko);
		lista1.add(mlekoAkcija);
		lista1.add(sok);
		lista1.add(meso);
		lista1.add(mesoAkcija);
		lista1.add(kafa);
		
		ArrayList<Proizvod> lista2 = new ArrayList<>();
		lista2.add(mleko);
		lista2.add(sok);
		lista2.add(meso);
		lista2.add(kafa);

		Firma firma1 = new Firma(8000, lista1);
		firma1.porudzbina();
		
		System.out.println();
		
		Firma firma2 = new Firma(500, lista2);
		firma2.porudzbina();
	}

}