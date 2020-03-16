package com.lgd.CultyKids.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lgd.CultyKids.models.entities.Lecciones;
import com.lgd.CultyKids.models.services.LeccionesService;

@RestController
@RequestMapping("/lecciones")
public class LeccionesController {

	@Autowired
	private LeccionesService leccionesService;
	
	@RequestMapping (value="/lecciones", method = RequestMethod.GET)
	public List<Lecciones> getList(){
		List<Lecciones> address = leccionesService.findAll();
		return address;
	}
	
	@RequestMapping(value="/lecciones/lecciones_id/desarrollo/", method = RequestMethod.GET)
	public Lecciones obtenerPorId(@PathVariable("id") Long id){
	java.util.Optional<Lecciones> address = leccionesService.findById(id);
	return address.get();
	}
	
	@RequestMapping (value="", method = RequestMethod.PUT)
	public Lecciones actualizar(Lecciones entity){
		Lecciones lecc = leccionesService.save(entity);
		return lecc;
	}
	
	@RequestMapping (value="", method = RequestMethod.POST)
	public Lecciones guardar(Lecciones entity){
		Lecciones lecc = leccionesService.save(entity);
	return lecc;
		
	}
}

