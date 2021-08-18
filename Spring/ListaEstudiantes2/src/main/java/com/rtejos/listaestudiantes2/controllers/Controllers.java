package com.rtejos.listaestudiantes2.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.rtejos.listaestudiantes2.models.Bedroom;
import com.rtejos.listaestudiantes2.models.Contact;
import com.rtejos.listaestudiantes2.models.Student;
import com.rtejos.listaestudiantes2.service.ApiService;

@Controller
public class Controllers {
	
	private final ApiService apiService;

	public Controllers (ApiService apiService) {
		this.apiService = apiService;
	}
	
	@GetMapping("/creaEstudiante")
	public String creaStudent(@ModelAttribute("newStudent") Student s, BindingResult result) {
		return "students.jsp";
	}
	
	@GetMapping("/creaContacto")
	public String creaContacto(@ModelAttribute("newContact") Contact c, BindingResult result, Model model) {
		List<Student> estudiantes = apiService.todosLosEstudiantes();
		Contact contacto = new Contact();
		model.addAttribute("listStudents", estudiantes);
		model.addAttribute("Contacto", contacto);
		return "contacts.jsp";
	}
	
		
	@GetMapping("/students/create")
	public String index(@RequestParam(value="firstName") String firstName,
						@RequestParam(value="lastName") String lastName,
						@RequestParam(value="age") byte age)  {
		
		Student studiante = new Student(firstName, lastName, age);
		
		apiService.creaEstudiante(studiante);
		return "redirect:/students";
	}
	
	@PostMapping("/students/create")
	public String index2(@RequestParam(value="firstName") String firstName,
						@RequestParam(value="lastName") String lastName,
						@RequestParam(value="age") byte age)  {
		
		Student studiante = new Student(firstName, lastName, age);
		
		apiService.creaEstudiante(studiante);
		return "redirect:/students";
	}
	
	
	
	@GetMapping("/contacts/create")
	public String index2(@RequestParam("student_id") Long idStudent, @RequestParam("address") String address,
						 @RequestParam("city") String city, @RequestParam("state") String state) {
		
		Student buscarEstudiantePorId = apiService.searchStudentById(idStudent);
		Contact contacto = new Contact(address, city, state,buscarEstudiantePorId);		
		apiService.creaContacto(contacto);	
		return "redirect:/students";		
	}
	
	
	
	@PostMapping("/contacts/create")
	public String creaContacto(@RequestParam("student") Student s, @RequestParam("address") String address,
								@RequestParam("city") String city, @RequestParam("state") String state) {
		
			
			Contact contacto = new Contact(address, city, state, s);		
			apiService.creaContacto(contacto);	
			return "redirect:/students";
		
				
	}
	
	
	
	
	
	
	@GetMapping("/students")
	public String listado(Model model) {
		List<Student> listadoEstudiantes = apiService.todosLosEstudiantes();		
		model.addAttribute("listado", listadoEstudiantes);
		return "listaEstudiantes.jsp";		
	}
	
	@GetMapping("/dorms/create")
	public String createDorms(@RequestParam(value = "name") String name, Model model) {
		Bedroom bedroom = new Bedroom();
		bedroom.setName(name);
		apiService.creaBedroom(bedroom);
		return "redirect:/students";
	}
	
	
	
	
	@GetMapping("/dorms/{id}/add")
	public String creaDormitorio(@PathVariable("id") Long idBedroom,
						  @RequestParam("student") Long idStudent, Model model) {
		
		Student buscarEstudiantePorId = apiService.searchStudentById(idStudent);
		Bedroom dormitorio = apiService.searchBedroomByhId(idBedroom);
		buscarEstudiantePorId.setBedroom(dormitorio);
		apiService.creaEstudiante(buscarEstudiantePorId);
		return "redirect:/students";
	}
	
	
	@GetMapping("/dorms/{id}/remove")
	public String borraDormitorio(@PathVariable("id") Long idBedroom,
						  @RequestParam("student") Long idStudent, Model model) {
		
		Student buscarEstudiantePorId = apiService.searchStudentById(idStudent);
		buscarEstudiantePorId.setBedroom(null);
		apiService.creaEstudiante(buscarEstudiantePorId);
		return "redirect:/students";
	}
	
	
	@GetMapping("/dorms/{id}")
	public String muestraDormitorio(@PathVariable(value="id") Long idDorm,	Model model) {

		List<Student> studentsFromDorm = apiService.todosLosEstudiantesPorDormitorio(idDorm);
		model.addAttribute("studentsFromDorm", studentsFromDorm);
		return "DormitoryDetail.jsp";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
