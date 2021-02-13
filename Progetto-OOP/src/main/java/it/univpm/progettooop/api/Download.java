package it.univpm.progettooop.api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Vector;

import it.univpm.progettooop.exception.NoDataException;
import it.univpm.progettooop.model.Promoter;
import it.univpm.progettooop.parsing.ParsingDownload;


public class Download {

	public static Vector<Promoter> callTicketmaster() throws NoDataException {
		
		Vector<Promoter> pVect = new Vector<Promoter>();
		
		try {
			URL urlDownload = new URL("https://app.ticketmaster.com/discovery/v2/events.json?countryCode=US&apikey=cQqAQpOj6B5R1kGsPqmNsOHbsJ13PvSI");
			HttpURLConnection connessione = (HttpURLConnection) urlDownload.openConnection();
			BufferedReader input = new BufferedReader(new InputStreamReader(connessione.getInputStream()));
			String s = input.readLine();
			pVect = ParsingDownload.parse(s);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return pVect;
		
		
	}
	
}
