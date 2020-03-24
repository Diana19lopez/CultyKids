package com.lgd.CultyKids.controllers;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lgd.CultyKids.models.entities.PuntajeFinal;
import com.lgd.CultyKids.models.services.PuntajefinalService;


@Component
@RestController
@RequestMapping("/cultyKids/puntajefinal")
public class PuntajefinalController {

	@Autowired
	private PuntajefinalService puntajefinalService;
	
	@RequestMapping (value="", method = RequestMethod.GET)
	public List<PuntajeFinal> getList(){
		List<PuntajeFinal> address =  puntajefinalService.findAll();
		return address;
	}
	
	@RequestMapping(value="/{id}", method = RequestMethod.GET)
	public  PuntajeFinal obtenerPorId(@PathVariable("id") Long id){
	        Optional< PuntajeFinal> address =  puntajefinalService.findById(id);
	return address.get();
	}

	
	@RequestMapping (value="/{id}", method = RequestMethod.DELETE)
	public void deleteById(@PathVariable ("id")Long id){
		 puntajefinalService.delete(id);
	}
	
	@RequestMapping (value="", method = RequestMethod.PUT)
	public  PuntajeFinal actualizar( PuntajeFinal entity){
		 PuntajeFinal  pf =  puntajefinalService.save(entity);
		return  pf;
	}
	
	@RequestMapping (value="", method = RequestMethod.POST)
	public  PuntajeFinal guardar(@RequestBody  PuntajeFinal  puntajefinal){
		 PuntajeFinal pf =  puntajefinalService.save(puntajefinal);
	return pf;
		
	}
}