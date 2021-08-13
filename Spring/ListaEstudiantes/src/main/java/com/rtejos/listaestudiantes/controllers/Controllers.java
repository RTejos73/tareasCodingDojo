package com.rtejos.listaestudiantes.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import com.rtejos.listaestudiantes.models.Contact;
import com.rtejos.listaestudiantes.models.Student;
import com.rtejos.listaestudiantes.service.ApiService;

@Controller
public class Controllers {
	
	private final ApiService apiService;

	public Controllers (ApiService apiService) {
		this.apiService = apiService;
	}
	
	
	@GetMapping("/students/create")
	public String creaStudent(@ModelAttribute("newStudent") Student s, BindingResult result) {
		return "students.jsp";
	}
	
	@GetMapping("/contacts/create")
	public String creaContact(@ModelAttribute("newContact") Student s, BindingResult result, Model m) {
		List<Student> listadoEstudiantes = apiService.todosLosEstudiantes();
		m.addAttribute("listaStudents", listadoEstudiantes);
		return "contacts.jsp";
	}
	
	
	@PostMapping("/students/create")
	public String index(@ModelAttribute("newStudent") Student s, BindingResult result,
			@RequestParam(value="firstName") String firstName,
						@RequestParam(value="lastName") String lastName,
						@RequestParam(value="age") byte age)  {
		
		Student studiante = new Student(firstName, lastName, age);
		
		apiService.creaEstudiante(studiante);
		return "redirect:/students";
	}
	
	@PostMapping("/contacts/create")
	public String index2(@RequestParam("id") Long idStudent, @RequestParam("address") String address,
						 @RequestParam("city") String city, @RequestParam("state") String state) {
		
		Student buscarEstudiantePorId = apiService.searchStudentById(idStudent);
		
		
		
		Contact contacto = new Contact(address, city, state,buscarEstudiantePorId);
		
		apiService.creaContacto(contacto);
	
		return "redirect:/students";
		
	}
	
	
	@RequestMapping("/students")
	public String listado(Model model) {
		List<Student> listadoEstudiantes = apiService.todosLosEstudiantes();		
		model.addAttribute("listado", listadoEstudiantes);
		return "listaEstudiantes.jsp";
		
	}
	

}
