package zadatak11;

import java.util.ArrayList;

/**
 * @author Denis.Selimovski
 *
 */

/**
 * Napisati program koji opisuje sledeci scenario:
 * Firma posedujeniz privatnih bolnica. Svaka bolnica ima svoje zaposlene. Zaposleni mogu biti:
 * 		- Lekari
 * 		- Osoblje
 * 		- Medicinske sestre.
 * Bolnica sadrzi informacije o nazivu, direktoru i broju zaposlenih. Podaci koji se cuvaju o lekaru su:
 * 		- Fakultet
 * 		- Ime
 * 		- Prezime
 * 		- Adresa
 * 		- Telefon
 * 		- Datum rodjenja.
 * O osobllju cuvamo iste stvari, osim informacije o fakultetu. Za medicinske sestre jos i smenu. Firma
 * sadrzi metodu toString() koja ispisuje koliko poseduje bolnica i lekara, medicinskih sestara i 
 * osoblja ponaosob.
 */

public class Run {

	public static void main(String[] args) {
		
		Lekar lekar1 = new Lekar("Marko", "Markovic", "Agostina Neta 13", "064/325-7967", "11.09.1973.", "Medicinski fakultet");
		Lekar lekar2 = new Lekar("Petar", "Petrovic", "Omladinskih brigada 115", "063/377-5769", "15.11.1977.", "Medicinski fakultet");
		Lekar lekar3 = new Lekar("Ivan", "Ivanovic", "Jurija Gagarina 227", "061/853-3275", "23.07.1981.", "Medicinski fakultet");
		
		MedicinskaSestra sestra1 = new MedicinskaSestra("Ivana", "Ivanovic", "Jurija Gagarina 227", "061/753-3421", "21.07.1989.", "prva");
		MedicinskaSestra sestra2 = new MedicinskaSestra("Jelena", "Jelenkovic", "Surcinski put bb", "061/816-3785", "25.09.1987.", "druga");
		MedicinskaSestra sestra3 = new MedicinskaSestra("Milica", "Milicevic", "Jurija Gagarina 175", "065/753-3789", "23.11.1991.", "treca");
		MedicinskaSestra sestra4 = new MedicinskaSestra("Ivona", "Mihajlovic", "Jurija Gagarina 259", "061/443-3388", "23.01.1991.", "treca");
		MedicinskaSestra sestra5 = new MedicinskaSestra("Katarina", "Mihajlovic", "Jurija Gagarina 259", "063/334-8855", "23.01.1991.", "prva");
		
		Osoblje osoblje1 = new Osoblje("Janko", "Jankovic", "Hilandarska 113", "064/865-5789", "13.11.1991");
		Osoblje osoblje2 = new Osoblje("Milena", "Milenkovic", "Cara Urosa 195", "060/853-9823", "27.03.1979");
		Osoblje osoblje3 = new Osoblje("Jovana", "Jovanovic", "Cara Urosa 255", "066/896-2589", "23.05.1989");
		
		ArrayList<Lekar> lekari = new ArrayList<>();
		lekari.add(lekar1);
		lekari.add(lekar2);
		
		ArrayList<Lekar> lekari2 = new ArrayList<>();
		lekari2.add(lekar3);
		
		ArrayList<MedicinskaSestra> sestre = new ArrayList<>();
		sestre.add(sestra1);
		sestre.add(sestra2);
		sestre.add(sestra3);
		
		ArrayList<MedicinskaSestra> sestre2 = new ArrayList<>();
		sestre2.add(sestra4);
		sestre2.add(sestra5);
		
		ArrayList<Osoblje> osobljeLista = new ArrayList<>();
		osobljeLista.add(osoblje1);
		osobljeLista.add(osoblje2);
		
		ArrayList<Osoblje> osobljeLista2 = new ArrayList<>();
		osobljeLista2.add(osoblje3);
		
		Bolnica bolnica1 = new Bolnica("Dom zdravlja NBGD", "Jelena Vasiljevic", lekari, sestre, osobljeLista);
		Bolnica bolnica2 = new Bolnica("Dr Ristic", "Petra Podolski", lekari2, sestre2, osobljeLista2);
		
		ArrayList<Bolnica> bolnice = new ArrayList<>();
		bolnice.add(bolnica1);
		bolnice.add(bolnica2);
		
		Firma firma = new Firma(bolnice);
		System.out.println(firma.toString());
		
	}

}
