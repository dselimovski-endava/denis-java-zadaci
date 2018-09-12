package zadatak8;

/**
 * @author Denis.Selimovski
 *
 */

public abstract class GeometrijskaSlika {
	
	public abstract double povrsina();
	public abstract double obim();
	
	@Override
	public String toString() {
		return String.format(this.getClass().getSimpleName() +  " [Povrsina = %.2f, Obim = %.2f]", povrsina(), obim());
	}
	
}
