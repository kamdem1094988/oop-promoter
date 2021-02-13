package it.univpm.progettooop.parsing;

import java.util.Vector;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import it.univpm.progettooop.exception.NoDataException;
import it.univpm.progettooop.model.Promoter;

public class ParsingDownload {

	public static Vector<Promoter> parse(String s)throws NoDataException {

		Vector<Promoter> promoterVect = new Vector<Promoter>();
		Promoter p = null;

		try {

			JSONParser parser = new JSONParser();
			JSONObject object = (JSONObject) parser.parse(s);
			JSONObject embedded = (JSONObject) object.get("_embedded");
			JSONArray events = (JSONArray) embedded.get("events");
			for (int i = 0; i<events.size(); i++) {
				JSONObject eventsObject = (JSONObject) events.get(i);
				JSONArray classifications = (JSONArray) eventsObject.get("classifications");
				JSONObject classificationsObject = (JSONObject) classifications.get(0);
				JSONObject genre = (JSONObject) classificationsObject.get("genre");

				String idGenre = (String) genre.get("id");

				String nameGenre = (String) genre.get("name");

				JSONObject promoter = (JSONObject) eventsObject.get("promoter");
				
				String idPromoter = (String) promoter.get("id");
				
				System.out.println(idGenre + " " + nameGenre + " " + idPromoter);

				String namePromoter = (String) promoter.get("name");

				String descriptionPromoter = (String) promoter.get("description");

				JSONObject emb = (JSONObject) eventsObject.get("_embedded");
				JSONArray venues = (JSONArray) emb.get("venues");
				JSONObject venuesObject = (JSONObject) venues.get(0);
				JSONObject country = (JSONObject) venuesObject.get("country");

				String countryName = (String) country.get("name");

				String countryCode = (String) country.get("countryCode");

				p = new Promoter(idPromoter, namePromoter, descriptionPromoter);
				
				promoterVect.add(p);

//			System.out.println(idGenre + " " + nameGenre + " " + idPromoter + " " + namePromoter + " " + descriptionPromoter + " " + countryName + " " + countryCode);
			}

		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
		return promoterVect;

	}

}
