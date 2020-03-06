package com.lgd.CultyKids.models.services;


import java.util.List;
import java.util.Optional;
import com.lgd.CultyKids.models.entities.Respuesta;

public interface RespuestaService {
	public List<Respuesta> findAll();
	public Respuesta save(Respuesta entity);
	public Optional<Respuesta> findById (Long id);
	public void delete (Long id);
}
