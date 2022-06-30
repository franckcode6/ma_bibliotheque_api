package fr.humanbooster.ma_bibliotheque.controller;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.humanbooster.ma_bibliotheque.business.Auteur;
import fr.humanbooster.ma_bibliotheque.service.AuteurService;
import lombok.AllArgsConstructor;

@RestController
@CrossOrigin
@RequestMapping("/api")
@AllArgsConstructor
public class AuteurRestController {

	private final AuteurService auteurService;
	
	@GetMapping(value = "auteurs", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Auteur> auteursGetAll() {
		return auteurService.recupererAuteurs();
	}
	
	@GetMapping("auteurs/{id}")
	public Auteur auteurGetById(@PathVariable final Long id) {
		return auteurService.recupererAuteur(id);
	}
}
