package com.lgd.CultyKids.models.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lgd.CultyKids.models.entities.Respuesta;
import com.lgd.CultyKids.models.repository.RespuestaRepository;


	@Service
	public class RespuestaServiceImpl implements RespuestaService {
	
	@Autowired
	public RespuestaRepository repository;

	@Override
	public List<Respuesta> findAll() {
		List<Respuesta> respuestas = (List<Respuesta>)repository.findAll();
		return respuestas;
	}

	@Override
	public Respuesta save(Respuesta entity) {
		return repository.save(entity);
	}

	@Override
	public Optional<Respuesta> findById(Long id) {
		return repository.findById(id);
	}
	
	@Override
	public void delete(Long id) {
		repository.deleteById(id);
	}
	
}

