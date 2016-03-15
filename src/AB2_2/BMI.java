/*Aufgabe 2.2: Body-Mass-Index
Schwerpunkte: Eingabe �ber Tastatur
Aufgabe: Schreiben Sie ein Programm BMIndex, das Ihren Body Mass Index (BMI) berechnet (siehe
http://de.wikipedia.org/wiki/Body-Mass-Index). Zur Berechnung des BMI lassen Sie den Benutzer die
K�rpergr��e (in Metern) und das K�rpergewicht (in Kilogramm) eingeben. Der BMI ist dann
K�rpergewicht / K�rpergr�sse2
Wie erreichen Sie durch explizite Typkonversion (Typcasting) eine Ausgabe des BMI-Wertes ohne
Kommastellen?
*/

package AB2_2;
import java.util.Scanner;

public class BMI {
	
	public static void main(String[] args)
	{
		
		double bmi, gewicht, groesse;
		
		Scanner scanner = new Scanner(System.in);
		
		//Aufforderung der Eingabe des Gewichts
		System.out.println("Bitte geben Sie ihr Koerpergewicht in kg an: ");
		//Scan aus der Kommandozeile
		gewicht = scanner.nextDouble();
		
		System.out.println("Bitte geben Sie ihre Koerpergroesse in m an: ");
		//Scan aus der Kommandozeile
		groesse = scanner.nextDouble();
		
		//Berechnung des BMI
		bmi = gewicht/(groesse * groesse);
		
		//Beenden des scanners
		scanner.close();
		
		//Ausgabe des BMI
		System.out.println("Ihr BMI betraegt " + ( int ) bmi );
	}
	
}
