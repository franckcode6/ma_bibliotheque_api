package fr.humanbooster.ma_bibliotheque.business;

import java.time.LocalDate;
import java.util.*;

/**
 * 
 */
public class Auteur {

    /**
     * Default constructor
     */
    public Auteur() {
    }

    /**
     * 
     */
    private Long id;

    /**
     * 
     */
    private String nom;

    /**
     * 
     */
    private String prenom;

    /**
     * 
     */
    private LocalDate dateDeNaissance;

    /**
     * 
     */
    private String nationalite;

    /**
     * 
     */
    private Set<Livre> livres;

}