package com.lgd.CultyKids.models.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.lgd.CultyKids.models.entities.Lecciones;

	@Repository
	public interface LeccionesRepository extends 
	CrudRepository<Lecciones, Long> {


}
