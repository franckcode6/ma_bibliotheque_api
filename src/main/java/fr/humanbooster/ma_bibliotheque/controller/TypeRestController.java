package fr.humanbooster.ma_bibliotheque.controller;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.humanbooster.ma_bibliotheque.business.Type;
import fr.humanbooster.ma_bibliotheque.service.TypeService;
import lombok.AllArgsConstructor;

@RestController
@CrossOrigin
@RequestMapping("/api")
@AllArgsConstructor
public class TypeRestController {

	private final TypeService typeService;

	@GetMapping(value = "types", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Type> typesGetAll() {
		return typeService.recupererTypes();
	}
	
	@GetMapping("types/{id}")
	public Type typeGetById(@PathVariable final Long id) {
		return typeService.recupererType(id);
	}
}
