package com.lgd.CultyKids.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.lgd.CultyKids.models.entities.Seleccion;
import com.lgd.CultyKids.models.services.SeleccionService;

@RestController
@RequestMapping("/pregunta")
public class SeleccionController {

	@Autowired
	private SeleccionService seleccionService;
	
	@RequestMapping (value="/todos", method = RequestMethod.GET)
	public List<Seleccion> getList(){
		List<Seleccion> address = seleccionService.findAll();
		return address;
	}
	
	@RequestMapping (value="", method = RequestMethod.DELETE)
	public void eliminar(Seleccion entity){
		seleccionService.delete(entity.getId());
	}
	
	@RequestMapping (value="", method = RequestMethod.PUT)
	public Seleccion actualizar(Seleccion entity){
		Seleccion seleccion = seleccionService.save(entity);
		return seleccion;
	}
	
	@RequestMapping (value="", method = RequestMethod.POST)
	public Seleccion guardar(Seleccion entity){
		Seleccion seleccion = seleccionService.save(entity);
	return seleccion;
		
	}
}


