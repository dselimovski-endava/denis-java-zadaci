package zadatak9;

/**
 * @author Denis.Selimovski
 *
 */

/**	
 	* Kreirati projekat Nekretnina na sledeci nacin:	
 	* - Apstraktna klasa nekretnina koja od atributa ima
 	* - adresu, zonu, kvadraturu i podatke o vlasniku/instancu klase Vlasnik.	
 	* - Vlasnik ima puno ime i prezime, JMBG i broj licne karte.	
 	* - Izvedene klase, Stan i Kuca imaju to String() metod gde se ispisuju sve informacije o nekretnini ukljucujuci 
 	* Vlasnika i cenu
 	* - Cena se racunapo principu kvadratura X zona (I zona 3000, II zona 2000, III zona 1000, IV zona 500e)	
 	* - Kuca ima dodatno polje povrsinaOkucnice	
 	* - U cenu kuce ulazi i cena okucnice koja se racuna po principu (povrsinaOkucnice X Zona X 15%)	
 	* - Stan ima dva dodatna polja, povrsinaPodruma i povrsinaTerase	
 	* - u cenu Stana ulazi i podruma i terase ((povrsinaPodruma + povrsinaTerase) X Zona X 33%)	
 	* Napraviti Main klasu i u njoj kreirati instance klae Nekretnina i napraviti objekte izvedenih klasa sa	
 	* proizvoljnim argumentima. Ispisati String repreentaciju objekata - toString().	
*/

public class Run {

	public static void main(String[] args) {
		try {
			Nekretnina kuca = new Kuca("Surcinski put bb", 3, 115, new Vlasnik("Marko Markovic", "2711989536872", "597624538"), 37.25);
			Nekretnina stan = new Stan("Jurija Gagarina 259", 4, 67.50, new Vlasnik("Petar Petrovic", "1107975357996", "957624381"), 8.99, 7.75);
			
			System.out.println(kuca.toString());
			System.out.println(stan.toString());
		} catch (IllegalArgumentException ex) {
			System.out.println(ex);
		}
	}

}
