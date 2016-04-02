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

	Lokomotive lok;

	/**
	 * Ein Zug ohne Wagen wird erstellt.
	 * 
	 * @param lok
	 *            Eine Lokomotive.
	 */
	public Zug(Lokomotive lok) {

	}

	/**
	 * Haengt einen Wagen an das Ende des Zuges.
	 * 
	 * @param wagon
	 *            Ein Wagen, welcher an das Ende des Zugs gehaengt wird.
	 */
	public void wagenHinzufuegen(Wagen wagon) {

	}

	/**
	 * Entfernt den ersten Wagen des Zugs und gibt ihn zurueck. Die restlichen
	 * Wagne ruecken auf. Falls kein Wagen im Zug ist, ist das Ergebnis null.
	 * 
	 * @return Der erste Wagen des Zugs wird zurueck gegeben.
	 */
	public Wagen erstenWagenEntfernen() {

		return null;
	}

	/**
	 * Haengt alle Wagen eines anderen Zuges an diesen hier an. es bleibt
	 * nurnoch die Lokomotive des anderen Zugs zurueck.
	 * 
	 * @param andererZug
	 *            Der andere Zug, dessen Wagen geklaut werden sollen.
	 */
	public void zugAnhaengen(Zug andererZug) {

	}

	/**
	 * Liefert die Anzahl der Wagen ohne Lokomotive
	 * 
	 * @return Die Anzahl der Wagen ohne Lokomotive
	 */
	public int getWagenAnzahl() {
		return 0;
	}

	/**
	 * Liefert die Summe der Kapazitaeten aller Wagen.
	 * 
	 * @return Die gesammte Kapazitaet des Zuges.
	 */
	public int getKapazitaet() {
		return 0;
	}

	/**
	 * Liefert gesammte Laenge des Zuges, Lokomotive und alle Wagen.
	 * @return Die Gesamtlaenge des Zuges.
	 */
	public int getLaenge() {
		return 0;
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
		return "hallo";
	}
}
