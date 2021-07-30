package com.rtejos.encuesta.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Encuesta {
	
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	
	
	@RequestMapping(value="/crear", method=RequestMethod.POST)
	public String resultado(@RequestParam(value="nombre") String elNombre,
							@RequestParam(value="location") String laLocacion,
							@RequestParam(value="lenguaje") String elLenguaje,
							@RequestParam(value="comentario", required=false, defaultValue = "") String elComentario, Model model) {
		
		model.addAttribute("nombre", elNombre);
		model.addAttribute("locacion", laLocacion);
		model.addAttribute("lenguaje", elLenguaje);
		model.addAttribute("comentario", elComentario);
		
		return "resultado.jsp";
	}
	
	
}
