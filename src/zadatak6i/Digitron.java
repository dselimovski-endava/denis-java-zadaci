package zadatak6i;

import java.util.Scanner;

/**
 * @author Denis.Selimovski
 *
 */

/**
 * Modifikacija digitrona od prosle nedelje. Sve operacije smestiti u posebne metode, i kada jeto potrebno pozvati 
 * odgovarajucu metodu. Vrteti se u petlji, sve dok se za kod operacije ne unese nepostojeci kod (default kod 
 * switch-a).
 */

public class Digitron {

	public static Scanner ulaz = new Scanner(System.in);
	public static double broj1;
	public static double broj2;
	public static char kodOperacije;
	public static double rezultat;
	public static boolean nastavi = true;
	
	public static void main(String[] args) {
		
		while (nastavi) {
			System.out.print("Unesite prvi broj: ");
			broj1 = unosBrojeva();
			
			System.out.print("Unesite drugi broj: ");
			broj2 = unosBrojeva();
			
			System.out.print("Unesite kod operacije: ");
			kodOperacije = ulaz.next().charAt(0);
			
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
						
					default:
						System.out.println("Kod nije podrzan!!! --- KRAJ PROGRAMA ---");
						nastavi = false;
						break;
				}
		}
		ulaz.close();
	}

	
	public static void sabiranje(double broj1, double broj2) {
		rezultat = broj1 + broj2;
		System.out.printf("Rezultat je: %.2f\n", rezultat);
	}
	
	public static void oduzimanje(double broj1, double broj2) {
		rezultat = broj1 - broj2;
		System.out.printf("Rezultat je: %.2f\n", rezultat);
	}
	
	public static void mnozenje(double broj1, double broj2) {
		rezultat = broj1 * broj2;
		System.out.printf("Rezultat je: %.2f\n", rezultat);
	}
	
	public static void deljenje(double broj1, double broj2) {
		rezultat = broj1 / broj2;
		System.out.printf("Rezultat je: %.2f\n", rezultat);
	}
	
	
	public static double unosBrojeva() {
		while (!ulaz.hasNextDouble()) {
			System.out.print("Pogresan unos, unesite broj: ");
			ulaz.next();
		} 
		return ulaz.nextDouble();
	}
	
}