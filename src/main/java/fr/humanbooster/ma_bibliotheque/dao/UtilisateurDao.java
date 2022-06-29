package fr.humanbooster.ma_bibliotheque.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.humanbooster.ma_bibliotheque.business.Utilisateur;

public interface UtilisateurDao extends JpaRepository<Utilisateur, Long> {

}
