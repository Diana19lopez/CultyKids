package com.lgd.CultyKids.models.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.lgd.CultyKids.models.entities.Tema;

	@Repository
	public interface TemaRepository extends 
	CrudRepository<Tema, Long> {


}
