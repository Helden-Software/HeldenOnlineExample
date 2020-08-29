import java.io.InputStreamReader;
import java.math.BigInteger;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import jaxbGenerated.datenxml.Daten;
import jaxbGenerated.datenxml.Talent;
import jaxbGenerated.heldenliste.Helden;

/**
 * xjc -p jaxbGenerated.datenxml ../datenXMLSchema.xsd
 * xjc -p jaxbGenerated.heldenliste ../heldenlisteSchema.xsd
 *  
 * @author sven
 *
 */

public class DemoJAXB {
	
	public BigInteger getIDfromFirstHeld() throws Exception {
		InputStreamReader is = Helper.postrequeststream("action", "listhelden",
				"token", "21afc39beebd874f0d9eaec7022a5cb014a511e6bcad34c3db67122c01ff9e11");
		try {
			Helden helden;
			
			JAXBContext jaxbContext = JAXBContext
									.newInstance(jaxbGenerated.heldenliste.Helden.class);
	 
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			helden = (Helden) jaxbUnmarshaller.unmarshal(is);
			System.out.println("Name des ersten Helden: " + helden.getHeld().get(0).getName());
			return helden.getHeld().get(0).getHeldenid();
		  } catch (JAXBException e) {
			e.printStackTrace();
			return null;
		  }
	}
		
		
		
	public DemoJAXB() throws Exception {
		System.out.println("Demo via JAXB");
		Helper.disableSSLCheck(); // nur für die Testphase, bis ein gültiges Zertifikate vorhanden ist
		
		// HeldenID bestimmen
		BigInteger heldenid = getIDfromFirstHeld();
		
		// Helden anfordern
		InputStreamReader stringheld = Helper.postrequeststream("action", "returnheld",
				"format", "datenxml",
				"heldenid", heldenid.toString(),
				"token", "21afc39beebd874f0d9eaec7022a5cb014a511e6bcad34c3db67122c01ff9e11");
		try {
			 
			JAXBContext jaxbContext = JAXBContext.newInstance(Daten.class);
	 
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			Daten daten = (Daten) jaxbUnmarshaller.unmarshal(stringheld);
			System.out.println(daten.getAngaben().getName());
			for (Talent t : daten.getTalentliste().getTalent()) {
				System.out.println(String.format("%40s: %2d", t.getName(), t.getWert()));
			}
		  } catch (JAXBException e) {
			e.printStackTrace();
		  }
		

	}

}
