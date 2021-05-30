package com.softwarappweb.CrudSpringBoot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.softwarappweb.CrudSpringBoot.interfaceService.IPersonaService;
import com.softwarappweb.CrudSpringBoot.interfaces.IPersona;
import com.softwarappweb.CrudSpringBoot.modelo.Persona;

public class PersonaService implements IPersonaService {

	@Autowired
	private IPersona data;
	
	@Override
	public List<Persona> listar() {
		// TODO Auto-generated method stub
		return (List<Persona>)data.findAll();
	}

	@Override
	public Optional<Persona> listarId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int save(Persona p) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delte(int id) {
		// TODO Auto-generated method stub
		
	}

}
