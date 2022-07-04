package fr.humanbooster.ma_bibliotheque.service;

import java.util.List;

import fr.humanbooster.ma_bibliotheque.business.Lecteur;
import fr.humanbooster.ma_bibliotheque.business.Utilisateur;

public interface UtilisateurService {

	List<Utilisateur> recupererUtilisateurs();

	Lecteur ajouterLecteur(Lecteur lecteur);

	Utilisateur recupererUtilisateurParEmail(String email);

}
