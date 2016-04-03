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
public class Zug {

	private Lokomotive lok;

	/**
	 * Ein Zug ohne Wagen wird erstellt.
	 * 
	 * @param lok
	 *            Eine Lokomotive.
	 */
	public Zug(Lokomotive lok) {
		this.lok = lok;

	}

	/**
	 * Haengt einen Wagen an das Ende des Zuges.
	 * 
	 * @param neuerWagen
	 *            Ein Wagen, welcher an das Ende des Zugs gehaengt wird.
	 */
	public void wagenHinzufuegen(Wagen neuerWagen) {

		// Den ersten Wagen der Lokomotive holen
		Wagen vordererWagen = lok.getErsterWagen();
		// Wenn der erste Wagen null ist, muss dieser bei der Lok gesetzt werden
		if (vordererWagen == null) {
			lok.setErsterWagen(neuerWagen);
		} else {
			// Solange die Wagen durchgehen, bis der naechste null ist
			while (vordererWagen.getNaechsterWagen() != null) {
				vordererWagen = vordererWagen.getNaechsterWagen();
			}
			// naechsten Wagen setzen.
			vordererWagen.setNaechsterWagen(neuerWagen);
		}
	}

	/**
	 * Entfernt den ersten Wagen des Zugs und gibt ihn zurueck. Die restlichen
	 * Wagen ruecken auf. Falls kein Wagen im Zug ist, ist das Ergebnis null.
	 * 
	 * @return Der urspuenglich erste Wagen des Zugs wird zurueck gegeben.
	 */
	public Wagen erstenWagenEntfernen() {

		// Da lediglich die Lokomotive ueber den ersten Wagen bescheid weiss,
		// muss dort der erste auf den zweiten geandert werden und beim
		// urpsurenglich ersten Wagen der zweite auf Null gesetzt werden.

		if (lok.getErsterWagen() != null) {
			Wagen urspruenglichErsterWagen = lok.getErsterWagen();
			Wagen urspruenglichZweiterWagen = urspruenglichErsterWagen.getNaechsterWagen();

			lok.setErsterWagen(urspruenglichZweiterWagen);
			urspruenglichErsterWagen.setNaechsterWagen(null);

			return urspruenglichErsterWagen;
		} else {
			return null;
		}
	}

	/**
	 * Haengt alle Wagen eines anderen Zuges an diesen hier an. es bleibt
	 * nurnoch die Lokomotive des anderen Zugs zurueck.
	 * 
	 * @param andererZug
	 *            Der andere Zug, dessen Wagen geklaut werden sollen.
	 */
	public void zugAnhaengen(Zug andererZug) {

		// Solange den ersten Wagen entfernen und an diesen Zug anheangen
		// zuerst pruefen, ob am Zug ueberhaupt andere Wagen sind

		// die Wagenanzahlspruefung musste ich extra stellen, da in der for
		// schleife die Anzahl dauernd neu gecheckt wird. Somit fehlt am schluss
		// mindestens ein Wagen.
		int wagenAnzahlAndererZug = andererZug.getWagenAnzahl();

		for (int i = 0; i < wagenAnzahlAndererZug; i++) {
			this.wagenHinzufuegen(andererZug.erstenWagenEntfernen());
		}

	}

	/**
	 * Liefert die Anzahl der Wagen ohne Lokomotive
	 * 
	 * @return Die Anzahl der Wagen ohne Lokomotive
	 */
	public int getWagenAnzahl() {
		int anzahlWagen = 0;
		Wagen vordererWagen = this.lok.getErsterWagen();

		while (vordererWagen != null) {
			anzahlWagen++;
			vordererWagen = vordererWagen.getNaechsterWagen();
		}
		return anzahlWagen;
	}

	/**
	 * Liefert die Summe der Kapazitaeten aller Wagen.
	 * 
	 * @return Die gesammte Kapazitaet des Zuges.
	 */
	public int getKapazitaet() {
		int kapazitaet = 0;
		Wagen vordererWagen = this.lok.getErsterWagen();

		while (vordererWagen != null) {
			kapazitaet += vordererWagen.getPassagierKapazitaet();
			vordererWagen = vordererWagen.getNaechsterWagen();
		}
		return kapazitaet;
	}

	/**
	 * Liefert gesammte Laenge des Zuges, Lokomotive und alle Wagen.
	 * 
	 * @return Die Gesamtlaenge des Zuges.
	 */
	public int getLaenge() {
		int laenge = 0;
		laenge += lok.getLaenge();

		Wagen vordererWagen = lok.getErsterWagen();
		while (vordererWagen != null) {
			laenge += vordererWagen.getLaenge();
			vordererWagen = vordererWagen.getNaechsterWagen();
		}
		return laenge;
	}

	/**
	 * Liefert eine Beschreibung dieses Zuges mit allen Bestandteilen (Typ der
	 * Lok, Anzahl Wagen, Gesamtlaenge, gesamte Passagierkapazität sowie für
	 * jeden Wagen Seriennummer, Wagenlaenge und Passagierkapazitaet); kann zur
	 * Konsolenausgabe verwendet werden.
	 * 
	 * @return Die Beschreibung des Zuges.
	 */
	public String toString() {
		String ausgabeString;

		ausgabeString = "Loktyp: " + this.lok.getTyp();
		ausgabeString += ", Anzahl Wagen: " + this.getWagenAnzahl();
		ausgabeString += ", Gesamtlaenge: " + getLaenge();

		Wagen wagen = lok.getErsterWagen();
		int i = 1;
		while (wagen != null) {
			ausgabeString += "; " + i + ". Wagen: ";
			ausgabeString += "Seriennummer: " + wagen.getSeriennummer();
			ausgabeString += ", Wagenlaenge: " + wagen.getLaenge();
			ausgabeString += ", Passagierkapazitaet: " + wagen.getPassagierKapazitaet();

			wagen = wagen.getNaechsterWagen();
			i++;
		}

		return ausgabeString;
	}
}
