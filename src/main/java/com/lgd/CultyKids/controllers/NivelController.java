package com.lgd.CultyKids.controllers;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lgd.CultyKids.models.services.NivelService;


import com.lgd.CultyKids.models.entities.Nivel;



@RestController
@RequestMapping("/nivel")
public class NivelController {

	@Autowired
	private NivelService nivelService;
	
	@RequestMapping (value="/preguntas", method = RequestMethod.GET)
	public List<Nivel> getList(){
		List<Nivel> address = nivelService.findAll();
		return address;
	}
	
	@RequestMapping(value="/preguntas/pregunta_id/respuestas/", method = RequestMethod.GET)
	public Nivel obtenerPorId(@PathVariable("id") Long id){
	java.util.Optional<Nivel> address = nivelService.findById(id);
	return address.get();
	}

	
	@RequestMapping (value="", method = RequestMethod.DELETE)
	public void eliminar(@PathVariable ("id")Long id){
		nivelService.delete(id);
	}
	
	@RequestMapping (value="", method = RequestMethod.PUT)
	public Nivel actualizar(Nivel entity){
		Nivel nivel = nivelService.save(entity);
		return nivel;
	}
	
	@RequestMapping (value="", method = RequestMethod.POST)
	public Nivel guardar(@RequestBody Nivel nivel){
		Nivel pregunt = nivelService.save(nivel);
	return pregunt;
		
	}
}