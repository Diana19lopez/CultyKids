package com.lgd.CultyKids.models.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lgd.CultyKids.models.entities.Usuario;
import com.lgd.CultyKids.models.repository.UsuarioRepository;


	@Service
	public class UsuarioServiceImpl implements UsuarioService{
	
	@Autowired
	public UsuarioRepository repository;
	
	@Override
	public List<Usuario> findAll() {
		List<Usuario> usuario = (List<Usuario>)repository.findAll();
		return usuario;
	}
	
	@Override
	public Usuario save(Usuario entity) {
		return repository.save(entity);
	}
	
	@Override
	public Optional<Usuario> findById(Long id) {
		return repository.findById(id);
	}
	
	@Override
	public void delete(Long id) {
		repository.deleteById(id);
		
	}
	}
