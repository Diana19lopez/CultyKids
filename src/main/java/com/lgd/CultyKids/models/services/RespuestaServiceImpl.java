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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Respuesta save(Respuesta entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Respuesta> findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}
}

