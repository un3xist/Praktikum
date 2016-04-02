/**
 * Praktikum TIPTP1, SS 2016
 * Gruppe: Manuel Scholz (manuel.scholz@haw-hamburg.de),
 * Danny Luda (danny-marcel.luda@haw-hamburg.de)
 * Aufgabe: Aufgabenblatt AB5_2 
 */
package AB5_2;

/**
 * @author Manuel Scholz
 *
 */
public class Wagen {

	final int laenge;
	final int passagierKapazitaet;
	final int Seriennummer;
	static int wagenZaehler = 1;
	
	Wagen naechsterWagen;

	public Wagen(int laenge, int passagiere) 
	{
		Seriennummer = wagenZaehler;
		Wagen.wagenZaehler++;
		this.laenge = laenge;
		this.passagierKapazitaet = passagiere;
	}

	/**
	 * Getter
	 * 
	 * @return the laenge
	 */
	public int getLaenge() {
		return laenge;
	}

	/**
	 * Getter
	 * 
	 * @return the passagierKapazitaet
	 */
	public int getPassagierKapazitaet() {
		return passagierKapazitaet;
	}

	/**
	 * Getter
	 * 
	 * @return the naechsterWagen
	 */
	public Wagen getNaechsterWagen() {
		return naechsterWagen;
	}

	/**
	 * Setter
	 * 
	 * @param naechsterWagen
	 *            the naechsterWagen to set
	 */
	public void setNaechsterWagen(Wagen naechsterWagen) {
		this.naechsterWagen = naechsterWagen;
	}

}