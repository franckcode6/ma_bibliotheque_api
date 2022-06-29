package fr.humanbooster.ma_bibliotheque.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import fr.humanbooster.ma_bibliotheque.business.Utilisateur;
import fr.humanbooster.ma_bibliotheque.dao.UtilisateurDao;
import fr.humanbooster.ma_bibliotheque.service.UtilisateurService;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UtilisateurServiceImpl implements UtilisateurService {
	
	private final UtilisateurDao utilisateurDao;
	
	public List<Utilisateur> recupererUtilisateurs() {
		return utilisateurDao.findAll();
	}

}
