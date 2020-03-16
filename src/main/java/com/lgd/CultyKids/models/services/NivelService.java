package com.lgd.CultyKids.models.services;


import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.lgd.CultyKids.models.entities.Nivel;


@Component
public interface NivelService {
	public List<Nivel> findAll();
	public Nivel save(Nivel entity);
	public Optional<Nivel> findById (Long id);
	public void delete (Long id);

}


