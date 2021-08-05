package com.rtejos.relationships.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class relController {
	
	
	@RequestMapping("/persons/new")
	public String muestraPersonas() {
		
		
		return "/person.jsp";
	}

}
