/**
 * Praktikum TIPTP1, SS 2016
 * Gruppe: Manuel Scholz (manuel.scholz@haw-hamburg.de),
 * Danny Luda (danny-marcel.luda@haw-hamburg.de)
 * Aufgabe: Aufgabenblatt 4, Aufgabe 3
 */

/**
 * Aufgabe 4.3: Wettbüro
 * Schwerpunkte: Algorithmenentwurf, Klasse ausschließlich zur Datenhaltung
 * Aufgabe: Schreiben Sie eine Klasse  Wettbuero . Ein  Wettbuero hat folgende Eigenschaften:
 * •  Referenz auf ein  Rennen
 * •  Liste (Array) von  Wetten
 * •  (fester) Faktor mit dem Wetteinsätze bei Gewinn multipliziert.
 * Wetten werden in einer eigenen Klasse Wette implementiert. Mit der Methode  wetteAnnehmen(String
 * fahrerin, int wettEinsatz, String spieler) nimmt das  Wettbüro eine  Wette an und speichert
 * sie intern als  Wette -Objekt im Array. Das  Wettbüro hat außerdem eine Methode  auswerten( ), die
 * überprüft, ob einer (oder mehrere) der Spieler gewonnen hat. In dem Fall berechnet sie den Gewinn und
 * gibt den Spieler und den Gewinn aus.
 */

package AB4;

import java.util.ArrayList;
import java.util.List;

public class Wettbuero {

	int anzahlWetten;
	double gewinnfaktor;
	Rennen rennen;

	List<Wette> wetten;

	/**
	 * Konstruktor der Klasse Wettbuero.
	 * 
	 * @param rennen
	 *            Fuer welches Rennen das Wettbuero aufgemacht wird
	 * @param gewinnfaktor
	 *            Wie hoch der Gewinnfaktor der Wetten ist.
	 */
	public Wettbuero(Rennen autorennen, double wettGewinnfaktor) {
		anzahlWetten = 0;
		gewinnfaktor = wettGewinnfaktor;
		rennen = autorennen;

		wetten = new ArrayList<>();
	}

	/**
	 * Nimmt eine Wette an und uebergibt sie in das Objekt Array.
	 * 
	 * @param fahrerin
	 *            Auf welche Fahrerin die Wette geht.
	 * @param wetteinsatz
	 *            Wie hoch der Wetteinsatz ist.
	 * @param spieler
	 *            Welcher Spieler die Wette abgiebt.
	 */
	public void wetteAnnehmen(String fahrerin, int wetteinsatz, String spieler) {
		Wette wette = new Wette(fahrerin, wetteinsatz, spieler);
		wetten.add(wette);
		anzahlWetten++;
	}

	/**
	 * Prueft, ob ein Spieler gewonnnen hat und gibt das aus.
	 */
	public void auswerten() {
		int anzahlSieger = 0;

		Rennauto sieger = rennen.ermittleSieger();
		// Check die Wetten nur, wenn es einen Sieger gibt.
		if (sieger != null) {
			// Schleife, die alle Wetten durchgeht
			for (int i = 0; i < wetten.size(); i++) {

				// Name des Siegers und Name auf den gewettet wurde
				// zwischenspeichern, um dauernden Aufruf der Funktion zu
				// vermeiden.
				String rennsieger = sieger.getName();
				String wettsieger = wetten.get(i).getFahrerin();

				// Es wird genau auf die Schreibweise der Namen geachtet!
				if (rennsieger.equals(wettsieger)) {
					String gewinnString = "Spieler " + wetten.get(i).spieler + " hat "
							+ wetten.get(i).wettEinsatz * gewinnfaktor + " gewonnen.";

					System.out.println(gewinnString);
					anzahlSieger++;
				} else {
					// Wenn die Wette nicht gewinnt
					System.out.println(wetten.get(i).spieler + " hat leider nicht gewonnen.");
				}

			}

		} 
		//Zur uebersichtlichkeit kein else, sondern ein if
		if (sieger == null){
			System.out.println("Es gibt noch keinen Gewinner des Rennens.");
		}
		
		//Ausgabe, wenn niemand richtig gewettet hat.
		if (anzahlSieger == 0) {
			System.out.println("Es gibt leider keinen Wettsieger.");
		}

	}

}
