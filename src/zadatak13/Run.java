package zadatak13;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author Denis.Selimovski
 *
 */

/**
 * Napisati isti program kao u Zadatku 2 koji vraca drugaciji rezultat: imena
 * studenta i poeni na testu se nalaze u nekom fajlu "poeni.txt". Zadatak je
 * ispisati na standardni izlaz spisak studenata (ime, poeni i ocena) sortiran
 * po poenima.
 */
public class Run {

	public static Scanner sc;

	public static void main(String[] args) {

		ArrayList<Student> listaStudenata = new ArrayList<>();
		File fajl = new File("poeni.txt");

		try {
			sc = new Scanner(fajl);
			while (sc.hasNext()) {
				String ime = sc.next();
				double poeni = sc.nextDouble();
				Student student = new Student(ime, poeni);
				listaStudenata.add(student);
			}
			sc.close();
			Collections.sort(listaStudenata);
			for (Student s : listaStudenata) {
				System.out.println(s.toString());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
