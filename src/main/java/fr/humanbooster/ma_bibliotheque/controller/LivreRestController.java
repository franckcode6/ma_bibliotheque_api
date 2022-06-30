package fr.humanbooster.ma_bibliotheque.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
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
	
	@GetMapping("livres/{id}")
	public Livre livreGetById(@PathVariable final Long id) {
		return livreService.recupererLivre(id);
	}

	@PostMapping(value = "avis")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Livre livrePost(@RequestBody Livre livre) {
		return livreService.ajouterLivre(livre);
	}
}
