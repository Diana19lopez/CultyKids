package com.lgd.CultyKids.models.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lgd.CultyKids.models.entities.Tema;
import com.lgd.CultyKids.models.repository.TemaRepository;

	
	@Service
	public class TemaServiceImpl implements TemaService{
	
	@Autowired
	public TemaRepository repository;
	
	@Override
	public List<Tema> findAll() {
		List<Tema> tema = (List<Tema>)repository.findAll();
		return tema;
	}
	
	@Override
	public Tema save(Tema entity) {
		return repository.save(entity);
	}
	
	@Override
	public Optional<Tema> findById(Long id) {
		return repository.findById(id);
	}
	
	@Override
	public void delete(Long id) {
		repository.deleteById(id);
		
	}
	}

