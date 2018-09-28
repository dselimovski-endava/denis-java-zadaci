package zadatak10;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

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
			return NIZA_STOPA_PDV*(this.getCenaProizvoda()/2) + (this.getCenaProizvoda()/2);
		}
		else
			return NIZA_STOPA_PDV*this.getCenaProizvoda() + this.getCenaProizvoda();
	}
	
}