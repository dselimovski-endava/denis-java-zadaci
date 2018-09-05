package Zadatak1;

import java.util.Random;
import java.util.Scanner;

public class SlucajnoGenerisanBroj {
	
	public static int broj;
	static Random r = new Random();
	public static int slucajanBroj = r.nextInt(50)+1;
	public static boolean nastavi;
	public static String nastaviStr;
	public static boolean nastavii;
	
	public static void main(String[] args) {
		
		Scanner ulaz;
		do {
			ulaz = new Scanner(System.in);
			
			do {
				System.out.print("Unesite broj od 1 do 50: ");
				
			    while (!ulaz.hasNextInt()) {
			        System.out.print("Molimo unesite broj!!! Broj: ");
			        ulaz.next(); 
			    }
			    broj = ulaz.nextInt();
			    
			} while (broj <= 0 || broj > 50);
			
			System.out.println("Slucajno generisan broj/Trazeni broj: " + slucajanBroj);

			if (slucajanBroj == broj)
				System.out.println("Neverovatno! Pogodili ste tacan broj!");
			else if (5 >= Math.abs(broj-slucajanBroj))
				System.out.println("Dobar pokusaj, bili ste jako blizu!!!");
			else
				System.out.println("Vise srece drugi put...");

			do {
				System.out.print("\nZelite li da ponovite igru (da/ne): ");
				nastaviStr = ulaz.next();
				if(nastaviStr.equalsIgnoreCase("da")) {
					nastavi = true;
					nastavii = false;
				}
				else if(nastaviStr.equalsIgnoreCase("ne")) {
					nastavi = false;
					nastavii = false;
				}
			 	else {
					System.out.println("Molimo unesite 'da' ili 'ne'");
					nastavii = true;
				} 
		
			 } while(nastavii);
			
		} while(nastavi);
		ulaz.close();
	}
}