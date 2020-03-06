package com.lgd.CultyKids.models.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.lgd.CultyKids.models.entities.Seleccion;

	@Repository
	public interface SeleccionRepository extends
	CrudRepository<Seleccion, Long> {
}
