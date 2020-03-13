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
		List<Pregunta> preguntas = (List<Pregunta>)repository.findAll();
		return preguntas;
	}

	@Override
	public Pregunta save(Pregunta entity) {
		return repository.save(entity);
	}

	@Override
	public Optional<Pregunta> findById(Long id) {
		return repository.findById(id);
	}

	@Override
	public void delete(Long id) {
		repository.deleteById(id);
		
	}
}
