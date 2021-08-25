package com.rtejos.dojosyninjas.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.rtejos.dojosyninjas.models.Dojo;
import com.rtejos.dojosyninjas.services.DojoService;

import java.util.List;

@Controller
public class DojoController {
	
	private final DojoService dojoService;

	public DojoController(DojoService dojoService) {
		this.dojoService = dojoService;
	}
	
	
	@GetMapping("/dojos/new")
	public String nuevoDojo() {		
		return "newDojo.jsp";
	}
	
	@PostMapping("/dojos/new")
	public String creaDojo(@RequestParam(name="name") String name) {		
		Dojo nuevodojo = new Dojo(name);
		dojoService.crearDojo(nuevodojo);		
		return "redirect:/dojos/listado";	
	}
	
	
	@GetMapping("dojos/listado")
	public String listaDojos(Model model) {
		List<Dojo> listaDojos = dojoService.listarDojos();		
		model.addAttribute("listado", listaDojos);
		return "listaDojos.jsp";
	}
	
	
	 
	 

}