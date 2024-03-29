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
 * �  Name der Fahrerin
 * �  Fahrzeugtyp
 * �  Maximalgeschwindigkeit (Ver�nderung der gefahrenen Strecke pro Zeitschritt)
 * �  bisher gefahrene Strecke ab dem Start
 * Schreiben Sie einen Konstruktor, der die Objektvariablen initialisiert (Name, Typ und
 * Maximalgeschwindigkeit sind Parameter). Das  Rennauto  hat au�erdem eine Methode  fahren() . Beim
 * Aufruf der Methode bewegt sich das  Rennauto zun�chst einen Schritt (Zeitschritt = 1) mit
 * Maximalgeschwindigkeit weiter. Eine Fahrerin schafft es aber nicht immer, die Maximalgeschwindigkeit
 * auszureizen. Daher wird die tats�chlich gefahrene Distanz in einem Zeitschritt mit einem Zufallsfaktor
 * skaliert ( Math.random() liefert eine Zufallszahl aus [0,1]). Die Klasse ben�tigt au�erdem eine Methode
 * ausgeben() , die den aktuellen Zustand der Klasse auf der Konsole ausgibt. Testen Sie Ihre
 * Implementierung, z.B. indem Sie eine Instanz von  Rennauto erstellen, einige Schritte fahren und jeweils den
 * Zustand des Objektes ausgeben.
 */

package AB4;

public class Rennauto {

	String fahrername, fahrzeugtyp;
	double maximalgeschwindigkeit, gefahreneStrecke;

	/**
	 * Konstruktor fuer ein neues Rennauto
	 * 
	 * @param fahrername
	 *            Der Fahrer des Rennautos
	 * @param fahrzeugtyp
	 *            Der Name des Fahrzeugtyps des Rennautos
	 * @param maximalgeschwindigkeit
	 *            Die Maximalgeschwindigkeit des Rennautos
	 */
	public Rennauto(String fahrername, String fahrzeugtyp, double maximalgeschwindigkeit) {
		// Hier werden die Parameter auf die Eigenschaften des Objektes
		// geschrieben
		this.fahrername = fahrername;
		this.fahrzeugtyp = fahrzeugtyp;
		this.maximalgeschwindigkeit = maximalgeschwindigkeit;
		this.gefahreneStrecke = 0;
	}

	/**
	 * Beim Aufruf der Funktion bewegt sich das Auto mit Maximalgeschwindigkeit
	 * mal einen Zufallsfaktor.
	 */
	public void fahren() {
		// Die gefahrene Strecke wird um die Maximalgeschwindigkeit mal den
		// einen Zufallsfaktor multipliziert.
		gefahreneStrecke += Math.random() * maximalgeschwindigkeit;
	}

	/**
	 * Beim Aufruf der Funktion wird der aktuelle Zustand des Objektes auf der
	 * Konsole ausgegeben.
	 */
	public void ausgeben() {
		System.out.println("Fahrername: " + this.fahrername + "\n" + "Fahrzeugtyp: " + this.fahrzeugtyp + "\n"
				+ "Maximalgeschwindigkeit: " + this.maximalgeschwindigkeit + "\n" + "Gefahrene Strecke seit start: "
				+ this.gefahreneStrecke + "\n");
	}

	/**
	 * Getter fuer die gefahrene Strecke
	 * 
	 * @return Die gefahrene Strecke des Autos
	 */
	public double getGefahreneStrecke() {
		return this.gefahreneStrecke;
	}

	/**
	 * Getter fuer den Fahrernamen
	 * 
	 * @return Fahrername des Autos
	 */
	public String getName() {
		return this.fahrername;
	}

}
