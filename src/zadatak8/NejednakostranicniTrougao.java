package zadatak8;

/**
 * @author Denis.Selimovski
 *
 */
public class NejednakostranicniTrougao extends Trougao {
	
	private double b;
	private double c;
	

	public NejednakostranicniTrougao() {
		super();
	}

	public NejednakostranicniTrougao(double a) {
		super(a);
	}
	
	public NejednakostranicniTrougao(double a, double b, double c) {
		super(a);
		this.b = b;
		this.c = c;
	}
	

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}

	
	@Override
	public double povrsina() {
		double p = (getA() + b + c) / 2;
		return Math.sqrt(p*(p-getA())*(p-b)*(p-c));
	}

	@Override
	public double obim() {
		return getA() + b + c;
	}

	@Override
	public String toString() {
		return String.format("Nejednakostranicni trougao [Povrsina = %.2f, Obim = %.2f]", povrsina(), obim());
	}
	
	
	
}
