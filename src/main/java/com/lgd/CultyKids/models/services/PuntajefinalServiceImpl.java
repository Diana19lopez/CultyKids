package com.lgd.CultyKids.models.services;

import java.util.List;
import java.util.Optional;

import org.jvnet.hk2.annotations.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.lgd.CultyKids.models.entities.PuntajeFinal;
import com.lgd.CultyKids.models.repository.PuntajefinalRepository;

	@Service
	public class PuntajefinalServiceImpl implements PuntajefinalService{
	
	@Autowired
	public PuntajefinalRepository repository;
	
	@Override
	public List<PuntajeFinal> findAll() {
		List<PuntajeFinal> puntajefinal = (List<PuntajeFinal>)repository.findAll();
		return puntajefinal;
	}
	
	@Override
	public PuntajeFinal save(PuntajeFinal entity) {
		return repository.save(entity);
	}
	
	@Override
	public Optional<PuntajeFinal> findById(long id) {
		return repository.findById(id);
	}
	
	@Override
	public void delete(Long id) {
		repository.deleteById(id);
		
	}
	}
