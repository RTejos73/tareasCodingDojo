package com.rtejos.lenguajes.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rtejos.lenguajes.models.Lenguajes;
import com.rtejos.lenguajes.services.LanguageService;

@RestController
public class LanguageApi {
	
	private final LanguageService languageService;

	public LanguageApi(LanguageService languageService) {
		this.languageService = languageService;
	}
	
	//lista todos los lenguajes
	@RequestMapping(value="/api/language", method=RequestMethod.GET)
	public List<Lenguajes> listar() {
		return languageService.allLanguage();
	}
	
	
	
	//crea un libro
	@RequestMapping(value="/api/language", method=RequestMethod.POST)
	public Lenguajes crear(@RequestParam(value="name") String name,
						   @RequestParam(value="creator") String creator,
						   @RequestParam(value="currentVersion") Double cVersion) {
		Lenguajes lenguaje = new Lenguajes(name,creator,cVersion);
		return languageService.createLanguage(lenguaje);
		
	}
	
	

}
