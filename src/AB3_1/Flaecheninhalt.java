/**
 * Praktikum TIPTP1, SS 2016
 * Gruppe: Manuel Scholz (manuel.scholz@haw-hamburg.de),
 * Danny Luda (danny-marcel.luda@haw-hamburg.de)
 * Aufgabe: Aufgabenblatt 3, Aufgabe 1
 */

/**
 * Aufgabe 3.1: Fl�cheninhalt
 * Schwerpunkte: if-else, switch
 * Aufgabe: Schreiben Sie ein Programm, eine Gr��e x (Flie�kommazahl) und einen Index index (Dezimalzahl)
 * einlie�t. Abh�ngig von dem eingegeben Index berechnet das Programm den Fl�cheninhalt eines Kreises mit
 * dem Radius x (Index 1), den Fl�cheninhalt eines Quadrats mit der Seitenl�nge x (Index 1) oder den
 * Fl�cheninhalt eines Sechsecks (https://de.wikipedia.org/wiki/Sechseck) mit der Seitenl�nge x (Index 2). Der
 * berechnete Fl�cheninhalt wird in einer Variablen abgelegt und am Ende des Programms ausgegeben. F�r
 * ung�ltige Indizes ist der Fl�cheninhalt -1.
 * Schreiben Sie zwei Versionen des Programms, eine mit Verwendung von if-else, eine mit Verwendung von
 * switch
 */

package AB3_1;

import java.util.Scanner;

/**
 * Dieses Programm berechnet den Flaecheninhalt einer Form. Der Nutzer wird nach
 * der Form und dem Radius gefragt.
 * 
 * @author Manuel Scholz
 *
 */
public class Flaecheninhalt {

	public static void main(String[] args) {
		double radius, flaecheninhalt;
		int index;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Index eingeben; 1 = Kreis, 2 = Quadrat, 3 = Sechseck");
		index = scanner.nextInt();

		System.out.println("Bitte gebe den Radius/die Seitenl�nge ein.");
		radius = scanner.nextDouble();

		scanner.close();

		// switch (index) {
		// case 1:
		// flaecheninhalt = radius * radius * Math.PI;
		// break;
		// case 2:
		// flaecheninhalt = radius * radius;
		// break;
		// case 3:
		// flaecheninhalt = (radius * radius * Math.sqrt(3)) / 4;
		// break;
		// default:
		// flaecheninhalt = -1;
		// break;
		// }

		if (index == 1) {
			flaecheninhalt = radius * radius * Math.PI;
		} else if (index == 2) {
			flaecheninhalt = radius * radius;
		} else if (index == 3) {
			flaecheninhalt = (radius * radius * Math.sqrt(3)) / 4;
		} else {
			flaecheninhalt = -1;
		}

		System.out.println("Flaecheninhalt betraegt " + flaecheninhalt + " cm^2");
	}
}