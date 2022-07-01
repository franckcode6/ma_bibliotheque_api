package fr.humanbooster.ma_bibliotheque.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import fr.humanbooster.cap_entreprise.business.Joueur;
import fr.humanbooster.ma_bibliotheque.business.Lecteur;
import fr.humanbooster.ma_bibliotheque.business.Utilisateur;
import fr.humanbooster.ma_bibliotheque.service.UtilisateurService;
import lombok.AllArgsConstructor;

@RestController
@CrossOrigin
@RequestMapping("/api")
@AllArgsConstructor
public class UtilisateurRestController {

	private final UtilisateurService utilisateurService;
	
	@GetMapping(value = "utilisateurs", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Utilisateur> utilisateursGetAll() {
		return utilisateurService.recupererUtilisateurs();
	}
	
	@PostMapping(value = "utilisateurs")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Utilisateur lecteurPost(@RequestBody Lecteur lecteur) {
		return utilisateurService.ajouterLecteur(lecteur);
	}
}
