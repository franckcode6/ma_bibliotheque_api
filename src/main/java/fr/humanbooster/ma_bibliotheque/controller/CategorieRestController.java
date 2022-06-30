package fr.humanbooster.ma_bibliotheque.controller;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.humanbooster.ma_bibliotheque.business.Categorie;
import fr.humanbooster.ma_bibliotheque.service.CategorieService;
import lombok.AllArgsConstructor;

@RestController
@CrossOrigin
@RequestMapping("/api")
@AllArgsConstructor
public class CategorieRestController {

	private final CategorieService categorieService;
	
	@GetMapping(value = "categories", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Categorie> categoriesGetAll() {
		return categorieService.recupererCategories();
	}
}
