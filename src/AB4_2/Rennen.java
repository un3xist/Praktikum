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
		anzahlRennautos = 0;
		Streckenlaenge = 2000;

	}

	public static void main(String[] args) {
		// zum testen fuegen wir 9 Rennautos hinzu

		Rennauto auto1, auto2, auto3, auto4, auto5, auto6, auto7, auto8, auto9;

		auto1 = new Rennauto("Peter", "Ferrari", 200);
		auto2 = new Rennauto("Klaus", "Opel", 120);
		auto3 = new Rennauto("Chantalle", "Fiat", 80);
		auto4 = new Rennauto("Leo", "BMW", 160);
		auto5 = new Rennauto("Phil", "Mercedes", 140);
		auto6 = new Rennauto("Manuel", "Jaguar", 220);
		auto7 = new Rennauto("Johannes", "Jeep", 90);
		auto8 = new Rennauto("Alisa", "Landrover", 100);
		auto9 = new Rennauto("Kevin", "Heißluftballon", 60);

		// Alle autos zum array hinzufuegen
		Rennen autorennen = new Rennen();
		autorennen.addRennauto(auto1);
		autorennen.addRennauto(auto2);
		autorennen.addRennauto(auto3);
		autorennen.addRennauto(auto4);
		autorennen.addRennauto(auto5);
		autorennen.addRennauto(auto6);
		autorennen.addRennauto(auto7);
		autorennen.addRennauto(auto8);
		autorennen.addRennauto(auto9);

		// Nun lediglich noch das rennen starten
		autorennen.durchfueren();

	}

	// Es wird ein zusätzliches Objekt Rennauto dem Array autoliste hinzugefügt.
	// Ist das Array voll, soll die größe des arrays verdoppelt werden.
	public void addRennauto(Rennauto auto) {

		// Zuerst vergleichen wir die groesse des Arrays mit den bereits
		// eingetragenen Rennautos. Wenn platz fuer weitere Autos ist, muss das
		// Array nicht vergroessert werden

		if (this.autoliste.length == this.anzahlRennautos) {
			// Autoliste zwischenspeichern
			Rennauto[] temp = new Rennauto[this.autoliste.length];
			temp = autoliste;

			// Autoliste loeschen
			this.autoliste = null;

			// Autoliste neu anlegen
			this.autoliste = new Rennauto[temp.length * 2];

			// Autoliste wieder fuellen

			for (int i = 0; i < temp.length; i++) {
				autoliste[i] = temp[i];
			}
		}

		// Praktischerweise ist die Anzahl Rennautos gleich ein freier Platz im
		// Array
		this.autoliste[anzahlRennautos] = auto;

		// Zum schluss muessen wir nurnoch die Anzahl Rennautos erhoehen
		this.anzahlRennautos++;

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

		for (int i = 0; i < this.anzahlRennautos; i++) {
			if (this.autoliste[i].gefahreneStreckeAusgeben() >= this.Streckenlaenge) {
				autosImZiel++;
			}
		}

		// Bei einem Sieger wird der Sieger zueruck gegeben
		if (autosImZiel == 1) {
			for (int i = 0; i < this.anzahlRennautos; i++) {
				if(this.autoliste[i].gefahreneStreckeAusgeben() >= this.Streckenlaenge)
				{
					this.autoliste[i].ausgeben();
					return this.autoliste[i];
				}
			}
		}
		// Bei mehreren Siegern wird ein beliebiger zuruck gegeben
		else if (autosImZiel > 1) {
			for (int i = 0; i < this.anzahlRennautos; i++) {
				if (this.autoliste[i].gefahreneStreckeAusgeben() >= this.Streckenlaenge) {
					this.autoliste[i].ausgeben();
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

			for (int i = 0; i < this.anzahlRennautos; i++) {
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
			while (ermittleSieger() == null) {
				schritt();
			}
		}
	}

}
