package com.lgd.CultyKids.models.services;

import java.util.List;
import java.util.Optional;
import com.lgd.CultyKids.models.entities.Seleccion;

public interface SeleccionService {
	public List<Seleccion> findAll();
	public Seleccion save(Seleccion entity);
	public Optional<Seleccion> findById (Long id);
	public void delete (Long id);
}

