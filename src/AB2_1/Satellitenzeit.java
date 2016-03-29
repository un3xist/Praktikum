/**
 * Praktikum TIPTP1, SS 2016
 * Gruppe: Manuel Scholz (manuel.scholz@haw-hamburg.de),
 * Danny Luda (danny-marcel.luda@haw-hamburg.de)
 * Aufgabe: Aufgabenblatt 2, Aufgabe 1
 */

/**
 * Aufgabe 2.1: Satellitenzeit
 * Schwerpunkte: Variablen und Bezeichner
 * Aufgabe: Ein Satellit funkt Zeitspannen als "Anzahl Sekunden" zur Erde. Schreiben Sie ein Programm
 * Satellitenzeit, das einen ganzzahligen Sekundenbetrag in eine Zeitspanne in der Form
 * <d> Tage <h>:<m>:<s>
 * umrechnet und ausgibt, wobei gilt:
 * <d> = Anzahl Tage,
 * <h> = Anzahl Stunden im Bereich 0 bis 23,
 * <m> = Anzahl Minuten im Bereich 0 bis 59,
 * <s> = Anzahl Sekunden im Bereich 0 bis 59.
 * Testen Sie das Programm beispielsweise mit dem Eingabewert 10000. Die korrekte Ausgabe ist
 * 0 Tage 2:46:40,
 * denn 0 Tage + 2 Stunden + 46 Minuten + 40 Sekunden = (0 · 86400 + 2 · 3600 + 46 · 60 + 40) Sekunden =
 * 10000 Sekunden
 */

package AB2_1;

public class Satellitenzeit {
	public static void main(String[] args) {
		int tage, stunden, minuten, sekunden;
		final int satellitenzeit;

		final int SEKUNDEN_PRO_MINUTE = 60;
		final int SEKUNDEN_PRO_STUNDE = 3600;
		final int SEKUNDEN_PRO_TAG = 86400;
		final int MINUTEN_PRO_STUNDE = 60;
		final int STUNDEN_PRO_TAG = 24;

		// Die gegebene Satellitenzeit
		satellitenzeit = 10000;

		// zuerst schauen wir, wie viele Sekunden übrig bleiben
		sekunden = satellitenzeit % SEKUNDEN_PRO_MINUTE;

		// Das ziehen wir von der Sekundenzeit ab, machen es zu Stunden, und
		// schauen
		// wie viele Minuten übrig bleiben
		minuten = ((satellitenzeit - sekunden) / SEKUNDEN_PRO_MINUTE) % MINUTEN_PRO_STUNDE;

		// Die übrigen Sekunden und Minuten werden wieder abgezogen und in
		// Stunden
		// umgerechnet.
		// Dannach wie viele Stunden von den Tagen übrig bleiben.
		stunden = ((satellitenzeit - sekunden - SEKUNDEN_PRO_MINUTE * minuten) / SEKUNDEN_PRO_STUNDE) % STUNDEN_PRO_TAG;

		// Nun muss lediglich noch die volle Zahl an Tagen herrausgezogen
		// werden.
		tage = ((satellitenzeit - sekunden - SEKUNDEN_PRO_MINUTE * minuten - SEKUNDEN_PRO_STUNDE * stunden)
				/ SEKUNDEN_PRO_TAG) % SEKUNDEN_PRO_STUNDE;

		// Die Ausgabe ist eine einfache addition von Strings.
		System.out.println(tage + " Tage," + stunden + " Stunden," + minuten + " Minuten," + sekunden + " Sekunden");
	}
}
