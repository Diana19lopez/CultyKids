package com.lgd.CultyKids.controllers;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;




import com.lgd.CultyKids.models.entities.PuntajeFinal;
import com.lgd.CultyKids.models.services.PuntajefinalService;



@RestController
@RequestMapping("/puntajefinal")
public class PuntajefinalController {

	@Autowired
	private PuntajefinalService puntajefinalService;
	
	@RequestMapping (value="/preguntas", method = RequestMethod.GET)
	public List<PuntajeFinal> getList(){
		List<PuntajeFinal> address =  puntajefinalService.findAll();
		return address;
	}
	
	@RequestMapping(value="/preguntas/pregunta_id/respuestas/", method = RequestMethod.GET)
	public  PuntajeFinal obtenerPorId(@PathVariable("id") Long id){
	java.util.Optional< PuntajeFinal> address =  puntajefinalService.findById(id);
	return address.get();
	}

	
	@RequestMapping (value="", method = RequestMethod.DELETE)
	public void eliminar(@PathVariable ("id")Long id){
		 puntajefinalService.delete(id);
	}
	
	@RequestMapping (value="", method = RequestMethod.PUT)
	public  PuntajeFinal actualizar( PuntajeFinal entity){
		 PuntajeFinal  puntajefinal =  puntajefinalService.save(entity);
		return  puntajefinal;
	}
	
	@RequestMapping (value="", method = RequestMethod.POST)
	public  PuntajeFinal guardar(@RequestBody  PuntajeFinal  puntajefinal){
		 PuntajeFinal pregunt =  puntajefinalService.save(puntajefinal);
	return pregunt;
		
	}
}