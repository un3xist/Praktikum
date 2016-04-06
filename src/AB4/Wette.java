/**
 * Praktikum TIPTP1, SS 2016
 * Gruppe: Manuel Scholz (manuel.scholz@haw-hamburg.de),
 * Danny Luda (danny-marcel.luda@haw-hamburg.de)
 * Aufgabe: Aufgabenblatt 4, Aufgabe 3
 */

/**
 * Aufgabe 4.3: Wettbüro
 * Schwerpunkte: Algorithmenentwurf, Klasse ausschließlich zur Datenhaltung
 * Aufgabe: Schreiben Sie eine Klasse  Wettbuero . Ein  Wettbuero hat folgende Eigenschaften:
 * •  Referenz auf ein  Rennen
 * •  Liste (Array) von  Wetten
 * •  (fester) Faktor mit dem Wetteinsätze bei Gewinn multipliziert.
 * Wetten werden in einer eigenen Klasse Wette implementiert. Mit der Methode  wetteAnnehmen(String
 * fahrerin, int wettEinsatz, String spieler) nimmt das  Wettbüro eine  Wette an und speichert
 * sie intern als  Wette -Objekt im Array. Das  Wettbüro hat außerdem eine Methode  auswerten( ), die
 * überprüft, ob einer (oder mehrere) der Spieler gewonnen hat. In dem Fall berechnet sie den Gewinn und
 * gibt den Spieler und den Gewinn aus.
 */


package AB4;

public class Wette {
  
  String fahrerin;
  int wettEinsatz;
  String spieler;
  /**
   * @param fahrerin
   * @param wettEinsatz
   * @param spieler
   * 
   * Konstruktor
   */
  public Wette(String fahrerin, int wettEinsatz, String spieler)
  {
    
  }
  /**
   * 
   * @return
   */
  public String getFahrerin()
  {
    return fahrerin;
  }
  
  /**
   * 
   * @return
   */
  public int getWetteinsatz()
  {
    return wettEinsatz;
  }
  
  /**
   * 
   * @return
   */
  public String getSpieler()
  {
    return spieler;
  }

}
