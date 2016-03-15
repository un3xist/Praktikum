package AB2_1;

public class Satellitenzeit {
	public static void main(String[] args)
	{
		int satellitenzeit, tage, stunden, minuten, sekunden;
		
		//Die gegebene Satellitenzeit
		satellitenzeit = 10000;
		
		//zuerst schauen wir, wie viele Sekunden übrig bleiben
		sekunden=satellitenzeit%60;
		
		//Das ziehen wir von der Sekundenzeit ab, machen es zu Stunden, und schauen wie viele Minuten übrig bleiben
		minuten=((satellitenzeit-sekunden)/60)%60;
		
		//Die übrigen Sekunden und Minuten werden wieder abgezogen und in Stunden umgerechnet.
		//Dannach wie viele Stunden von den Tagen übrig bleiben.
		stunden=((satellitenzeit-sekunden-60*minuten)/3600)%24;
		
		//Nun muss lediglich noch die volle Zahl an Tagen herrausgezogen werden.
		tage=((satellitenzeit-sekunden-60*minuten-3600*stunden)/86400)%3600;
		
		//Die Ausgabe ist eine einfache addition von Strings.
		System.out.println(tage + " Tage," + stunden + " Stunden," + minuten +" Minuten," + sekunden + " Sekunden");
	}
}
