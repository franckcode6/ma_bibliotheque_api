package fr.humanbooster.ma_bibliotheque.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.humanbooster.ma_bibliotheque.business.Lecteur;

public interface LecteurDao extends JpaRepository<Lecteur, Long> {

}
