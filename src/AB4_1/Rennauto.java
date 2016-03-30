/**
 * Praktikum TIPTP1, SS 2016
 * Gruppe: Manuel Scholz (manuel.scholz@haw-hamburg.de),
 * Danny Luda (danny-marcel.luda@haw-hamburg.de)
 * Aufgabe: Aufgabenblatt 4, Aufgabe 1
 */

/**
 * Aufgabe 4.1: Rennauto
 * Schwerpunkte: Klasse mit Zustand
 * Aufgabe: Schreiben Sie eine Klasse Rennauto. Jedes Rennauto hat folgende Eigenschaften:
 * •  Name der Fahrerin
 * •  Fahrzeugtyp
 * •  Maximalgeschwindigkeit (Veränderung der gefahrenen Strecke pro Zeitschritt)
 * •  bisher gefahrene Strecke ab dem Start
 * Schreiben Sie einen Konstruktor, der die Objektvariablen initialisiert (Name, Typ und
 * Maximalgeschwindigkeit sind Parameter). Das  Rennauto  hat außerdem eine Methode  fahren() . Beim
 * Aufruf der Methode bewegt sich das  Rennauto zunächst einen Schritt (Zeitschritt = 1) mit
 * Maximalgeschwindigkeit weiter. Eine Fahrerin schafft es aber nicht immer, die Maximalgeschwindigkeit
 * auszureizen. Daher wird die tatsächlich gefahrene Distanz in einem Zeitschritt mit einem Zufallsfaktor
 * skaliert ( Math.random() liefert eine Zufallszahl aus [0,1]). Die Klasse benötigt außerdem eine Methode
 * ausgeben() , die den aktuellen Zustand der Klasse auf der Konsole ausgibt. Testen Sie Ihre
 * Implementierung, z.B. indem Sie eine Instanz von  Rennauto erstellen, einige Schritte fahren und jeweils den
 * Zustand des Objektes ausgeben.
 */

package AB4_1;

public class Rennauto {

	//Eigenschaften des Objektes Rennauto
	String fahrername, fahrzeugtyp;
	double maximalgeschwindigkeit, gefahreneStrecke;
	
	//Konstruktor
	public Rennauto(String fahrername, String fahrzeugtyp, double maximalgeschwindigkeit)
	{
		//Hier werden die Parameter auf die Eigenschaften des Objektes geschrieben
		this.fahrername = fahrername;
		this.fahrzeugtyp = fahrzeugtyp;
		this.maximalgeschwindigkeit = maximalgeschwindigkeit;
		this.gefahreneStrecke = 0;
	}
	
	public static void main(String[] args) {

		//Hier erstellen wir ein neues Objekt der Klasse Rennauto
		Rennauto rennwagen = new Rennauto("Paul", "Ferrari", 200);
		
		//lassen dieses einmal fahren und geben die Werte aus
		for (int i = 0; i < 5 ; i++)
		{
		rennwagen.fahren();
		rennwagen.ausgeben();
		}	
	}
	
	/**
	 * Beim Aufruf der Funktion bewegt sich das Auto mit Maximalgeschwindigkeit mal einen Zufallsfaktor.
	 */
	public void fahren()
	{
		//Die gefahrene Strecke wird um die Maximalgeschwindigkeit mal den Zufall multipliziert.
		this.gefahreneStrecke += Math.random() * this.maximalgeschwindigkeit;
	}
	
	/**
	 * Beim Aufruf der Funktion wird der aktuelle Zustand des Objektes ausgegeben.
	 */
	public void ausgeben()
	{
		System.out.println("Fahrername: " + this.fahrername + "\n"
				+ "Fahrzeugtyp: " + this.fahrzeugtyp + "\n" 
				+ "Maximalgeschwindigkeit: " + this.maximalgeschwindigkeit + "\n"
				+ "Gefahrene Strecke seit start: " + this.gefahreneStrecke + "\n");
	}
	
	
}
