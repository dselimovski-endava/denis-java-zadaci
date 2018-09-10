package zadatak8;

/**
 * @author Denis.Selimovski
 *
 */
public class Elipsa extends Krug {
	
	private double r2;
	
	
	public Elipsa() {
		super();
	}

	public Elipsa(double r) {
		super(r);
	}
	
	public Elipsa(double r, double r2) {
		super(r);
		this.r2 = r2;
	}

	
	public double getR2() {
		return r2;
	}

	public void setR2(double r2) {
		this.r2 = r2;
	}

	
	@Override
	public double povrsina() {
		return getR()*r2*Math.PI;
	}

	@Override
	public double obim() {
		return (getR()*Math.PI*(9-Math.sqrt(35)) / 2);
	}

	@Override
	public String toString() {
		return String.format("Elipsa [Povrsina = %.2f, Obim = %.2f]", povrsina(), obim());
	}
	
	
	
}
