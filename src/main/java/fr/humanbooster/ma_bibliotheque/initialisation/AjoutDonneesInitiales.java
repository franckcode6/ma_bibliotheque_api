package fr.humanbooster.ma_bibliotheque.initialisation;

import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Random;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.github.javafaker.Faker;

import fr.humanbooster.ma_bibliotheque.business.Admin;
import fr.humanbooster.ma_bibliotheque.business.Auteur;
import fr.humanbooster.ma_bibliotheque.business.Categorie;
import fr.humanbooster.ma_bibliotheque.business.Editeur;
import fr.humanbooster.ma_bibliotheque.business.Lecteur;
import fr.humanbooster.ma_bibliotheque.business.Livre;
import fr.humanbooster.ma_bibliotheque.business.Type;
import fr.humanbooster.ma_bibliotheque.dao.AdminDao;
import fr.humanbooster.ma_bibliotheque.dao.AuteurDao;
import fr.humanbooster.ma_bibliotheque.dao.CategorieDao;
import fr.humanbooster.ma_bibliotheque.dao.EditeurDao;
import fr.humanbooster.ma_bibliotheque.dao.LecteurDao;
import fr.humanbooster.ma_bibliotheque.dao.LivreDao;
import fr.humanbooster.ma_bibliotheque.dao.TypeDao;
import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class AjoutDonneesInitiales implements CommandLineRunner {

	private final Faker faker = new Faker(new Locale("fr-FR"));

	private static final Random random = new Random();

	private final AdminDao adminDao;
	private final AuteurDao auteurDao;
	private final CategorieDao categorieDao;
	private final EditeurDao editeurDao;
	private final LecteurDao lecteurDao;
	private final LivreDao livreDao;
	private final TypeDao typeDao;

	private List<Admin> admins;
	private List<Auteur> auteurs;
	private List<Categorie> categories;
	private List<Editeur> editeurs;
	private List<Lecteur> lecteurs;
	private List<Livre> livres;
	private List<Type> types;

	@Override
	public void run(String... args) throws Exception {
		Date dateDebut = new Date();

		// ADMINS
		ajouterAdmins();

		// AUTEURS
		ajouterAuteurs();

		// CATEGORIES
		ajouterCategories();

		// EDITEURS
		ajouterEditeurs();

		// LECTEURS
		ajouterLecteurs();

		// TYPES
		ajouterTypes();

		// LIVRES
		ajouterLivres();
		Date dateFin = new Date();
		System.out.println("Données initiales générées en " + (dateFin.getTime() - dateDebut.getTime()) + " ms");
	}

	private void ajouterAuteurs() {
		if (auteurDao.count() == 0) {
			auteurs.add(new Auteur("Werber", "Bernard",
					faker.date().birthday().toInstant().atZone(ZoneId.systemDefault()).toLocalDate(), "France"));
			auteurs.add(new Auteur("King", "Stephen",
					faker.date().birthday().toInstant().atZone(ZoneId.systemDefault()).toLocalDate(), "USA"));
			auteurs.add(new Auteur("Asimov", "Isaac",
					faker.date().birthday().toInstant().atZone(ZoneId.systemDefault()).toLocalDate(), "Russie"));
			auteurs.add(new Auteur("Roth", "Philip",
					faker.date().birthday().toInstant().atZone(ZoneId.systemDefault()).toLocalDate(), "USA"));
			for (int i = 0; i < 50; i++) {
				auteurs.add(new Auteur(faker.name().lastName(), faker.name().firstName(),
						faker.date().birthday().toInstant().atZone(ZoneId.systemDefault()).toLocalDate(), "France"));
			}
			auteurDao.saveAll(auteurs);
		}
	}

	private void ajouterCategories() {
		if (categorieDao.count() == 0) {
			categories.add(new Categorie("Jeunesse"));
			categories.add(new Categorie("Action"));
			categories.add(new Categorie("Litterature classique"));
			categories.add(new Categorie("Theatre"));
			categories.add(new Categorie("Science Fiction"));
			categories.add(new Categorie("Autobiographie"));
			categories.add(new Categorie("Conte"));
			categories.add(new Categorie("Drame"));
			categories.add(new Categorie("Aventure"));
			categories.add(new Categorie("Humour"));
			categories.add(new Categorie("Horreur"));
			categories.add(new Categorie("Ado"));
			categorieDao.saveAll(categories);
		}
	}

	private void ajouterEditeurs() {
		if (editeurDao.count() == 0) {
			editeurs.add(new Editeur("Albin Michel"));
			editeurs.add(new Editeur("Le livre de proche"));
			editeurs.add(new Editeur("Pocket"));
			editeurs.add(new Editeur("Glenat"));
			editeurs.add(new Editeur("Dupuis"));
			editeurs.add(new Editeur("Flammarion"));
			editeurs.add(new Editeur("Auto-edition"));
			editeurDao.saveAll(editeurs);
		}
	}

	private void ajouterTypes() {
		if (typeDao.count() == 0) {
			types.add(new Type("BD"));
			types.add(new Type("Poche"));
			types.add(new Type("Broche"));
			types.add(new Type("Relie"));
			types.add(new Type("Autre"));
			types.add(new Type("Revue"));
			typeDao.saveAll(types);
		}
	}

	private void ajouterAdmins() {
		if (adminDao.count() == 0) {
			admins.add(new Admin("admin", "admin", "admin@hb.com", "12345", "0102030405"));
			admins.add(new Admin("Franck", "Quasevi", "franck@hb.com", "12345", "0102030405"));
			adminDao.saveAll(admins);
		}
	}

	private void ajouterLecteurs() {
		if (lecteurDao.count() == 0) {
			for (int i = 0; i < 100; i++) {
				lecteurs.add(new Lecteur(faker.name().lastName(), faker.name().firstName(),
						faker.internet().emailAddress(), "12345",
						faker.date().birthday().toInstant().atZone(ZoneId.systemDefault()).toLocalDate()));

			}
			lecteurDao.saveAll(lecteurs);
		}
	}

	private void ajouterLivres() {
		if (livreDao.count() == 0) {
			for (int i = 0; i < 200; i++) {
				livres.add(new Livre("titre " + i, "1234567891234",
						faker.date().birthday().toInstant().atZone(ZoneId.systemDefault()).toLocalDate(),
						types.get(random.nextInt(types.size())), editeurs.get(random.nextInt(editeurs.size())),
						auteurs.get(random.nextInt(auteurs.size())), categories.get(random.nextInt(categories.size())),
						lecteurs.get(random.nextInt(lecteurs.size()))));
			}
			livreDao.saveAll(livres);
		}
	}
}
