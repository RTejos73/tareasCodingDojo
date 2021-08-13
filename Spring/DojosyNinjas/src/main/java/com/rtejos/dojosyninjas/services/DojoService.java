package com.rtejos.dojosyninjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.rtejos.dojosyninjas.models.Dojo;
import com.rtejos.dojosyninjas.repositorys.DojoRepository;

@Service
public class DojoService {
	
	
	private final DojoRepository dojoRepository;

	public DojoService(DojoRepository dojoRepository) {
		super();
		this.dojoRepository = dojoRepository;
	}
	
	
	public Dojo crearDojo(Dojo d) {
		return dojoRepository.save(d);
	}
	
	public List<Dojo> listarDojos() {
		return (List<Dojo>) dojoRepository.findAll();
	}

	public Dojo buscadojoId(Long id) {
		Optional<Dojo> buscadojo = dojoRepository.findById(id);
		if (buscadojo.isPresent()) {
			return buscadojo.get();
		} else {		
			return null;
		}
	}
	
	public List<Dojo> buscarDojos() {
		return (List<Dojo>) dojoRepository.findAll();
	}
	
	
	

}



