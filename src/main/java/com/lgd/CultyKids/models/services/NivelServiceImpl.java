package com.lgd.CultyKids.models.services;

import java.util.List;
import java.util.Optional;

import org.jvnet.hk2.annotations.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.lgd.CultyKids.models.entities.Nivel;
import com.lgd.CultyKids.models.repository.NivelRepository;



@Service
public class NivelServiceImpl implements NivelService {

	@Autowired
	public NivelRepository repository;

	@Override
	public Nivel save(Nivel entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Nivel> findById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Nivel> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	 
	
}
