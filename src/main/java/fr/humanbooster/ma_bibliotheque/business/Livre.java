package fr.humanbooster.ma_bibliotheque.business;

import java.time.LocalDate;
import java.util.*;

/**
 * 
 */
public class Livre {

    /**
     * Default constructor
     */
    public Livre() {
    }

    /**
     * 
     */
    private Long id;

    /**
     * 
     */
    private String titre;

    /**
     * 
     */
    private String isbn;

    /**
     * 
     */
    private LocalDate dateDeParution;

    /**
     * 
     */
    private Type type;


    /**
     * 
     */
    private Set<Pret> prets;


    /**
     * 
     */
    private Editeur editeur;

    /**
     * 
     */
    private Auteur auteur;

    /**
     * 
     */
    private Categorie categorie;

}