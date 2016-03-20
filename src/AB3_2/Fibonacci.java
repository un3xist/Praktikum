/*Aufgabe 3.2: Fibonacci–Zahlen
Schwerpunkte: while-Schleife, Wiederverwenden von Variablen
Aufgabe: Die Fibonacci-Reihe ist eine unendliche Folge von ganzen positiven Zahlen (siehe
http://de.wikipedia.org/wiki/Fibonacci-Folge):
f0, f1, f2, ... .
Die ersten beiden Zahlen sind:
f0 = 0
f1 = 1
Jede weitere Zahl ist die Summe der beiden Vorgängerzahlen:
fn = fn-2 + fn-1, für n >= 2
Der Anfang der Fibonacci-Reihe lautet also:
0, 1, 1, 2, 3, 5, 8, ...
Schreiben Sie ein Programm Fibonacci-Zahlen, das vom Anwender abfragt, die wievielte Fibonacci-Zahl
berechnet werden soll, die zugehörige Zahl berechnet und diese ausgibt. Die Anwender-Eingabe soll in einer
Variablen mit Namen eingabe vom geeigneten Typ abgelegt werden. Erstellen Sie zunächst wieder einen
Entwurf, bevor Sie den Quellcode entwickeln. Gehen Sie davon aus, dass der Anwender nur positive ganzen
Zahlen >= 2 eingibt. Verwenden Sie eine while-Schleife.
Beispiel: Anwender-Eingabe: 4, Ausgabe: 3*/

package AB3_2;
import java.util.Scanner;


public class Fibonacci {

	public static void main(String[] args) {
		int fibonaccizahlen;
		double[] fibonaccifolge; 	// Ich verwende einen double, da bereits ab der 47. Fibonaccizahl ein Integer overflow entsteht.
									//Mittels Double schafft man 1476 Zahlen..
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Die wievielte Fibonacci Zahl soll ausgegeben werden?");
		
		fibonaccizahlen = scanner.nextInt();
		
		scanner.close();
		//initialisiere ein Array der groesse der angeforderten Zahlen
		fibonaccifolge = new double[fibonaccizahlen];
		
		
		//Jeden Wert im Array auf 0 setzen
		for( int i = 0; i < fibonaccifolge.length ; i++)
		{
			fibonaccifolge[i] = -1;
		}
		
		//Wir deklarieren die ersten beiden Fibonacci Zahlen
		fibonaccifolge[0] = 1;
		fibonaccifolge[1] = 1;
		
		//Nun fangen wir mit der dritten Zahl an (Arrays beginnen bei 0)
		int j = 2;
		
		//solange der letzte Wert im Array -1 bleibt, läuft die Schleife.
		while(fibonaccifolge[fibonaccifolge.length-1] == -1)
		{
			fibonaccifolge[j] = fibonaccifolge[j-1] + fibonaccifolge[j-2];
			j++;
		}
		/*
		// Berechnung mittels der Formel von Moivre/Binet
		//fn = (phi^n-psi^n)/(phi-psi) mit phi = (1+sqrt(5))/2 und psi = 1-phi
		
		double phi = (1 + Math.sqrt(5) )/2;
		double psi = 1-phi;
		double fibonacci = (Math.pow(phi, fibonaccizahlen) - Math.pow(psi, fibonaccizahlen) ) / ( phi - psi);
		System.out.println( fibonacci);
		
		*/
		
		
		System.out.println("Die " + fibonaccizahlen + ". Zahl betraegt: " + fibonaccifolge[fibonaccifolge.length-1] );
		
		
		
	}
}
