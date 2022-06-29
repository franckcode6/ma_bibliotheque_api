package fr.humanbooster.ma_bibliotheque.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.humanbooster.ma_bibliotheque.business.Categorie;

public interface CategorieDao extends JpaRepository<Categorie, Long> {

}
