package com.rtejos.listaestudiantes.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.rtejos.listaestudiantes.models.Contact;
import com.rtejos.listaestudiantes.models.Student;
import com.rtejos.listaestudiantes.repository.ContactsRepository;
import com.rtejos.listaestudiantes.repository.StudentsRepository;

@Service
public class ApiService {
	
	
	private final StudentsRepository studentRepo;
	private final ContactsRepository contactRepo;
	
	
	public ApiService(StudentsRepository studentRepo, ContactsRepository contactRepo) {
		this.studentRepo = studentRepo;
		this.contactRepo = contactRepo;
	}




	public Student creaEstudiante(Student s) {
		return studentRepo.save(s);		
	}
	
	public Contact creaContacto(Contact c) {
		return	contactRepo.save(c);
	}
	
	public Student searchStudentById(Long id) {
		Optional<Student> optionalS = studentRepo.findById(id);
		if(optionalS.isPresent()) {
			return optionalS.get();	
		} else  {
			return null;
		}			
	}
	
	
	

}
