package zadatak8;

/**
 * @author Denis.Selimovski
 *
 */
public class Kvadrat extends GeometrijskaSlika {

	private double a;


	public Kvadrat() {
		super();
	}

	public Kvadrat(double a) {
		super();
		this.a = a;
	}


	public double getA() {
		return a;
	}
	
	
	public void setA(double a) {
		this.a = a;
	}

	
	@Override
	public double povrsina() {
		return Math.pow(a, 2);
	}

	
	@Override
	public double obim() {
		return 4*a;
	}

	
	@Override
	public String toString() {
		return super.toString();
	}

}
