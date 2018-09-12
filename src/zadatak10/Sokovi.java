package zadatak10;

/**
 * @author Denis.Selimovski
 *
 */
public class Sokovi extends Proizvod {
	
	private String ukusSoka;
	private static final double VISA_STOPA_PDV = 0.2;

	
	public Sokovi() {
		super();
	}
	
	public Sokovi(String ukusSoka) {
		super();
		this.ukusSoka = ukusSoka;
	}

	public Sokovi(String nazivProizvoda, double cenaProizvoda, String rokTrajanja) {
		super(nazivProizvoda, cenaProizvoda, rokTrajanja);
	}

	public Sokovi(String nazivProizvoda, double cenaProizvoda, String rokTrajanja, String ukusSoka) {
		super(nazivProizvoda, cenaProizvoda, rokTrajanja);
		this.ukusSoka = ukusSoka;
	}
	

	public String getUkusSoka() {
		return ukusSoka;
	}

	public void setUkusSoka(String ukusSoka) {
		this.ukusSoka = ukusSoka;
	}

	public static double getVisaStopaPdv() {
		return VISA_STOPA_PDV;
	}

	
	@Override
	public String toString() {
		return super.toString() + ", ukus: " + ukusSoka;
	}

	@Override
	public double izracunajCenu() {
		return VISA_STOPA_PDV*this.getCenaProizvoda() + this.getCenaProizvoda();
	}
	
}
