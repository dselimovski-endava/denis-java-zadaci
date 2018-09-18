package zadatak12;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author Denis.Selimovski
 *
 */

/**
 * Napisati program koji umogucava unos imena studenta i broj poena osvojenih na
 * testu preko standardnog ulaza (sve dok se ne unese odredjen znak za prekid
 * unosa podataka). Broj poena sme da bude od 0 do 100. Kao rezultat programa,
 * ocekuje se izlazni fiajl "ocene.txt" u kome ce se nalaziti lista svih
 * studenata sortirana po poenima, od najvise ka najmanje, i gde ce se osim
 * imena studenta i boja poena nalaziti i ocena koju je dobio na ispiti. Ocena
 * 10 akoje imao vise od 90 poena, 9 ako je imao izmedju 81 i 90... Sve do 5 ako
 * je imao manje od 51 poena.
 */
public class Run {

	public static Scanner ulaz = new Scanner(System.in);

	public static void main(String[] args) {

		ArrayList<Student> listaStudenata = new ArrayList<>();
		boolean nastavi = true;

		do {
			System.out.print("Unesite ime studenta: ");
			String ime = unosImena();

			System.out.print("Unesite broj poena studenta: ");
			double brojPoena = unosPoena();

			Student student = new Student(ime, brojPoena);
			listaStudenata.add(student);

			System.out.print("Ukoliko zelite da prekinete dalji unos ukucajte 'ne': ");
			String nastaviStr = ulaz.next();
			if (nastaviStr.equalsIgnoreCase("ne"))
				nastavi = false;
		} while (nastavi);

		Collections.sort(listaStudenata);

		File fajl = new File("ocene.txt");
		try {
			PrintWriter pw = new PrintWriter(fajl);
			for (Student student : listaStudenata) {
				pw.println(student);
			}
			pw.close();
			System.out.println("Podaci uspesno upisani u fajl...");
		} catch (IOException ex) {
			System.out.println(ex);
		} finally {
			System.out.println("--- KRAJ PROGRAMA ---");
		}
		ulaz.close();
	}

	public static String unosImena() {
		while (!ulaz.hasNext("^[a-zA-Z]+[\\-'\\s]?[a-zA-Z ]+$")) {
			System.out.print("Pogresan unos, unesite ime studenta: ");
			ulaz.next();
		}
		return ulaz.next();
	}

	public static double unosPoena() {
		while (!ulaz.hasNextDouble()) {
			System.out.print("Pogresan unos, unesite broj poena: ");
			ulaz.next();
		}
		return ulaz.nextDouble();
	}
}
