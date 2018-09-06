package Zadatak4;

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
