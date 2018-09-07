package Zadatak3;

import java.util.Scanner;

public class ParniBrojevi {
	
	public static int a;
	public static int b;
	public static Scanner ulaz;
	
	public static int unosBroja() {
		ulaz = new Scanner(System.in);
		
		while(!ulaz.hasNextInt()) {
			System.out.print("GRESKA - Molimo unesite ceo broj: ");
			ulaz.next();
		}
		
		return ulaz.nextInt();
	}
	
	
	public static void main(String[] args) {
		
		System.out.print("Molimo unesite broj 'a': ");
		a = unosBroja();
		
		System.out.print("Molimo unesite broj 'b': ");		
		b = unosBroja();
		
		if(a <= b) {
			System.out.print("Parni brojevi su: ");
			while(a <= b) {
				if(a % 2 == 0)
					System.out.print(a + " ");
				a++;
			}
		}
		else {
			System.out.print("Parni brojevi su: ");
			while(a >= b) {
				if(b % 2 == 0)
					System.out.print(b + " ");
				b++;
			}
		}
		
		ulaz.close();
		
	}
	
}
