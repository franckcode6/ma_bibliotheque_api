package fr.humanbooster.ma_bibliotheque.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import fr.humanbooster.ma_bibliotheque.business.Editeur;
import fr.humanbooster.ma_bibliotheque.dao.EditeurDao;
import fr.humanbooster.ma_bibliotheque.service.EditeurService;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class EditeurServiceImpl implements EditeurService {
	
	private final EditeurDao editeurDao;
	
	@Override
	public List<Editeur> recupererEditeurs() {
		return editeurDao.findAll();
	}

}
