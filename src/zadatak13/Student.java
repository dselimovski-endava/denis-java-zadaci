package zadatak13;

/**
 * @author Denis.Selimovski
 *
 */
public class Student implements Comparable<Student> {
	
	private String ime;
	private double brojPoena;
	
	public Student() {
	}
	
	public Student(String ime, double brojPoena) {
		this.ime = ime;
		if(0 <= brojPoena && 100 >= brojPoena)
			this.brojPoena = brojPoena;
		else if(0 > brojPoena)
			this.brojPoena = 0;
		else
			this.brojPoena = 100;
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
		if(0 <= brojPoena && 100 >= brojPoena)
			this.brojPoena = brojPoena;
		else if(0 > brojPoena)
			this.brojPoena = 0;
		else
			this.brojPoena = 100;
	}

	public int odrediOcenu() {
		if(91 <= brojPoena)
			return 10;
		else if(81 <= brojPoena && 90 >= brojPoena)
			return 9;
		else if(71 <= brojPoena && 80 >= brojPoena)
			return 8;
		else if(61 <= brojPoena && 70 >= brojPoena)
			return 7;
		else if(51 <= brojPoena && 60 >= brojPoena)
			return 6;
		else
			return 5;
	}
	
	@Override
	public int compareTo(Student s) {
		if(this.getBrojPoena() == s.getBrojPoena())
			return 0;
		else if(this.getBrojPoena() > s.getBrojPoena())
			return -1;
		else
			return 1;
	}
	
	@Override
	public String toString() {
		return ime + " - broj poena: " + brojPoena + ", ocena: " + odrediOcenu();
	}
}
