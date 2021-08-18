package com.rtejos.listaestudiantes2.service;

import org.springframework.stereotype.Service;

import com.rtejos.listaestudiantes2.repository.ContactsRepository;

@Service
public class StudentService {
	
	private final ContactsRepository contactRepo;

	public StudentService(ContactsRepository contactRepo) {
		this.contactRepo = contactRepo;
	}
	
	
	
	

}
