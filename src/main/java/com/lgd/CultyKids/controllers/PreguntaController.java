package com.lgd.CultyKids.controllers;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lgd.CultyKids.models.services.PreguntaService;
import com.lgd.CultyKids.models.entities.Pregunta;

@RestController
@RequestMapping("/cultyKids/pregunta")
public class PreguntaController {

	@Autowired
	private PreguntaService preguntaService;
	
	@RequestMapping (value="", method = RequestMethod.GET)
	public List<Pregunta> getList(){
		List<Pregunta> address = preguntaService.findAll();
		return address;
	}
	
	@RequestMapping(value="/{id}", method = RequestMethod.GET)
	public Pregunta obtenerPorId(@PathVariable("id") Long id){
		   Optional<Pregunta> address = preguntaService.findById(id);
	return address.get();
	}
	
	@RequestMapping (value="/{id}", method = RequestMethod.DELETE)
	public void deleteById(@PathVariable ("id") Long id){
		preguntaService.delete(id);
	}
	
	@RequestMapping (value="", method = RequestMethod.PUT)
	public Pregunta actualizar(Pregunta entity){
		Pregunta pregunta = preguntaService.save(entity);
		return pregunta;
	}
	
	@RequestMapping (value="", method = RequestMethod.POST)
	public Pregunta guardar(@RequestBody Pregunta pregunta){
		Pregunta preg = preguntaService.save(pregunta);
	return preg;
		
	}
}
