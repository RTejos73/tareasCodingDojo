package com.rtejos.lenguajes.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.rtejos.lenguajes.models.Lenguajes;
import com.rtejos.lenguajes.services.LanguageService;

@Controller
public class LanguageController {
	
	private final LanguageService languageService;
	
	
	
	
	public LanguageController(LanguageService languageService) {
		super();
		this.languageService = languageService;
	}

	
	@GetMapping("/languages")
	public String home (Model model) {
		List<Lenguajes> lenguaje = languageService.allLanguage();
		model.addAttribute("lenguajes", lenguaje);
		return "/lenguajes/index.jsp";
	}
	
	
	@PostMapping(value="/languages")
	public String creaLenguaje(@Valid @ModelAttribute("lenguages") Lenguajes lenguaje, BindingResult result) {
		
		if(result.hasErrors()) {
			return "lenguajes/index.jsp";
		} else {
			languageService.createLanguage(lenguaje);
			return "redirect:/languages";
		}
	}
	

	
	
	
	@GetMapping("/languages/{id}/edit")
	public String editaGraba(@Valid @ModelAttribute("lenguaje") Lenguajes lenguaje, BindingResult result,
							 @PathVariable("id") Long id, Model model) {
		
		if (result.hasErrors()) {
            return "/language/index.jsp";
		} else {
        	Lenguajes lenguajes = languageService.buscaLenguaje(id);
            model.addAttribute("lenguajes", lenguajes);
            return "/lenguajes/edit.jsp";
		}	
	}
	
	
	@RequestMapping(value="/languages/{id}", method=RequestMethod.DELETE)
	public String eliminaLenguaje(@PathVariable("id") Long id) {
		languageService.eliminarLenguaje(id);
		return "redirect:/languages";
	}
	
	
	@GetMapping(value="/languages/{id}")
	public String muestraLenguaje(@PathVariable("id") Long id, Model model) {
		Lenguajes lenguajes = languageService.buscaLenguaje(id);
        model.addAttribute("lenguajes", lenguajes);
        return "/lenguajes/show.jsp";
	}
	
	@PutMapping(value="/languages/{id}")
	public String grabaLenguaje(@Valid @ModelAttribute("lenguaje") Lenguajes lenguaje, BindingResult result ) {
		if(result.hasErrors()) {
			return "lenguajes/edit.jsp";
		}else  {
			languageService.updateLanguage(lenguaje);
			return "redirect:/languages";
		}
		
		
	}
	
	

}
