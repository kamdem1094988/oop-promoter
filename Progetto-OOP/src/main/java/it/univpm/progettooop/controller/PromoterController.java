package it.univpm.progettooop.controller;

import java.util.Vector;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import it.univpm.progettooop.api.Download;
import it.univpm.progettooop.exception.NoDataException;
import it.univpm.progettooop.model.Promoter;

@RestController
public class PromoterController {

	@GetMapping("/promoter")
	public Vector<Promoter> promoter() throws NoDataException {
		return Download.callTicketmaster();
	}
	
}
