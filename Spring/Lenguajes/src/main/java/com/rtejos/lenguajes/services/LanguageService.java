package com.rtejos.lenguajes.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.rtejos.lenguajes.models.Lenguajes;
import com.rtejos.lenguajes.repositories.LanguageRepository;

@Service
public class LanguageService {
	
	private final LanguageRepository languageRepository;

	public LanguageService(LanguageRepository languageRepository) {
		this.languageRepository = languageRepository;
	}
	
	public List<Lenguajes> allLanguage() {
		return languageRepository.findAll();
	}

	public Lenguajes createLanguage(Lenguajes lenguaje) {
		return languageRepository.save(lenguaje);
	}

	public Lenguajes buscaLenguaje(Long id) {
		Optional<Lenguajes> optionalLenguaje = languageRepository.findById(id);
		if(optionalLenguaje.isPresent()) {
			return optionalLenguaje.get();
		}else {
			return null;
		}
	}

	public void eliminarLenguaje(Long id) {
		Optional<Lenguajes> optionalLenguaje = languageRepository.findById(id);
		if(optionalLenguaje.isPresent()) {
			languageRepository.deleteById(id);
		}
	}
	
	public Lenguajes muestraLenguaje(Long id) {
		Optional<Lenguajes> optionalLenguaje = languageRepository.findById(id);
		if(optionalLenguaje.isPresent()) {
			return optionalLenguaje.get();
		}else {
			return null;
		}
	}
	
	public Lenguajes updateLanguage(Lenguajes lenguaje) {
		languageRepository.save(lenguaje);
		return null;
	}
	
	

}
