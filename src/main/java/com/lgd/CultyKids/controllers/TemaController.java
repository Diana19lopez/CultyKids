package com.lgd.CultyKids.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lgd.CultyKids.models.entities.Seleccion;
import com.lgd.CultyKids.models.entities.Tema;
import com.lgd.CultyKids.models.services.TemaService;

@RestController
@RequestMapping("/cultyKids/tema")
public class TemaController {

	@Autowired
	private TemaService temaService;
	
	@RequestMapping (value="", method = RequestMethod.GET)
	public List<Tema> getList(){
		List<Tema> address = temaService.findAll();
		return address;
	}
	
	@RequestMapping(value="/{id}", method = RequestMethod.GET)
	public Tema obtenerPorId(@PathVariable("id") Long id){
	java.util.Optional<Tema> address = temaService.findById(id);
	return address.get();
	}
	
	@RequestMapping (value="", method = RequestMethod.PUT)
	public Tema actualizar(Tema entity){
		Tema tema = temaService.save(entity);
		return tema;
	}
	
	@RequestMapping (value="", method = RequestMethod.POST)
	public Tema guardar(Tema entity){
		Tema tema = temaService.save(entity);
	return tema;
		
	}
}
