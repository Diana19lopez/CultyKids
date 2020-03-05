package com.lgd.CultyKids.models.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lgd.CultyKids.models.entities.Usuario;
import com.lgd.CultyKids.models.repository.UsuarioRepository;


	@Service
	public class UsuarioServiceImpl implements UsuarioService {
	
	@Autowired
	public UsuarioRepository repository;

	@Override
	public List<Usuario> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario save(Usuario entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Usuario> findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

	
	
}
