/**
 * Praktikum TIPTP1, SS 2016
 * Gruppe: Manuel Scholz (manuel.scholz@haw-hamburg.de),
 * Danny Luda (danny-marcel.luda@haw-hamburg.de)
 * Aufgabe: Aufgabenblatt AB5_1 
 */
package AB5_1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author Manuel Scholz
 *
 */
public class EdelsteinTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for
	 * {@link AB5_1.EdelsteinBox#EdelsteinBox(AB5_1.EdelsteinBox.Edelstein[])}.
	 */
	@Test
	public void testEdelsteinBox() {
		EdelsteinBox box = new EdelsteinBox();
		box.hineinlegen(EdelsteinBox.Edelstein.DIAMANT, 1);
		box.hineinlegen(EdelsteinBox.Edelstein.RUBIN, 2);
		box.hineinlegen(EdelsteinBox.Edelstein.SMARAGD, 3);
		box.umwandeln(EdelsteinBox.Edelstein.RUBIN, EdelsteinBox.Edelstein.DIAMANT);
		if (!box.toString().equals("DDDSSS"))
			fail("Ausgabe nicht richtig!");
	}

	/**
	 * Test method for
	 * {@link AB5_1.EdelsteinBox#getAnzahl(AB5_1.EdelsteinBox.Edelstein)}.
	 */
	@Test
	public void testGetAnzahl() {
		int anzahl = 5;
		EdelsteinBox testbox = new EdelsteinBox();
		testbox.hineinlegen(EdelsteinBox.Edelstein.DIAMANT, anzahl);
		if (testbox.getAnzahl(EdelsteinBox.Edelstein.DIAMANT) != anzahl)
			fail("Die zuruckgegebene Zahl stimmt nicht.");
	}

	/**
	 * Test method for {@link AB5_1.EdelsteinBox#toString()}.
	 */
	@Test
	public void testToString() {
		int anzahl = 5;
		EdelsteinBox testbox = new EdelsteinBox();
		testbox.hineinlegen(EdelsteinBox.Edelstein.DIAMANT, anzahl);
		testbox.hineinlegen(EdelsteinBox.Edelstein.SMARAGD, anzahl);
		testbox.hineinlegen(EdelsteinBox.Edelstein.RUBIN, anzahl);
		if (!testbox.toString().equals("DDDDDRRRRRSSSSS"))
			fail("Der zuruckgegebene String stimmt nicht");
	}

	/**
	 * Test method for {@link AB5_1.EdelsteinBox#ausgeben()}.
	 */
	@Test
	public void testAusgeben() {

	}

	/**
	 * Test method for
	 * {@link AB5_1.EdelsteinBox#hineinlegen(AB5_1.EdelsteinBox.Edelstein, int)}
	 * .
	 */
	@Test
	public void testHineinlegen() {
		EdelsteinBox testbox = new EdelsteinBox();
		testbox.hineinlegen(EdelsteinBox.Edelstein.DIAMANT, 5);
		if (!testbox.toString().equals("DDDDD"))
			fail("Hineinlegen oder toString fehlerhaft.");

	}

	/**
	 * Test method for
	 * {@link AB5_1.EdelsteinBox#herausnehmen(AB5_1.EdelsteinBox.Edelstein, int)}
	 * .
	 */
	@Test
	public void testHerausnehmen() {
		EdelsteinBox testbox = new EdelsteinBox();
		testbox.hineinlegen(EdelsteinBox.Edelstein.DIAMANT, 5);
		testbox.herausnehmen(EdelsteinBox.Edelstein.DIAMANT, 3);
		if (!testbox.toString().equals("DD"))
			fail("Herrausnehmen oder toString fehlerhaft.");
	}

	/**
	 * Test method for
	 * {@link AB5_1.EdelsteinBox#umwandeln(AB5_1.EdelsteinBox.Edelstein, AB5_1.EdelsteinBox.Edelstein)}
	 * .
	 */
	@Test
	public void testUmwandeln() {
		EdelsteinBox testbox = new EdelsteinBox();
		testbox.hineinlegen(EdelsteinBox.Edelstein.DIAMANT, 5);
		testbox.umwandeln(EdelsteinBox.Edelstein.DIAMANT, EdelsteinBox.Edelstein.SMARAGD);
		if (!testbox.toString().equals("SSSSS"))
			fail("Umwandeln oder toString fehlerhaft.");
	}

	/**
	 * Test method for {@link AB5_1.EdelsteinBox#leeren()}.
	 */
	@Test
	public void testLeeren() {
		EdelsteinBox testbox = new EdelsteinBox();
		testbox.hineinlegen(EdelsteinBox.Edelstein.DIAMANT, 5);
		testbox.leeren();
		if (!testbox.toString().equals(""))
			fail("Leeren() oder toString fehlerhaft.");
	}

}
