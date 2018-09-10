package zadatak4;

/**
 * @author Denis.Selimovski
 *
 */

/**
 * Koriscenjem for petlje pronaci i ispisati ime studenta sa najvicem brojem poena na testu. Prvo
 * se unosi broj studenata n, posle se n puta obilazi for petlja i unose ime i broj poena studenta.
 * Zapamti onog sa najvecim brojem poena.
 *
 */

public class Student {
	
	private String ime;
	private double brojPoena;
	
	public Student() {
	}
	
	public Student(String ime, double brojPoena) {
		this.ime = ime;
		this.brojPoena = brojPoena;
	}

	public String getIme() {
		return ime;
	}
	
	public void setIme(String ime) {
			this.ime = ime;		
	}
	
	public double getBrojPoena() {
		return brojPoena;
	}
	
	public void setBrojPoena(double brojPoena) {
		this.brojPoena = brojPoena;
	}

	@Override
	public String toString() {
		return ime + " - " + brojPoena + " poena";
	}
	
}
