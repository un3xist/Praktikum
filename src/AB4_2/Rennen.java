/**
 * Praktikum TIPTP1, SS 2016
 * Gruppe: Manuel Scholz (manuel.scholz@haw-hamburg.de),
 * Danny Luda (danny-marcel.luda@haw-hamburg.de)
 * Aufgabe: Aufgabenblatt 4, Aufgabe 2
 */

/**
 * Aufgabe 4.2: Rennen
 * Schwerpunkte: Klasse mit Referenzen auf Objekte anderer Klassen
 * Aufgabe: Schreiben Sie eine Klasse  Rennen . Ein  Rennen hat folgende Eigenschaften:
 * •  Anzahl der  Rennautos  im  Rennen
 * •  List der  Rennautos in einem Array
 * •  Streckenlänge
 * Implementieren Sie einen Konstruktor. Initialisieren Sie darin das Array mit der Länge 1. Die Klasse soll
 * außerdem eine Methode  addRennauto(Rennauto) haben, die dem  Rennen ein zusätzliches  Rennauto
 * hinzufügt. Falls im Array kein Platz mehr ist, soll die Arraylänge verdoppelt werden. Die bereits vorhandenen
 * Rennautos dürfen dabei natürlich nicht verloren gehen. Ein  Rennen hat außerdem drei Methoden, um ein
 * Rennen zu steuern:
 * •  Rennauto ermittleSieger(): Liefert das  Rennauto , das bereits die gesamte Streckenlänge
 * zurückgelegt hat. Falls dies für kein  Rennauto zutrifft, liefert sie  null . Falls mehrere  Rennautos
 * bereits im Ziel sind, liefert sie ein beliebiges davon.
 * •  void schritt(): Alle Teilnehmerinnen des  Rennens bewegen sich einen Schritt weiter.
 * •  void durchfueren : Es wird so lange  schritt() aufgerufen, bis ein Sieger des  Rennens
 * gefunden wurde.
 */

package AB4_2;

import AB4_1.Rennauto;

public class Rennen {

	// Objekteigenschaften deklarieren
	int anzahlRennautos;
	double Streckenlaenge;
	Rennauto[] autoliste;

	// Konstruktor
	public Rennen() {
		this.autoliste = new Rennauto[1];

	}

	// Es wird ein zusätzliches Objekt Rennauto dem Array autoliste hinzugefügt.
	// Ist das Array voll, soll die größe des arrays verdoppelt werden.
	public void addRennauto(Rennauto auto) {

		// Zuerst den ersten freien Platz finden. Wenn ein freier Platz gefunden
		// wurde, wird die Schleife abgebrochen. Wenn kein freier Platz da ist,
		// wird nach der Schleife geprueft, ob der letzte Platz auch belegt ist.
		int i = 0;
		for (i = 0; i < this.autoliste.length; i++) {
			if (this.autoliste[i] == null) {
				break;
			}
		}

		// Sollte im Array kein Platz mehr sein, so wird dieses neu mit
		// doppelter groesse angelegt.
		if (this.autoliste[i] != null) {

			// Temporaeres Array fuer die Autos anlegen
			Rennauto[] temp = new Rennauto[this.autoliste.length];

			// Array loeschen
			this.autoliste = null;

			// Array doppel so gross neu anlegen
			this.autoliste = new Rennauto[temp.length * 2];

			// Rennautos uebertragen
			for (int j = 0; j < temp.length; j++) {
				this.autoliste[j] = temp[j];
			}

			// temp wieder loeschen; notwendig?
			temp = null;
		}

		// jetzt sollte i+1 ein freier Platz im array sein
		this.autoliste[i + 1] = auto;

	}

	/**
	 * Liefert das Rennauto , das bereits die gesamte Streckenlänge zurückgelegt
	 * hat. Falls dies für kein Rennauto zutrifft, liefert sie null . Falls
	 * mehrere Rennautos bereits im Ziel sind, liefert sie ein beliebiges davon.
	 * 
	 * @return
	 */
	public Rennauto ermittleSieger() {

		// Zum finden des Siegers gehen wir einfach alle Rennautos durch
		// zuerst checken wir aber, wie viele Autos schon ueber der Ziellinie
		// sind
		int autosImZiel = 0;

		for (int i = 0; i < this.autoliste.length; i++) {
			if (this.autoliste[i].gefahreneStreckeAusgeben() <= this.Streckenlaenge) {
				autosImZiel++;
			}
		}

		// Bei einem Sieger wird der Sieger zueruck gegeben
		if (autosImZiel == 1) {
			for (int i = 0; i < this.autoliste.length; i++) {
				if (this.autoliste[i].gefahreneStreckeAusgeben() <= this.Streckenlaenge) {
					return this.autoliste[i];
				}
			}
		}
		// Bei mehreren Siegern wird ein beliebiger zuruck gegeben
		else if (autosImZiel > 1) {

			for (int i = 0; i < this.autoliste.length; i++) {
				if (this.autoliste[i].gefahreneStreckeAusgeben() <= this.Streckenlaenge) {
					return this.autoliste[i];
				}
			}
		}
		// Hier kommen wir nur hin, wenn kein Sieger gefunden wurde.
		return null;

	}

	/**
	 * Alle Teilnehmerinnen des Rennens bewegen sich einen Schritt weiter.
	 */
	public void schritt() {

		// Wenn kein Auto im Array ist, dann soll das nicht funktionieren. Da
		// das Array immer von vorne aufgefuellt wird, muessen wir nur testen,
		// ob das erste Objekt im Array nicht null ist
		if (this.autoliste[1] != null) {

			for (int i = 0; i < this.autoliste.length; i++) {
				this.autoliste[i].fahren();
			}

		}
	}

	/**
	 * Es wird so lange schritt() aufgerufen, bis ein Sieger des Rennens
	 * gefunden wurde.
	 */
	public void durchfueren() {
		// Das ganze soll nur funktionieren, wenn es ueberhaupt Autos im Array
		// gibt
		if (this.autoliste[0] != null) {
			while (ermittleSieger() != null) {
				schritt();
			}
		}
	}

}
