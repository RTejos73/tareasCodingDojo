package com.rtejos.listaestudiantes2.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.rtejos.listaestudiantes2.models.Bedroom;
import com.rtejos.listaestudiantes2.models.Contact;
import com.rtejos.listaestudiantes2.models.Student;
import com.rtejos.listaestudiantes2.repository.BedroomRepository;
import com.rtejos.listaestudiantes2.repository.ContactsRepository;
import com.rtejos.listaestudiantes2.repository.StudentsRepository;

@Service
public class ApiService {
	
	
	private final StudentsRepository studentRepo;
	private final ContactsRepository contactRepo;
	private final BedroomRepository bedroomRepo;
	
	
	public ApiService(StudentsRepository studentRepo, ContactsRepository contactRepo, BedroomRepository bedroomRepo) {
		this.studentRepo = studentRepo;
		this.contactRepo = contactRepo;
		this.bedroomRepo = bedroomRepo;
	}

	public Student creaEstudiante(Student s) {
		return studentRepo.save(s);		
	}
	
	public Contact creaContacto(Contact c) {
		return	contactRepo.save(c);
	}
	
	public Bedroom creaBedroom(Bedroom b) {
		return bedroomRepo.save(b);
	}
	
	
	public Student searchStudentById(Long id) {
		return studentRepo.findById(id).orElse(null);
	}
	
	
	public List<Student> todosLosEstudiantes() {
		return (List<Student>) studentRepo.findAll();
	}


	public Bedroom searchBedroomByhId(Long idBedroom) {
		return bedroomRepo.findById(idBedroom).orElse(null);
	}
	
	
	public List<Student> todosLosEstudiantesPorDormitorio(Long idDorm) {
		Bedroom bedroom = new Bedroom();
		bedroom.setId(idDorm);
		return studentRepo.findAllByBedroom(bedroom);
	}

}
