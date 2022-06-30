package fr.humanbooster.ma_bibliotheque.service;

import java.util.List;

import fr.humanbooster.ma_bibliotheque.business.Auteur;

public interface AuteurService {

	List<Auteur> recupererAuteurs();

	Auteur recupererAuteur(Long id);

}
