package Zadatak4;

import java.util.ArrayList;
import java.util.Scanner;

public class Run {
	
	public static Scanner ulaz = new Scanner(System.in);
	public static int n;
	public static int brojStudenata;
	public static Student student = null;
	public static ArrayList<Student> lista = new ArrayList<>();
	public static Student najboljiStudent = null;
	public static double maxPoena = 0;
	
	
	public static void main(String[] args) {
		
		System.out.print("Unesite broj studenata: ");
		n = unosBroja();
		brojStudenata = proveraBroja(n);
		
		for (int i = 0; i < brojStudenata; i++) {
			student = new Student();
			
			System.out.print("Unesite ime studenata: ");
			student.setIme(unosImena());
			
			System.out.print("Unesite broj poena studenta: ");
			student.setBrojPoena(unosPoena());
			
			lista.add(student);
		}
		
		for (Student s : lista) {
			if(s.getBrojPoena() > maxPoena) {
				maxPoena = s.getBrojPoena();
				najboljiStudent = s;
			}
		}
		
		System.out.println("Student sa najvecim brojem poena je: " + najboljiStudent);
	}
	
	
	public static int unosBroja() {
		
		while(!ulaz.hasNextInt()) {
			System.out.print("GRESKA - Molimo unesite broj studenata (ceo broj): ");
			 ulaz.next();
		}
		
		return ulaz.nextInt();
	}	
	
	
	public static int proveraBroja(int n) {

		if(n <= 0) {
			while(n <= 0) {
				System.out.print("GRESKA - Molimo unesite broj studenata (ceo broj veci od nule): ");
				n = ulaz.nextInt();
			}
		}
		
		return n;
	} 
	
	
	public static double unosPoena() {
		
		while(!ulaz.hasNextDouble()) {
			System.out.print("GRESKA - Molimo unesite broj poena: ");
			ulaz.next();
		}
		
		return ulaz.nextDouble();
	}
	
	
	private static String unosImena() {
		
		String ime = "" ;
		while (!ime.matches("^[a-zA-Z]+[\\-'\\s]?[a-zA-Z ]+$")) {
			if (!ime.equals("")) {
				System.out.print("GRESKA - Molimo unesite ime studenta (String): ");
			}
			ime = ulaz.nextLine();
			
		}
		return ime;		
	}

}
