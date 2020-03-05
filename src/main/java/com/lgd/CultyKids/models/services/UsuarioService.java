package com.lgd.CultyKids.models.services;

import java.util.List;
import java.util.Optional;
import com.lgd.CultyKids.models.entities.Usuario;

public interface UsuarioService {
	public List<Usuario> findAll();
	public Usuario save(Usuario entity);
	public Optional<Usuario> findById (Long id);
	public void delete (Long id);
	
}
