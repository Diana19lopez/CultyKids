package com.lgd.CultyKids.models.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lgd.CultyKids.models.entities.Pregunta;
import com.lgd.CultyKids.models.repository.PreguntaRepository;


	@Service
	public class PreguntaServiceImpl implements PreguntaService{

	@Autowired
	public PreguntaRepository repository;

	@Override
	public List<Pregunta> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pregunta save(Pregunta entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Pregunta> findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}
}
