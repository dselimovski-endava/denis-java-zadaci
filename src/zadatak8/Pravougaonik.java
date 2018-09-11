package zadatak8;

/**
 * @author Denis.Selimovski
 *
 */
public class Pravougaonik extends Kvadrat {
	
	private double b;
	

	public Pravougaonik() {
		super();
	}

	public Pravougaonik(double a) {
		super(a);
	}
	
	public Pravougaonik(double a, double b) {
		super(a);
		this.b = b;
	}

	
	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	
	@Override
	public double povrsina() {
		return getA()*b;
	}

	@Override
	public double obim() {
		return 2*getA() + 2*b;
	}

	@Override
	public String toString() {
		return super.toString();
	}
	
	
	
	
}
