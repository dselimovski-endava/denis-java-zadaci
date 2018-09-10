package zadatak8;

/**
 * @author Denis.Selimovski
 *
 */
public class Trougao extends GeometrijskaSlika {
	
	private double a;

	
	public Trougao() {
		super();
	}

	
	public Trougao(double a) {
		super();
		this.setA(a);
	}


	public double getA() {
		return a;
	}


	public void setA(double a) {
		this.a = a;
	}


	@Override
	public double povrsina() {
		return (Math.pow(a, 2)*Math.sqrt(3)) / 4;
	}


	@Override
	public double obim() {
		return 3*a;
	}


	@Override
	public String toString() {
		return String.format("Trougao [Povrsina = %.2f, Obim = %.2f]", povrsina(), obim());
	}
	
	
}
