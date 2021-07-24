package com.rtejos.cadena;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class CadenasApplication {

	public static void main(String[] args) {
		SpringApplication.run(CadenasApplication.class, args);
	}
	
	
	@RequestMapping("/")
	public String Inicio() {
		return "Hola Amigo, que tal tu dia hoy ??";
	}
	

	@RequestMapping("/random")
	public String random() {
		return "Pagina especial de Random";
	}

}
