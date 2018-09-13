package zadatak10;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

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
		int danRoka = Integer.parseInt(this.getRokTrajanja().substring(0, 2));
		int mesecRoka = Integer.parseInt(this.getRokTrajanja().substring(3, 5));
		int godinaRoka = Integer.parseInt(this.getRokTrajanja().substring(6, 10));
		
		Date danasnjiDat = new Date(System.currentTimeMillis());
		DateFormat formatDatuma = new SimpleDateFormat("yyyy/MM/dd");
		String danasnjiDatum = formatDatuma.format(danasnjiDat).toString();
		int trenutniDan = Integer.parseInt(danasnjiDatum.substring(8, 10));
		int trenutniMesec = Integer.parseInt(danasnjiDatum.substring(5, 7));
		int trenutnaGodina = Integer.parseInt(danasnjiDatum.substring(0, 4));
		
		if(5>=danRoka-trenutniDan && mesecRoka==trenutniMesec && godinaRoka==trenutnaGodina) {
			return VISA_STOPA_PDV*(this.getCenaProizvoda()/2) + (this.getCenaProizvoda()/2);
		}
		else
			return VISA_STOPA_PDV*this.getCenaProizvoda() + this.getCenaProizvoda();
	}
	
}