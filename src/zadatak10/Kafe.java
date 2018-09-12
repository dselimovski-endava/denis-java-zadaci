package zadatak10;

/**
 * @author Denis.Selimovski
 *
 */
public class Kafe extends Proizvod {
	
	private TipKafe tipKafe;
	private static final double NIZA_STOPA_PDV = 0.08;
	
	public Kafe() {
		super();
	}
	
	public Kafe(TipKafe tipKafe) {
		super();
		this.tipKafe = tipKafe;
	}
	
	public Kafe(String nazivProizvoda, double cenaProizvoda, String rokTrajanja) {
		super(nazivProizvoda, cenaProizvoda, rokTrajanja);
	}

	public Kafe(String nazivProizvoda, double cenaProizvoda, String rokTrajanja, TipKafe tipKafe) {
		super(nazivProizvoda, cenaProizvoda, rokTrajanja);
		this.tipKafe = tipKafe;
	}
	
	
	public TipKafe getTipKafe() {
		return tipKafe;
	}

	public void setTipKafe(TipKafe tipKafe) {
		this.tipKafe = tipKafe;
	}

	public static double getNizaStopaPdv() {
		return NIZA_STOPA_PDV;
	}

	@Override
	public String toString() {
		return super.toString() + ", tip kafe: " + tipKafe;
	}

	@Override
	public double izracunajCenu() {
		return NIZA_STOPA_PDV*this.getCenaProizvoda() + this.getCenaProizvoda();
	}
	
}
