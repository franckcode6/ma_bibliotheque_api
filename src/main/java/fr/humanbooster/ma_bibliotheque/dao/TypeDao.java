package fr.humanbooster.ma_bibliotheque.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.humanbooster.ma_bibliotheque.business.Type;

public interface TypeDao extends JpaRepository<Type, Long> {

}
