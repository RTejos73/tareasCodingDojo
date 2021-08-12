package com.rtejos.listaestudiantes.service;

import org.springframework.stereotype.Service;

import com.rtejos.listaestudiantes.repository.ContactsRepository;

@Service
public class StudentService {
	
	private final ContactsRepository contactRepo;

	public StudentService(ContactsRepository contactRepo) {
		this.contactRepo = contactRepo;
	}
	
	
	
	

}
