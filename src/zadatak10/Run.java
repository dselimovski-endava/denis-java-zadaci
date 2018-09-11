package zadatak10;

/**
 * @author Denis.Selimovski
 *
 */

/**
 * Napisati program koji opisuje sledeci scenario:
 * Firma se bavi preprodajom prehrambenih proizvoda. Proizvode razlikujemo po sledecim kategorijama proizvoda:
 * 		- Mlecni proizvodi
 * 		- Kafe, Sokovi
 * 		- Meso
 * O svim proizvodima cuvamo informacije: ime proizvoda, cena proizvoda i rok trajanja.
 * Kod mlecnih proizvoda cuvamo i poreklo mleka.
 * Kod kafe da li je u zrnu ili samlevena.
 * O sokovima cuvamo od cega je sok.
 * Kod mesa cuvamo od koje zivotinje je meso.
 * Kod cene mlecnih proizvoda i sokova PDV je 20%, dok je za meso i kafu PDV na cenu 8%.
 */

public class Run {

	public static void main(String[] args) {
		
		Proizvod mleko = new MlecniProizvodi("Mleko moja kravica", 119.99, "29.11.2018.", "Srbija");
		Proizvod sok = new Sokovi("Next sok", 107.89, "07.05.2019", "narandza");
		Proizvod meso = new Meso("Pilece belo", 449.50, "19.09.2019.", "piletina");
		Proizvod kafa = new Kafe("Nescafe", 150, "30.12.2018.", TipKafe.SAMLEVENA);
		
		System.out.println(mleko.toString());
		System.out.println(sok.toString());
		System.out.println(meso.toString());
		System.out.println(kafa.toString());
	}

}
