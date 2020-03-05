package com.lgd.CultyKids.models.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lgd.CultyKids.models.entities.Tema;
import com.lgd.CultyKids.models.repository.TemaRepository;


	@Service
	public class TemaServiceImpl implements TemaService {
	
	@Autowired
	public TemaRepository repository;

	@Override
	public List<Tema> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Tema save(Tema entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Tema> findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}
	
	}
