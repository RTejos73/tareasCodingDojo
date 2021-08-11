package com.rtejos.licencias.controllers;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.rtejos.licencias.models.License;
import com.rtejos.licencias.models.Person;
import com.rtejos.licencias.service.OneService;

@Controller
public class relController {
	
	private final OneService oneService;
	
	
	public relController(OneService oneService) {
		this.oneService = oneService;
	}


	@GetMapping("/persons/new")
	public String muestraPersonas() {
		
		
		return "/person.jsp";
	}

	
	// crea una nueva Persona
	@PostMapping("/persons/new")
	public String newPerson(@ModelAttribute("newPerson") Person p, BindingResult result,
							@RequestParam("firstName") String firstName,
							@RequestParam("lastName") String lastName) {
		
		Person person = new Person(firstName, lastName);
		
		if(result.hasErrors()) {
			return "person.jsp";
		} else {
			oneService.createPerson(person);
			return "redirect:/persons/new";
		}
	}
	
	
	@GetMapping("/persons/{id}")
	public String ListPerson(@PathVariable("id") Long id, Model model) {
		Person buscapersona = oneService.buscaPersonId(id);
		License licenciaPersona = oneService.buscaLicenseById(id);
		model.addAttribute("persons", buscapersona);
		model.addAttribute("licencia", licenciaPersona);
		return "show.jsp";
	}
	
	
	@GetMapping("/licenses/new")
	public String buscaLicense(Model model) {
		List<Person> personas = oneService.listarPersonas();
		model.addAttribute("lista", personas);
		return "license.jsp";
	}
	
	
	
	
	// crea una nueva Licencia
		@PostMapping("/licenses/new")
		public String newPerson(@ModelAttribute("newLicense") License l, BindingResult result,
								@RequestParam("id") Long idPerson,
								@RequestParam("state") String state,
								@RequestParam("expirateDate") String fechaExpiracion) {
			String number;
			String numero3;
			Date fechaVencimiento = null;
			try {
				DateFormat fecha = new SimpleDateFormat("yyyy-MM-dd");
				fechaVencimiento = fecha.parse(fechaExpiracion);
			} catch  (ParseException e)  {
				System.out.println("Error al convertir la fecha: " + e.getMessage());
			}
			
			List<License> existePersona = oneService.buscaPersonasPorId(idPerson);
			
			if(!existePersona.isEmpty()) {
				
				return "redirect:/licenses/new";
			}else {
						
				List<License> hayRegistro = oneService.buscarAllLicense();
				if(hayRegistro.size() <= 0) {
					number = "000001";
				}else {
					number = hayRegistro.get(0).getNumber();
					int numero2=  Integer.parseInt(number);
					numero2++;
					if(numero2 < 10) {
						numero3 = "00000"+numero2;
					} else if(numero2 >= 10 && numero2 < 100) {
						numero3 = "0000"+numero2;
					} else if(numero2 >= 100 && numero2 < 1000) {
						numero3 = "000"+numero2;
					} else if(numero2 >= 1000 && numero2 < 10000) {
						numero3 = "00"+numero2;
					} else {
						numero3 = "0"+numero2;
					}				
					number = numero3;			
				}
				
				System.out.println("id " + idPerson);
				System.out.println("state " + state);
				System.out.println("number license " + number);
				
				System.out.println("fecha " + fechaVencimiento);
				
				
				
				 Person buscarpersona = oneService.buscaPersonId(idPerson); License
				 nuevaLicencia = new License(number, fechaVencimiento, state, buscarpersona);
				 
				
				if(result.hasErrors()) {
					return "license.jsp";
				} else {
					
					oneService.creaLicencia(nuevaLicencia);
					return "redirect:/licenses/new";
				}
			}
			
			
		}
	
	
	
	
}
