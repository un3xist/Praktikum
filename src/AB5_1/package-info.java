/**
 * Praktikum TIPTP1, SS 2016
 * Gruppe: Manuel Scholz (manuel.scholz@haw-hamburg.de),
 * Danny Luda (danny-marcel.luda@haw-hamburg.de)
 * Aufgabe: Aufgabenblatt 4, Aufgabe 2
 */

/**
 * 
 *  Aufgabe 5.1: Schatzk�stchen
 * Schwerpunkte: Enums, Varargs
 * Aufgabe: Ein Schatzk�stchen ist ein Beh�lter f�r Edelsteine verschiedener Sorten. In dieser Aufgabe gibt es
 * die drei Sorten Diamant, Rubin und Smaragd.
 * �  Definieren Sie einen Aufz�hlungstyp  Edelstein  f�r diese drei Edelsteinarten.
 * �  Schreiben Sie eine Klasse  EdelsteinBox , die ein Schatzk�stchen repr�sentiert.
 * EdelsteinBox soll die folgenden �ffentlichen Methoden anbieten:
 * �  Einen Konstruktor dem man eine beliebige Anzahl von Edelsteinen als Argumente mitgeben kann.
 * �  int getAnzahl(Edelstein sorte): liefert die Anzahl an enthaltenen Edelsteinen der
 * �bergebenen Sorte
 * �  String toString(): gibt einen String mit einer Textdarstellung dieses Schatzk�stchens zur�ck
 * (siehe Methode ausgeben()).
 * �  EdelsteinBox ausgeben():  gibt auf der Konsole eine Zeile mit einer Textdarstellung dieses
 * Schatzk�stchens aus. F�r jeden Diamanten wird ein D gedruckt, f�r jeden Rubin ein R und f�r jeden
 * Smaragden ein S. Alle Buchstaben folgen l�ckenlos aufeinander. Die Buchstabenfolge wird in runde
 * Klammern gesetzt. Ein Schatzk�stchen mit 1 Diamanten, 2 Rubinen und 3 Smaragden wird zum
 * Beispiel ausgegeben als (DRRSSS)
 * �  EdelsteinBox hineinlegen(Edelstein sorte, int n) f�gt diesem Schatzk�stchen n
 * Edelsteine der Sorte  sorte hinzu.
 * �  EdelsteinBox herausnehmen(Edelstein sorte, int n): entnimmt diesem Schatzk�stchen
 * n Edelsteine der Sorte  sorte . Wenn weniger als n Edelsteine der Sorte  sorte enthalten sind,
 * werden alle entnommen.
 * �  EdelsteinBox umwandeln(Edelstein vonSorte, Edelstein zuSorte): wandelt alle
 * Edelsteine der Sorte  vonSorte in Edelsteine der Sorte  zuSorte um.
 * �  EdelsteinBox leeren(): entleert dieses Schatzk�stchen. Es enth�lt dann keine Edelsteine mehr.
 * Hinweis: Viele Methoden liefern das eigene Schatzk�stchen-Objekt als Ergebnis zur�ck, um die Anwendung
 * zu vereinfachen. Die Anweisung
 * new EdelsteinBox()
 * .hineinlegen(Edelstein.DIAMANT, 1)
 * .hineinlegen(Edelstein.RUBIN, 2)
 * .hineinlegen(Edelstein.SMARAGD, 3)
 * .umwandeln(Edelstein.RUBIN, Edelstein.DIAMANT)
 * .ausgeben();
 * liefert: (DDDSSS)
 * Beispiele:
 * �  (DRRSSS): hineinlegen(Edelstein.RUBIN, 3) --> (DRRRRRSSS)
 * �  (DRRSSS): herausnehmen(Edelstein.SMARAGD, 2) --> (DRRS)
 * �  (DRRSSS): herausnehmen(Edelstein.DIAMANT, 2) --> (RRSSS)
 * �  (DRRSSS): umwandeln(Edelstein.RUBIN, Edelstein.DIAMANT) --> (DDDSSS)
 * �  (DRREEE): leeren() --> ()
 */

package AB5_1;