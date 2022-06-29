package fr.humanbooster.ma_bibliotheque.business;

import java.time.LocalDate;
import java.util.*;

/**
 * 
 */
public class Pret {

    /**
     * Default constructor
     */
    public Pret() {
    }

    /**
     * 
     */
    private Long id;

    /**
     * 
     */
    private LocalDate dateDePret;

    /**
     * 
     */
    private LocalDate dateDeRetour;

    /**
     * 
     */
    private Livre livre;

    /**
     * 
     */
    private Utilisateur utilisateur;

}