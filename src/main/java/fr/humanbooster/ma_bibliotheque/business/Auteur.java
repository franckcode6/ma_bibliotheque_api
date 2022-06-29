package fr.humanbooster.ma_bibliotheque.business;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Auteur {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank
	private String nom;

	@NotBlank
	private String prenom;

	@NotNull
	private LocalDate dateDeNaissance;

	@NotBlank
	private String nationalite;

	@JsonBackReference
	@OneToMany(mappedBy = "auteur")
	private List<Livre> livres;
	
	public Auteur(String nom, String prenom, LocalDate dateDeNaissance, String nationalite) {
		this();
		this.nom = nom;
		this.prenom = prenom;
		this.dateDeNaissance = dateDeNaissance;
		this.nationalite = nationalite;
		
	}

}