package fr.humanbooster.ma_bibliotheque.business;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Utilisateur {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected Long id;

	@NotBlank
	protected String nom;

	@NotBlank
	protected String prenom;

	@Email
	@NotBlank
	protected String email;

	@NotBlank
	@Size(min = 4, max = 15)
	protected String motDePasse;

	@JsonIgnore
	@OneToMany(mappedBy = "livre", cascade = CascadeType.REMOVE)
	private List<Livre> livres;

	public Utilisateur(String nom, String prenom, String email, String motDePasse) {
		this();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.motDePasse = motDePasse;
	}

}