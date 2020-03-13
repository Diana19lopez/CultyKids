package com.lgd.CultyKids.models.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lgd.CultyKids.models.entities.Seleccion;
import com.lgd.CultyKids.models.repository.SeleccionRepository;


	@Service
	public class SeleccionServiceImpl implements SeleccionService {
	
	@Autowired
	public SeleccionRepository repository;

	@Override
	public List<Seleccion> findAll() {
		List<Seleccion> selecciones = (List<Seleccion>)repository.findAll();
		return selecciones;
	}

	@Override
	public Seleccion save(Seleccion entity) {
		return repository.save(entity);
	}

	@Override
	public Optional<Seleccion> findById(Long id) {
		return repository.findById(id);
	}

	@Override
	public void delete(Long id) {
		repository.deleteById(id);
	}
}