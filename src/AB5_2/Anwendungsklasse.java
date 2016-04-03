/**
 * Praktikum TIPTP1, SS 2016
 * Gruppe: Manuel Scholz (manuel.scholz@haw-hamburg.de),
 * Danny Luda (danny-marcel.luda@haw-hamburg.de)
 * Aufgabe: Aufgabenblatt AB5_2 
 */
package AB5_2;

/**
 * @author Manuel Scholz
 *
 */
public class Anwendungsklasse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Zuerst erstellen wir eine neue Lol
		Lokomotive ICELok = new Lokomotive(15, 815);
		Zug ICE = new Zug(ICELok);
		
		//Dann brauchen wir noch vier Wagen
		
		Wagen ICEWagen1 = new Wagen(30, 120);
		Wagen ICEWagen2 = new Wagen(30, 110);
		Wagen ICEWagen3 = new Wagen(30, 100);
		Wagen ICEWagen4 = new Wagen(30, 130);
		
		//Diese koppeln wir nun an den Zug
		
		ICE.wagenHinzufuegen(ICEWagen1);
		ICE.wagenHinzufuegen(ICEWagen2);
		ICE.wagenHinzufuegen(ICEWagen3);
		ICE.wagenHinzufuegen(ICEWagen4);
		
		//Ein Regio will noch angekoppelt werden
		
		
		Lokomotive RegioLok = new Lokomotive(12, 12345);
		Zug Regio = new Zug(RegioLok);
		
		Wagen Regio1 = new Wagen(24, 50);
		Wagen Regio2 = new Wagen(24, 50);
		Wagen Regio3 = new Wagen(24, 50);
		
		Regio.wagenHinzufuegen(Regio1);
		Regio.wagenHinzufuegen(Regio2);
		Regio.wagenHinzufuegen(Regio3);
		
		System.out.println(ICE.toString());
		System.out.println(Regio.toString());
		
		ICE.zugAnhaengen(Regio);
		
		System.out.println(ICE.toString());
	}

}
