package com.lgd.CultyKids.models.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.lgd.CultyKids.models.entities.Usuario;

	@Repository
	public interface UsuarioRepository extends 
	CrudRepository<Usuario, Long> {


}
