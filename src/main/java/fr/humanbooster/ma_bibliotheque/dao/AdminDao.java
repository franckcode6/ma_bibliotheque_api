package fr.humanbooster.ma_bibliotheque.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.humanbooster.ma_bibliotheque.business.Admin;

public interface AdminDao extends JpaRepository<Admin, Long> {

}
