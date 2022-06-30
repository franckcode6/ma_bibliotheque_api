package fr.humanbooster.ma_bibliotheque.service;

import java.util.List;

import fr.humanbooster.ma_bibliotheque.business.Editeur;

public interface EditeurService {

	List<Editeur> recupererEditeurs();

	Editeur recupererEditeur(Long id);

}
