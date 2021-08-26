package com.rtejos.dojosyninjas.controllers;


import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.rtejos.dojosyninjas.models.Dojo;
import com.rtejos.dojosyninjas.models.Ninja;
import com.rtejos.dojosyninjas.services.DojoService;
import com.rtejos.dojosyninjas.services.NinjaService;

@Controller
public class NinjaController {
	
	private final NinjaService ninjaService;
	private final DojoService dojoService;

	public NinjaController(NinjaService ninjaService, DojoService dojoService) {
		this.ninjaService = ninjaService;
		this.dojoService = dojoService;
	}
	
	
	@GetMapping("/ninjas/new")
	public String nuevoNinja(Model model) {		
		List<Dojo> listaDojos = dojoService.listarDojos();
		model.addAttribute("listadojos", listaDojos);
		return "newNinja.jsp";
	}
	
	
	
	@PostMapping("/ninjas/new")
	public String creaNinja(@RequestParam("firstname") String firstName,
							@RequestParam("lastname") String lastName,
							@RequestParam("age") int age,
							@RequestParam("id") Long idDojo) {
		
		Dojo dojo = dojoService.buscadojoId(idDojo);
		
		
		Ninja nuevoNinja = new Ninja(firstName, lastName, age, dojo);
		ninjaService.creaNinja(nuevoNinja);
		
		return "redirect:/dojos/listado";
	}
	
		
	@GetMapping("/dojos/{id}")
	public String listarninjasdojos(@PathVariable("id") Long idDojo, Model model) {
		Dojo dojo = dojoService.buscadojoId(idDojo);
		List<Ninja> ninjas = ninjaService.buscaNinjasPorDojoId(idDojo);		 
		model.addAttribute("ninjasdojo", ninjas);
		model.addAttribute("nombre", dojo);
		return "listaNinjasDojo.jsp";
	} 
	
	
	@RequestMapping("/pages/{pageNumber}")
	public String getNinjasPerPage(Model model, @PathVariable("pageNumber") int pageNumber) {
	    //Tenemos que restar 1 porque las páginas iterables empiezan con índice 0. Esto es para que nuestros enlaces puedan mostrarse desde 1...maxPage(última página) 
	    Page<Ninja> ninjas = ninjaService.ninjasPerPage(pageNumber - 1);
	    
	    //Total número de páginas que tenemos
	    int totalPages = ninjas.getTotalPages();
	    model.addAttribute("totalPages", totalPages);
	   
	    model.addAttribute("ninjasdojo", ninjas);
	    return "listaNinjasDojo.jsp";
	}
	

}