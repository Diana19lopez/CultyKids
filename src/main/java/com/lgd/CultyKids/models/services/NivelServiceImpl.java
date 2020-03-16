package com.lgd.CultyKids.models.services;


import java.util.List;
import java.util.Optional;

import org.jvnet.hk2.annotations.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lgd.CultyKids.models.entities.Nivel;
import com.lgd.CultyKids.models.repository.NivelRepository;




	@Service
	@Component
	public class NivelServiceImpl implements NivelService{
	
	@Autowired
	public NivelRepository repository;
	
	@Override
	public List<Nivel> findAll() {
		List<Nivel> nivel = (List<Nivel>)repository.findAll();
		return nivel;
	}
	
	@Override
	public Nivel save(Nivel entity) {
		return repository.save(entity);
	}
	
	@Override
	public Optional<Nivel> findById (Long id) {
		return repository.findById(id);
	}
	
	@Override
	public void delete(Long id) {
		repository.deleteById(id);
		
	}

}

