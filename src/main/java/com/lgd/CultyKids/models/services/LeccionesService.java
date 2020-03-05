package com.lgd.CultyKids.models.services;

import java.util.List;
import java.util.Optional;
import com.lgd.CultyKids.models.entities.Lecciones;

public interface LeccionesService {
	public List<Lecciones> findAll();
	public Lecciones save(Lecciones entity);
	public Optional<Lecciones> findById (Long id);
	public void delete (Long id);
	
}
