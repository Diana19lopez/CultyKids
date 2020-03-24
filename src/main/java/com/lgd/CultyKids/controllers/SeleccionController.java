package com.lgd.CultyKids.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lgd.CultyKids.models.entities.Seleccion;
import com.lgd.CultyKids.models.services.SeleccionService;

@RestController
@RequestMapping("/cultyKids/seleccion")
public class SeleccionController {

	@Autowired
	private SeleccionService seleccionService;
	
	@RequestMapping (value="", method = RequestMethod.GET)
	public List<Seleccion> getList(){
		List<Seleccion> address = seleccionService.findAll();
		return address;
	}
	
	@RequestMapping(value="/{id}", method = RequestMethod.GET)
	public Seleccion obtenerPorId(@PathVariable("id") Long id){
			Optional<Seleccion> address = seleccionService.findById(id);
	return address.get();
	}
	
	@RequestMapping (value="/{id}", method = RequestMethod.DELETE)
	public void deleteById(@PathVariable ("id") Long id){
		seleccionService.delete(id);
	}
	
	@RequestMapping (value="", method = RequestMethod.PUT)
	public Seleccion actualizar(Seleccion entity){
		Seleccion selec = seleccionService.save(entity);
		return selec;
	}
	
	@RequestMapping (value="", method = RequestMethod.POST)
	public Seleccion guardar(@RequestBody Seleccion seleccion){
		Seleccion selec = seleccionService.save(seleccion);
	return selec;
		
	}
}


