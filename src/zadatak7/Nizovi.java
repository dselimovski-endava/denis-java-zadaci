package zadatak7;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Denis.Selimovski
 *
 */

/**
 * Za uneti niz celih brojeva duzine n (koja se takodje unosi), sortirati niz, ispitati da li sadrzi broj x i 
 * ispitati prvih 5 clanova niza na standardni izlaz. Koristiti klasu Arrays.
 */
public class Nizovi {
	
	public static int n;
	public static int x;
	public static int[] niz;
	public static boolean nadjen;
	public static Scanner ulaz = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.print("Unesite broj x: ");
		x = unosBroja();
		
		do {
			System.out.print("Unesite duzinu niza (najmanje 5):");
			n = unosBroja();
		} while(5 > n);
		
		 niz = new int[n];
		
		for (int i = 0; i < niz.length; i++) {
			System.out.print(new StringBuilder("Unesite ").append(i+1).append(". clan niza: "));
			niz[i] = unosBroja();
		}
		
		Arrays.sort(niz);
		
		for (int clan : niz) {
			if(clan == x) {
				System.out.println(new StringBuilder("Niz sadrzi broj ").append(x));
				nadjen = true;
				break;
			}
		}
		
		if(!nadjen) {
			System.out.println(new StringBuilder("Niz ne sadrzi broj ").append(x));
		}
		
		System.out.println(new StringBuilder("CEO NIZ: ").append(Arrays.toString(niz)));
		System.out.print("PRVIH 5 CLANOVA: ");
		for (int i = 0; i < 5; i++) {
			System.out.print(niz[i] + " ");
		}
		
	}
	
	
	private static int unosBroja() {
		while(!ulaz.hasNextInt()) {
			System.out.print("Pogresan unos, unesite ceo broj: ");
			ulaz.next();
		}
		return ulaz.nextInt();
	}
	
}
