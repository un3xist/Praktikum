/*Aufgabe 1.2: Arbeiten mit Eclipse
Schwerpunkte: Kompilieren und Starten eines Java-Programms auf der Kommandozeile
Hinweis: In Ihrem Projekt m�ssen alle Programme f�r diese Aufgabe im Package "aufgabenblatt1" liegen.
Aufgaben:
a) Kompilieren und Starten Sie das Programm aus Eclipse heraus. Legen Sie in Eclipse ein neues Projekt an.
F�gen Sie das Programm HalloWelt.java in das Projekt ein. Pr�fen Sie, ob Eclipse den zugeh�rigen Bytecode
erzeugt hat und starten Sie das Programm aus Eclipse heraus.
b) Ver�ndern Sie das Programm derart, dass nicht der Text
Hallo, Welt!
sondern der Text
Hallo, <Ihr-Name>!
ausgegeben wird.
c) Ver�ndern Sie das Programm derart, dass der Text
Informatik ist mein Fach.
Programmieren macht Spa�!
ausgegeben wird. 
*/


package AB1_2;

public class HelloInformatik {

	public static void main(String[] args)
	{
		System.out.println("Hallo, Manuel!\nInformatik ist mein Fach.\nProgrammieren macht Spa�!");
	}
	
}
