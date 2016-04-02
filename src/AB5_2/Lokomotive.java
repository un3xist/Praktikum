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
public class Lokomotive {

	final int laenge;
	final int typ;
	Wagen ersterWagen;

	public Lokomotive(int laenge, int typ) {
		this.laenge = laenge;
		this.typ = typ;
		ersterWagen = null;
	}

	/**
	 * Getter
	 * 
	 * @return the ersterWagen
	 */
	public Wagen getErsterWagen() {
		return ersterWagen;
	}

	/**
	 * Setter
	 * 
	 * @param ersterWagen
	 *            the ersterWagen to set
	 */
	public void setErsterWagen(Wagen ersterWagen) {
		this.ersterWagen = ersterWagen;
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
	 * @return the typ
	 */
	public int getTyp() {
		return typ;
	}

}
