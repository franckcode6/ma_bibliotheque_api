package fr.humanbooster.ma_bibliotheque.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import fr.humanbooster.ma_bibliotheque.business.Categorie;
import fr.humanbooster.ma_bibliotheque.dao.CategorieDao;
import fr.humanbooster.ma_bibliotheque.service.CategorieService;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CategorieServiceImpl implements CategorieService {
	
	private final CategorieDao categorieDao;
	
	public List<Categorie> recupererCategories() {
		return categorieDao.findAll();
	}

	@Override
	public Categorie recupererCategorie(Long id) {
		return categorieDao.findById(id).orElse(null);
	}

}
