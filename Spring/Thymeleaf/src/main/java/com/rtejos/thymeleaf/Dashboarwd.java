package com.rtejos.thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Dashboarwd {
	
	@RequestMapping("/pagina1")
	public String index1() {
		
		return "twofour";
	}
	
	@RequestMapping("/pagina2")
	public String index2() {
		
		return "twotwo";
	}
	
	
}
