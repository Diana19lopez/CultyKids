package com.lgd.CultyKids.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lgd.CultyKids.models.entities.Usuario;
import com.lgd.CultyKids.models.services.UsuarioService;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;
	
	@RequestMapping (value="/usuario", method = RequestMethod.GET)
	public List<Usuario> getList(){
		List<Usuario> address = usuarioService.findAll();
		return address;
	}
	
	@RequestMapping(value="/usuario/usuario_id/nombre/", method = RequestMethod.GET)
	public Usuario obtenerPorId(@PathVariable("id") Long id){
	java.util.Optional<Usuario> address = usuarioService.findById(id);
	return address.get();
	}
	
	@RequestMapping (value="", method = RequestMethod.PUT)
	public Usuario actualizar(Usuario entity){
		Usuario usuario = usuarioService.save(entity);
		return usuario;
	}
	
	@RequestMapping (value="", method = RequestMethod.POST)
	public Usuario guardar(Usuario entity){
		Usuario usuario = usuarioService.save(entity);
	return usuario;
		
	}
}

