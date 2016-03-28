/**
 * Praktikum TIPTP1, SS 2016
 * Gruppe: Manuel Scholz (manuel.scholz@haw-hamburg.de),
 * Danny SoUndSo (mia.meister@haw-hamburg.de)
 * Aufgabe: Aufgabenblatt 2, Aufgabe 3
 */

/**
 * Aufgabe 2.3: Modulo
 * Schwerpunkte: Modulus
 * Aufgabe: Schreiben Sie ein Programm, das vom Anwender zwei Zahlen a und b abfragt. Das Programm
 * berechnet dann a modulo b und gibt das Ergebnis auf der Konsole aus. Die Berechnung soll auf zwei Arten
 * erfolgen: Einmal mit dem Java-Operator und einmal mit der Formel, die hinter dem Operator steht. Beide
 * Ergebnisse sollen ausgegeben werden.
 */

package AB2_3;

import java.util.Scanner;

public class Modulo {

  public static void main(String[] args) {
    int a, b;

    Scanner scanner = new Scanner(System.in);

    System.out.println("Bitte geben sie die erste Zahl an: ");
    a = scanner.nextInt();

    System.out.println("Bitte geben sie die zweite Zahl an: ");
    b = scanner.nextInt();

    scanner.close();
    // Modulo Formel
    System.out.println("Modulo: " + a % b + " Formel: " + (a - (a / b) * b));

  }

}
