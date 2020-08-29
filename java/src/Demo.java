import org.w3c.dom.Document;


public class Demo {
	public Demo() throws Exception {
		System.out.println("Demo via XPATH");
		Helper.disableSSLCheck(); // nur für die Testphase, bis ein gültiges Zertifikate vorhanden ist
		
		// HeldenListe anfordern
		String stringHeldenliste = Helper.postrequest("action", "listhelden",
				"token", "21afc39beebd874f0d9eaec7022a5cb014a511e6bcad34c3db67122c01ff9e11");
		Document d = Helper.string2Doc(stringHeldenliste);
		
		// Anzahl der Helden bestimmen
		int anzahl = Helper.getDaten(d, "/helden/held").getLength();
		System.out.println("	Anzahl Helden: " + anzahl);
		
		// Die Namen der Helden anzeigen
		for (int i = 1 ; i <= anzahl; i++) {
			String name = Helper.getDatenAsString(d, "/helden/held[" + i + "]/name");
			System.out.println("	" + i + ". Held: " + name);
		}
		
		// Die Talent des ersten Helden angezeigen
		System.out.print("	ID des ersten Helden: ");
		String heldenid = Helper.getDatenAsString(d, "/helden/held[1]/heldenid");
		System.out.println(heldenid);
		String stringheld = Helper.postrequest("action", "returnheld",
				"format", "datenxml",
				"heldenid", heldenid,
				"token", "21afc39beebd874f0d9eaec7022a5cb014a511e6bcad34c3db67122c01ff9e11");
		Document held = Helper.string2Doc(stringheld);
		for (int i = 1; i <= Helper.getDatenAsNumber(held, "count(/daten/talentliste/talent)"); i++) {
			System.out.println(String.format("%40s: %2s", 
					Helper.getDatenAsString(held, "/daten/talentliste/talent[" + i + "]/name"), 
					Helper.getDatenAsString(held, "/daten/talentliste/talent[" + i + "]/wert")));
		}
	}
}
