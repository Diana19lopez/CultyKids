package com.lgd.CultyKids.models.services;

import java.util.List;
import java.util.Optional;
import com.lgd.CultyKids.models.entities.Pregunta;

public interface PreguntaService {
	public List<Pregunta> findAll();
	public Pregunta save(Pregunta entity);
	public Optional<Pregunta> findById (Long id);
	public void delete (Long id);
}
