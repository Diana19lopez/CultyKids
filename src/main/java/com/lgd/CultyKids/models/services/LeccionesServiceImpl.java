package com.lgd.CultyKids.models.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lgd.CultyKids.models.entities.Lecciones;
import com.lgd.CultyKids.models.repository.LeccionesRepository;



	@Service
	public class LeccionesServiceImpl implements LeccionesService{
	
	@Autowired
	public LeccionesRepository repository;
	
	@Override
	public List<Lecciones> findAll() {
		List<Lecciones> lecciones = (List<Lecciones>)repository.findAll();
		return lecciones;
	}
	
	@Override
	public Lecciones save(Lecciones entity) {
		return repository.save(entity);
	}
	
	@Override
	public Optional<Lecciones> findById(Long id) {
		return repository.findById(id);
	}
	
	@Override
	public void delete(Long id) {
		repository.deleteById(id);
		
	}
	}
	

	
	

