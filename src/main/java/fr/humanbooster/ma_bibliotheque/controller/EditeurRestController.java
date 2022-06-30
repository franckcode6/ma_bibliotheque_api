package fr.humanbooster.ma_bibliotheque.controller;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.humanbooster.ma_bibliotheque.business.Editeur;
import fr.humanbooster.ma_bibliotheque.service.EditeurService;
import lombok.AllArgsConstructor;

@RestController
@CrossOrigin
@RequestMapping("/api")
@AllArgsConstructor
public class EditeurRestController {

	private final EditeurService editeurService;
	
	@GetMapping(value = "editeurs", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Editeur> editeursGetAll() {
		return editeurService.recupererEditeurs();
	}
	
	
}
