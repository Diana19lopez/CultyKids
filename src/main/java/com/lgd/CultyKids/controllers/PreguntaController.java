package com.lgd.CultyKids.controllers;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lgd.CultyKids.models.services.PreguntaService;
import com.lgd.CultyKids.models.entities.Pregunta;

@RestController
@RequestMapping("/pregunta")
public class PreguntaController {

	@Autowired
	private PreguntaService preguntaService;
	
	@RequestMapping (value="/todos", method = RequestMethod.GET)
	public List<Pregunta> getList(){
		List<Pregunta> address = preguntaService.findAll();
		return address;
	}
	
	@RequestMapping (value="", method = RequestMethod.DELETE)
	public void eliminar(Pregunta entity){
		preguntaService.delete(entity.getId());
	}
	
	@RequestMapping (value="", method = RequestMethod.PUT)
	public Pregunta actualizar(Pregunta entity){
		Pregunta pregunta = preguntaService.save(entity);
		return pregunta;
	}
	
	@RequestMapping (value="", method = RequestMethod.POST)
	public Pregunta guardar(Pregunta entity){
		Pregunta pregunta = preguntaService.save(entity);
	return pregunta;
		
	}
}