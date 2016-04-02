/**
 * Praktikum TIPTP1, SS 2016
 * Gruppe: Manuel Scholz (manuel.scholz@haw-hamburg.de),
 * Danny Luda (danny-marcel.luda@haw-hamburg.de)
 * Aufgabe: Aufgabenblatt 5, Aufgabe 1
 */

package AB5_1;

/**
 * 
 * @author Manuel Scholz
 *
 */
public class EdelsteinBox {

	enum Edelstein {
		DIAMANT, RUBIN, SMARAGD
	}

	private int anzahlDiamant;
	private int anzahlRubin;
	private int anzahlSmaragd;

	/**
	 * Konstruktor
	 * 
	 * @param edelsteine
	 *            Jeder angegebene Edelstein wird direkt der EdelsteinBox
	 *            hinzugefügt.
	 */
	public EdelsteinBox(Edelstein... edelsteine) {
		// Jede Edelsteinbox sollte am Anfang leer sein
		anzahlDiamant = 0;
		anzahlRubin = 0;
		anzahlSmaragd = 0;

		// Hier wird sie befuellt. Dabei wird jeder Edelstein durchgegangen und
		// die Anzahl der einzelnen Edelsteine erhoet.

		for (Edelstein stein : edelsteine) {
			switch (stein) {
			case DIAMANT:
				anzahlDiamant++;
				break;
			case SMARAGD:
				anzahlRubin++;
				break;
			case RUBIN:
				anzahlSmaragd++;
				break;
			}
		}

	}

	/**
	 * 
	 * @param sorte
	 *            Von welcher Sorte die Anzahl Edelsteine ausgegebene werden
	 *            soll.
	 * @return Die Anzahl der Edelsteine der angegebenen Sorte.
	 */
	public int getAnzahl(Edelstein sorte) {

		switch (sorte) {
		case DIAMANT:
			return this.anzahlDiamant;
		case RUBIN:
			return this.anzahlRubin;
		case SMARAGD:
			return this.anzahlSmaragd;
		default:
			return 0;
		}

	}

	/**
	 * 
	 * @return Die Anzahl Edelsteine in Textform.
	 */
	public String toString() {
		String ausgabe = "";

		// Reihenfolge: DRS

		for (int anzahl = 0; anzahl < this.anzahlDiamant; anzahl++) {
			ausgabe += "D";
		}
		for (int anzahl = 0; anzahl < this.anzahlRubin; anzahl++) {
			ausgabe += "R";
		}
		for (int anzahl = 0; anzahl < this.anzahlSmaragd; anzahl++) {
			ausgabe += "S";
		}

		return ausgabe;

	}

	/**
	 * 
	 * @return Gibt die Anzahl Edelsteine in Textform in der Konsole aus.
	 */
	public EdelsteinBox ausgeben() {
		System.out.println(this.toString());
		return this;
	}

	/**
	 * 
	 * @param sorte
	 *            Die Sorte an Edelstein, die hinzugefuegt werden soll.
	 * @param n
	 *            Die Anzahl der Edelsteine, die hinzugefuegt werden soll.
	 * @return Gibt eine EdelsteinBox mit mehr Edelsteinen zueruck.
	 */
	public EdelsteinBox hineinlegen(Edelstein sorte, int n) {

		switch (sorte) {
		case DIAMANT:
			this.anzahlDiamant += n;
			break;
		case SMARAGD:
			this.anzahlSmaragd += n;
			break;
		case RUBIN:
			this.anzahlRubin += n;
			break;
		}
		return this;

	}

	/**
	 * 
	 * @param sorte
	 *            Die Sorte an Edelstein, die herraus genommen werden soll.
	 * @param n
	 *            Die Anzahl der Edelsteine, die herraus genommen werden soll.
	 * @return Gibt eine EdelsteinBox mit weniger Edelsteinen zueruck.
	 */
	public EdelsteinBox herausnehmen(Edelstein sorte, int n) {
		this.hineinlegen(sorte, n * -1);
		return this;
	}

	/**
	 * 
	 * @param vonSorte
	 * @param zuSorte
	 * @return Gibt eine EdelsteinBox mit geaenderten Edelsteinen zurueck.
	 */
	public EdelsteinBox umwandeln(Edelstein vonSorte, Edelstein zuSorte) {

		//Falls die gleiche Sorte in die andere umgewandelt wird, passiert nichts.
		switch (vonSorte) {
		case DIAMANT:
			switch (zuSorte) {
			case DIAMANT:
				break;
			case SMARAGD:
				this.anzahlSmaragd += this.anzahlDiamant;
				this.anzahlDiamant = 0;
				break;
			case RUBIN:
				this.anzahlRubin += this.anzahlDiamant;
				this.anzahlDiamant = 0;
				break;
			}
			break;
		case SMARAGD:
			switch (zuSorte) {
			case DIAMANT:
				this.anzahlDiamant += this.anzahlSmaragd;
				this.anzahlSmaragd = 0;
				break;
			case SMARAGD:
				break;
			case RUBIN:
				this.anzahlRubin += this.anzahlSmaragd;
				this.anzahlSmaragd = 0;
				break;
			}
			break;
		case RUBIN:
			switch (zuSorte) {
			case DIAMANT:
				this.anzahlDiamant += this.anzahlRubin;
				this.anzahlRubin = 0;
				break;
			case SMARAGD:
				this.anzahlSmaragd += this.anzahlRubin;
				this.anzahlRubin = 0;
				break;
			case RUBIN:
				break;
			}
			break;
		}
		return this;

	}

	/**
	 * 
	 * @return Gibt eine leere Edelsteinbox zurueck.
	 */
	public EdelsteinBox leeren() {
		this.anzahlDiamant = 0;
		this.anzahlRubin = 0;
		this.anzahlSmaragd = 0;
		return this;
	}
	
	
}
