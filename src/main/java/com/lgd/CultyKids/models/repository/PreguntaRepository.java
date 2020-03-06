package com.lgd.CultyKids.models.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.lgd.CultyKids.models.entities.Pregunta;

	@Repository
	public interface PreguntaRepository extends
	CrudRepository<Pregunta, Long> {

}
