package com.softwarappweb.CrudSpringBoot.interfaceService;

import java.util.List;
import java.util.Optional;
import com.softwarappweb.CrudSpringBoot.modelo.Persona;

public interface IPersonaService {

	public List<Persona>listar();
	public Optional<Persona>listarId(int id);
	public int save(Persona p);
	public void delte(int id);
	
	
}
