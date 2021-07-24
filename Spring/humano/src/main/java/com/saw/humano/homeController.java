package com.saw.humano;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class homeController {
	
	@RequestMapping("/")
	public String index(@RequestParam(value="nombre", required=false) String parametroNombre, 
						@RequestParam(value="apellido", required=false) String parametroApellido) {
		if(parametroNombre == null && parametroApellido == null) {
			return "Hola Humano!";
		}else if(parametroNombre != null && parametroApellido != null ) {
			return "Hola " + parametroNombre + " " + parametroApellido;
		} else if (parametroNombre != null && parametroApellido == null) {
			return "Hola " + parametroNombre;					
		} else  {
			return "Hola " + parametroApellido;
		} 
	}	
}
