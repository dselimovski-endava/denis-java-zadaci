package zadatak10;

/**
 * @author Denis.Selimovski
 *
 */
public class MlecniProizvodi extends Proizvod {
	
	private String porekloMleka;
	private static final double VISA_STOPA_PDV = 0.2;

	
	public MlecniProizvodi() {
		super();
	}

	public MlecniProizvodi(String porekloMleka) {
		super();
		this.porekloMleka = porekloMleka;
	}

	public MlecniProizvodi(String nazivProizvoda, double cenaProizvoda, String rokTrajanja) {
		super(nazivProizvoda, cenaProizvoda, rokTrajanja);
	}

	public MlecniProizvodi(String nazivProizvoda, double cenaProizvoda, String rokTrajanja, String porekloMleka) {
		super(nazivProizvoda, cenaProizvoda, rokTrajanja);
		this.porekloMleka = porekloMleka;
	}
	
	public String getPorekloMleka() {
		return porekloMleka;
	}

	public void setPorekloMleka(String porekloMleka) {
		this.porekloMleka = porekloMleka;
	}
	
	public static double getVisaStopaPdv() {
		return VISA_STOPA_PDV;
	}	

	
	@Override
	public String toString() {
		return super.toString() + ", poreklo: " + porekloMleka;
	}

	@Override
	public double izracunajCenu() {
		return VISA_STOPA_PDV*this.getCenaProizvoda() + this.getCenaProizvoda();
	}	
	
	
	
	
}
