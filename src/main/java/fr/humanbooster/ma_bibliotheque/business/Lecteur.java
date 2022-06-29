package fr.humanbooster.ma_bibliotheque.business;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Lecteur extends Utilisateur {

	@NotNull
	private LocalDate dateDeNaissance;

	public Lecteur(String nom, String prenom, String email, String motDePasse, LocalDate dateDeNaissance) {
		super(nom, prenom, email, motDePasse);
		this.dateDeNaissance = dateDeNaissance;
	}

}