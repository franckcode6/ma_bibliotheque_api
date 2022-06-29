package fr.humanbooster.ma_bibliotheque.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.humanbooster.ma_bibliotheque.business.Auteur;

public interface AuteurDao extends JpaRepository<Auteur, Long> {

}
