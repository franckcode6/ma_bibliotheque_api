package fr.humanbooster.ma_bibliotheque.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.humanbooster.ma_bibliotheque.business.Livre;

public interface LivreDao extends JpaRepository<Livre, Long> {

}
