package fr.humanbooster.ma_bibliotheque.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import fr.humanbooster.ma_bibliotheque.business.Auteur;
import fr.humanbooster.ma_bibliotheque.dao.AuteurDao;
import fr.humanbooster.ma_bibliotheque.service.AuteurService;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class AuteurServiceImpl implements AuteurService {
	
	private final AuteurDao auteurDao;
	
	public List<Auteur> recupererAuteurs() {
		return auteurDao.findAll();
	}

}
