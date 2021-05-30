package com.softwarappweb.CrudSpringBoot.interfaces;

import org.springframework.data.repository.CrudRepository;

import com.softwarappweb.CrudSpringBoot.modelo.Persona;

public interface IPersona extends CrudRepository<Persona, Integer> {

}
