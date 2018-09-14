package Zadatak2;

/**
 * @author Denis.Selimovski
 *
 */

/**
 * Napisati program koji ce predstavljati jednostavan digitron. Program treba da radi tako sto
 * korisnik unese dva cela broja, zatim kod operacije koji zeli da izvrsi ('s' - sabiranje, 'o' -
 * oduzimanje, 'm' - mnozenje, 'd' - deljenje). Kao rezultat se ocekuje ispisivanje rezultata
 * te operacije nad unetim operandima.
 *
 */

import java.util.Scanner;

public class Digitron {

	public static int broj1;
	public static int broj2;
	public static char kodOperacije;
	public static double rezultat;
	public static boolean nastavi = true;
	public static String nastaviStr;
	public static Scanner ulaz = new Scanner(System.in);

	public static void main(String[] args) {

		while (nastavi) {
			System.out.print("Unesite prvi broj: ");
			broj1 = unosBrojeva();

			System.out.print("Unesite drugi broj: ");
			broj2 = unosBrojeva();

			System.out.println("Unesite kod operacije: ");
			kodOperacije = unosOperacije();

			try {
				switch (kodOperacije) {
				case 's':
					sabiranje(broj1, broj2);
					break;

				case 'o':
					oduzimanje(broj1, broj2);
					break;

				case 'm':
					mnozenje(broj1, broj2);
					break;

				case 'd':
					deljenje(broj1, broj2);
					break;
				}

				System.out.println("Rezultat je: " + rezultat);
			} catch (ArithmeticException ex) {
				System.err.println(ex);
			}

			System.out.print("Zelite li da nastavite: ");
			nastaviStr = ulaz.next();
			if (nastaviStr.equalsIgnoreCase("da"))
				nastavi = true;
			else
				nastavi = false;
		}
		ulaz.close();
	}

	public static void sabiranje(int br1, int br2) {
		rezultat = br1 + br2;
	}

	public static void oduzimanje(int br1, int br2) {
		rezultat = br1 - br2;
	}

	public static void mnozenje(int br1, int br2) {
		rezultat = br1 * br2;
	}

	public static void deljenje(int br1, int br2) {
		if (br2 == 0)
			throw new ArithmeticException("Delilac ne moze biti nula!!!");
		rezultat = (double) br1 / br2;
	}

	public static int unosBrojeva() {
		while (!ulaz.hasNextInt()) {
			System.out.print("Pogresan unos, unesite ceo broj: ");
			ulaz.next();
		}
		return ulaz.nextInt();
	}

	public static char unosOperacije() {
		while (!ulaz.hasNext("[somd]")) {
			System.out.print("Pogresan unos, unesite kod operacije: ");
			ulaz.next();
		}
		return ulaz.next().charAt(0);
	}

}
