package zadatak8;

/**
 * @author Denis.Selimovski
 *
 */
public class Krug extends GeometrijskaSlika {

	private double r;
	
	
	public Krug() {
		super();
	}

	public Krug(double r) {
		super();
		this.r = r;
	}


	public double getR() {
		return r;
	}

	
	public void setR(double r) {
		this.r = r;
	}
	
	
	@Override
	public double povrsina() {
		return Math.pow(r, 2)*Math.PI;
	}

	
	@Override
	public double obim() {
		return 2*r*Math.PI;
	}

	
	@Override
	public String toString() {
		return super.toString();
	}


	

}
