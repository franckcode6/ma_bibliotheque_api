package fr.humanbooster.ma_bibliotheque.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import fr.humanbooster.ma_bibliotheque.business.Type;
import fr.humanbooster.ma_bibliotheque.dao.TypeDao;
import fr.humanbooster.ma_bibliotheque.service.TypeService;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class TypeServiceImpl implements TypeService {
	
	private final TypeDao typeDao;
	
	public List<Type> recupererTypes() {
		return typeDao.findAll();
	}

}
