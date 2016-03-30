/**
 * Praktikum TIPTP1, SS 2016
 * Gruppe: Manuel Scholz (manuel.scholz@haw-hamburg.de),
 * Danny Luda (danny-marcel.luda@haw-hamburg.de)
 * Aufgabe: Aufgabenblatt 3, Aufgabe 2
 */

/**
 * Aufgabe 3.2: Fibonacci–Zahlen
 * Schwerpunkte: while-Schleife, Wiederverwenden von Variablen
 * Aufgabe: Die Fibonacci-Reihe ist eine unendliche Folge von ganzen positiven Zahlen (siehe
 * http://de.wikipedia.org/wiki/Fibonacci-Folge):
 * f0, f1, f2, ... .
 * Die ersten beiden Zahlen sind:
 * f0 = 0
 * f1 = 1
 * Jede weitere Zahl ist die Summe der beiden Vorgängerzahlen:
 * fn = fn-2 + fn-1, für n >= 2
 * Der Anfang der Fibonacci-Reihe lautet also:
 * 0, 1, 1, 2, 3, 5, 8, ...
 * Schreiben Sie ein Programm Fibonacci-Zahlen, das vom Anwender abfragt, die wievielte Fibonacci-Zahl
 * berechnet werden soll, die zugehörige Zahl berechnet und diese ausgibt. Die Anwender-Eingabe soll in einer
 * Variablen mit Namen eingabe vom geeigneten Typ abgelegt werden. Erstellen Sie zunächst wieder einen
 * Entwurf, bevor Sie den Quellcode entwickeln. Gehen Sie davon aus, dass der Anwender nur positive ganzen
 * Zahlen >= 2 eingibt. Verwenden Sie eine while-Schleife.
 * Beispiel: Anwender-Eingabe: 4, Ausgabe: 3
 */

package AB3_2;

import java.util.Scanner;

public class Fibonacci {

  public static void main(String[] args) {
    
    
    //Einen neuen scanner für die Eingabe erstellen
    Scanner scanner = new Scanner(System.in);

    System.out.println("Die wievielte Fibonacci Zahl soll ausgegeben werden?");
    int fibonaccizahlen = scanner.nextInt();
    
    //Schließe den Scanner wieder.
    scanner.close();
    
    //Zum berechnen brauchen wir zwei temporäre Variablen, welche die Fibonaccizaheln beim itterieren beinhalten
    //long, da ein 32 Bit Integer nur bis zur 47. Fibonaccizahl möglich ist. long ist ein 64 bit Integer.
    //Damit erreichen wir die 162. Zahl.
    long f1 = 1;
    long f2 = 1;
    // Nun fangen wir mit der dritten Fibonaccizahl an (Wir kennen ja bereits die ersten zwei)
   
    int i = 3;
    while (i <= fibonaccizahlen) {
      long temp;
    	//Zuerst speichern wir die letzte Fibonaccizahl zwischen
      	temp = f2;
      	//Nun erhoehen wir diese mit der vorrigen
    	f2 = f1 + f2;
    	//und setzen die vorrige auf den zwischengespeicherten Wert.
    	f1 = temp;	
    	i++;
    }
    
    //Nun ist f2 die gewünschte Fibonaccizahl
    
    long gewuenschteFibonacciZahl = f2;
    
  
    // Berechnung mittels der Formel von Moivre/Binet 
    // fn =(phi^n-psi^n)/(phi-psi) 
    // mit phi = (1+sqrt(5))/2 und psi = 1-phi 
    double phi = (1 + Math.sqrt(5) )/2; 
    double psi = 1-phi; double fibonacci =(Math.pow(phi, fibonaccizahlen) - Math.pow(psi, fibonaccizahlen) ) / (
     phi - psi); 
    
    

    System.out.println("Die " + fibonaccizahlen + ". Zahl betraegt: " + gewuenschteFibonacciZahl);
    //Kontrollausgabe
    System.out.println("Zur Kontrolle mit Moivre/Binet: " + fibonacci);
    
  }
}
