package fr.humanbooster.ma_bibliotheque.controller;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.humanbooster.ma_bibliotheque.business.Livre;
import fr.humanbooster.ma_bibliotheque.service.LivreService;
import lombok.AllArgsConstructor;

@RestController
@CrossOrigin
@RequestMapping("/api")
@AllArgsConstructor
public class LivreRestController {

	private final LivreService livreService;
	
	@GetMapping(value = "livres", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Livre> livresGetAll() {
		return livreService.recupererLivres();
	}
}
