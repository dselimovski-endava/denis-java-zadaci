package zadatak10;

/**
 * @author Denis.Selimovski
 *
 */
public class Meso extends Proizvod {
	
	private String vrstaMesa;
	private static final double NIZA_STOPA_PDV = 0.08;
	
	
	public Meso() {
		super();
	}
	
	public Meso(String vrstaMesa) {
		super();
		this.vrstaMesa = vrstaMesa;
	}

	public Meso(String nazivProizvoda, double cenaProizvoda, String rokTrajanja) {
		super(nazivProizvoda, cenaProizvoda, rokTrajanja);
	}

	public Meso(String nazivProizvoda, double cenaProizvoda, String rokTrajanja, String vrstaMesa) {
		super(nazivProizvoda, cenaProizvoda, rokTrajanja);
		this.vrstaMesa = vrstaMesa;
	}
	
	
	public String getVrstaMesa() {
		return vrstaMesa;
	}

	public void setVrstaMesa(String vrstaMesa) {
		this.vrstaMesa = vrstaMesa;
	}

	public static double getNizaStopaPdv() {
		return NIZA_STOPA_PDV;
	}

	
	@Override
	public String toString() {
		return super.toString() + ", vrsta mesa: " + vrstaMesa;
	}

	@Override
	public double izracunajCenu() {
		return NIZA_STOPA_PDV*this.getCenaProizvoda() + this.getCenaProizvoda();
	}
	
}
