package fr.humanbooster.ma_bibliotheque.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import fr.humanbooster.ma_bibliotheque.business.Livre;
import fr.humanbooster.ma_bibliotheque.dao.LivreDao;
import fr.humanbooster.ma_bibliotheque.service.LivreService;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class LivreServiceImpl implements LivreService {

	private final LivreDao livreDao;

	@Override
	public List<Livre> recupererLivres() {
		return livreDao.findAll();
	}

}
