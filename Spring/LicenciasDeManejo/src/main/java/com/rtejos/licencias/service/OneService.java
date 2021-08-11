package com.rtejos.licencias.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.rtejos.licencias.models.License;
import com.rtejos.licencias.models.Person;
import com.rtejos.licencias.repository.LicenseRepoJpa;
import com.rtejos.licencias.repository.LicenseRepository;
import com.rtejos.licencias.repository.PersonRepository;

@Service
public class OneService {
	
	private final PersonRepository personRepo;
	private final LicenseRepository licenseRepo;
	private final LicenseRepoJpa licenseRepoJpa;
	
	public OneService(PersonRepository personRepo, LicenseRepository licenseRepo,
					  LicenseRepoJpa licenseRepoJpa) {
		this.personRepo = personRepo;
		this.licenseRepo = licenseRepo;		
		this.licenseRepoJpa = licenseRepoJpa;
	}
	
	
	public Person createPerson(Person p) {
		return personRepo.save(p);
	}
	
	public License creaLicencia(License l) {
		return licenseRepo.save(l);
	}
	
	
	
	
	public Person buscaPersonId(Long id) {
		Optional<Person> optionalP = personRepo.findById(id);
		if(optionalP.isPresent()) {
			return optionalP.get();	
		} else  {
			return null;
		}		
	}
	
	
	public List<Person> listarPersonas() {
		return (List<Person>) personRepo.findAll();
	}
	
	
	public List<License> buscarAllLicense() {
		return licenseRepoJpa.buscaPersonaById();
	}
	
	public License buscaLicenseById(Long id) {
		return licenseRepoJpa.getById(id);
	}
	
	
	public List<License> buscaPersonasPorId(Long id) {
		return  licenseRepoJpa.buscaPersonId(id);
	}
	

}
