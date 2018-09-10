package zadatak8;

/**
 * @author Denis.Selimovski
 *
 */

/**
 * Kreirati projekat Geometrijske slike na sledeci nacin:
 * - Apstraktna klasa Geometrijska Slika
 * - Tri osnovne klase Krug, Kvadrat, Trougao
 * - Izvedene klase Elipsa, Pravougaonik i Nejednakostranicni Trougao
 * - Klase imaju preklopljenu metodu toString() u kojoj se ispisuju obim i povrsina
 * - Svaka klasa treba da sadrzi po 3 konstruktora
 * - Klasa Trougao definise jednakostranicni Trougao
 * - Obim elipse se racuna aPI(9-sqrt35)/2, a povrsina abPI
 * Napraviti Main klasu i u njoj kreirati instance klase Geometrijska slika i napraviti objekte svih osnovnih i 
 * izvedenih klasa sa proizvoljnim argumentima. Ispisati String reprezentaciju objekta - toString()
 */

public class Run {

	public static void main(String[] args) {
		
		GeometrijskaSlika krug = new Krug(3.57);
		GeometrijskaSlika kvadrat = new Kvadrat(5);
		GeometrijskaSlika trougao = new Trougao(4);
		GeometrijskaSlika elipsa = new Elipsa(2, 3);
		GeometrijskaSlika pravougaonik = new Pravougaonik(2, 4);
		GeometrijskaSlika nejednakostranicni = new NejednakostranicniTrougao(2, 3, 4);
		
		System.out.println(krug);
		System.out.println(kvadrat);
		System.out.println(trougao);
		System.out.println(elipsa);
		System.out.println(pravougaonik);
		System.out.println(nejednakostranicni);
		
	}

}
