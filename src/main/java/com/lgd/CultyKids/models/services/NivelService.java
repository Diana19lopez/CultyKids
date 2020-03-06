package com.lgd.CultyKids.models.services;

import java.util.List;
import java.util.Optional;

import com.lgd.CultyKids.models.entities.Nivel;



public interface NivelService {
	public List<Nivel> findAll();
	public Nivel save(Nivel entity);
	public Optional<Nivel> findById (long id);
	public void delete (Long id);

}
