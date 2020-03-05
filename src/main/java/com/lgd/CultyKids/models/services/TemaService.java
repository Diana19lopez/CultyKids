package com.lgd.CultyKids.models.services;

import java.util.List;
import java.util.Optional;
import com.lgd.CultyKids.models.entities.Tema;

public interface TemaService {
	public List<Tema> findAll();
	public Tema save(Tema entity);
	public Optional<Tema> findById (Long id);
	public void delete (Long id);
	
}
