package fr.humanbooster.ma_bibliotheque.service;

import java.util.List;

import fr.humanbooster.ma_bibliotheque.business.Livre;

public interface LivreService {

	List<Livre> recupererLivres();

	Livre recupererLivre(Long id);

	Livre ajouterLivre(Livre livre);

}
