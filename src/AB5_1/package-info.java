/**
 * Praktikum TIPTP1, SS 2016
 * Gruppe: Manuel Scholz (manuel.scholz@haw-hamburg.de),
 * Danny Luda (danny-marcel.luda@haw-hamburg.de)
 * Aufgabe: Aufgabenblatt 4, Aufgabe 2
 */

/**
 * 
 *  Aufgabe 5.1: Schatzkästchen
 * Schwerpunkte: Enums, Varargs
 * Aufgabe: Ein Schatzkästchen ist ein Behälter für Edelsteine verschiedener Sorten. In dieser Aufgabe gibt es
 * die drei Sorten Diamant, Rubin und Smaragd.
 * •  Definieren Sie einen Aufzählungstyp  Edelstein  für diese drei Edelsteinarten.
 * •  Schreiben Sie eine Klasse  EdelsteinBox , die ein Schatzkästchen repräsentiert.
 * EdelsteinBox soll die folgenden öffentlichen Methoden anbieten:
 * •  Einen Konstruktor dem man eine beliebige Anzahl von Edelsteinen als Argumente mitgeben kann.
 * •  int getAnzahl(Edelstein sorte): liefert die Anzahl an enthaltenen Edelsteinen der
 * übergebenen Sorte
 * •  String toString(): gibt einen String mit einer Textdarstellung dieses Schatzkästchens zurück
 * (siehe Methode ausgeben()).
 * •  EdelsteinBox ausgeben():  gibt auf der Konsole eine Zeile mit einer Textdarstellung dieses
 * Schatzkästchens aus. Für jeden Diamanten wird ein D gedruckt, für jeden Rubin ein R und für jeden
 * Smaragden ein S. Alle Buchstaben folgen lückenlos aufeinander. Die Buchstabenfolge wird in runde
 * Klammern gesetzt. Ein Schatzkästchen mit 1 Diamanten, 2 Rubinen und 3 Smaragden wird zum
 * Beispiel ausgegeben als (DRRSSS)
 * •  EdelsteinBox hineinlegen(Edelstein sorte, int n) fügt diesem Schatzkästchen n
 * Edelsteine der Sorte  sorte hinzu.
 * •  EdelsteinBox herausnehmen(Edelstein sorte, int n): entnimmt diesem Schatzkästchen
 * n Edelsteine der Sorte  sorte . Wenn weniger als n Edelsteine der Sorte  sorte enthalten sind,
 * werden alle entnommen.
 * •  EdelsteinBox umwandeln(Edelstein vonSorte, Edelstein zuSorte): wandelt alle
 * Edelsteine der Sorte  vonSorte in Edelsteine der Sorte  zuSorte um.
 * •  EdelsteinBox leeren(): entleert dieses Schatzkästchen. Es enthält dann keine Edelsteine mehr.
 * Hinweis: Viele Methoden liefern das eigene Schatzkästchen-Objekt als Ergebnis zurück, um die Anwendung
 * zu vereinfachen. Die Anweisung
 * new EdelsteinBox()
 * .hineinlegen(Edelstein.DIAMANT, 1)
 * .hineinlegen(Edelstein.RUBIN, 2)
 * .hineinlegen(Edelstein.SMARAGD, 3)
 * .umwandeln(Edelstein.RUBIN, Edelstein.DIAMANT)
 * .ausgeben();
 * liefert: (DDDSSS)
 * Beispiele:
 * •  (DRRSSS): hineinlegen(Edelstein.RUBIN, 3) --> (DRRRRRSSS)
 * •  (DRRSSS): herausnehmen(Edelstein.SMARAGD, 2) --> (DRRS)
 * •  (DRRSSS): herausnehmen(Edelstein.DIAMANT, 2) --> (RRSSS)
 * •  (DRRSSS): umwandeln(Edelstein.RUBIN, Edelstein.DIAMANT) --> (DDDSSS)
 * •  (DRREEE): leeren() --> ()
 */

package AB5_1;