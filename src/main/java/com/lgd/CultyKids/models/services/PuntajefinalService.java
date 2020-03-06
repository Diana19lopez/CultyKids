package com.lgd.CultyKids.models.services;

import java.util.List;
import java.util.Optional;

import com.lgd.CultyKids.models.entities.PuntajeFinal;



public interface PuntajefinalService {
	public List<PuntajeFinal> findAll();
	public PuntajeFinal save(PuntajeFinal entity);
	public Optional<PuntajeFinal> findById (long id);
	public void delete (Long id);


}
