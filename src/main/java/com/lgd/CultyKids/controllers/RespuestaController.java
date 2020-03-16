package com.lgd.CultyKids.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lgd.CultyKids.models.entities.Nivel;
import com.lgd.CultyKids.models.entities.Respuesta;
import com.lgd.CultyKids.models.services.RespuestaService;

@RestController
@RequestMapping("/respuesta")
public class RespuestaController {

	@Autowired
	private RespuestaService respuestaService;
	
	@RequestMapping (value="/respuestas", method = RequestMethod.GET)
	public List<Respuesta> getList(){
		List<Respuesta> address = respuestaService.findAll();
		return address;	
	}
	
	@RequestMapping(value="/respuestas/respuesta_id/resultado/", method = RequestMethod.GET)
	public Respuesta obtenerPorId(@PathVariable("id") Long id){
	java.util.Optional<Respuesta> address = respuestaService.findById(id);
	return address.get();
	}
	
	@RequestMapping (value="", method = RequestMethod.DELETE)
	public void eliminar(Respuesta entity){
		respuestaService.delete(entity.getId());
	}
	
	@RequestMapping (value="", method = RequestMethod.PUT)
	public Respuesta actualizar(Respuesta entity){
		Respuesta respuesta = respuestaService.save(entity);
		return respuesta;
	}
	
	@RequestMapping (value="", method = RequestMethod.POST)
	public Respuesta guardar(Respuesta entity){
		Respuesta respuesta = respuestaService.save(entity);
	return respuesta;
		
	}
}	
