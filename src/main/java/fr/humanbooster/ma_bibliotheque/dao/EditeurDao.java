package fr.humanbooster.ma_bibliotheque.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.humanbooster.ma_bibliotheque.business.Editeur;

public interface EditeurDao extends JpaRepository<Editeur, Long> {

}
