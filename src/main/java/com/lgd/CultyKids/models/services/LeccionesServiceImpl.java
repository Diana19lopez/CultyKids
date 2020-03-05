package com.lgd.CultyKids.models.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lgd.CultyKids.models.entities.Lecciones;
import com.lgd.CultyKids.models.repository.LeccionesRepository;


	@Service
	public class LeccionesServiceImpl implements LeccionesService {
	
	@Autowired
	public LeccionesRepository repository;

	@Override
	public List<Lecciones> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Lecciones save(Lecciones entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Lecciones> findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

	
}

	

	
	

