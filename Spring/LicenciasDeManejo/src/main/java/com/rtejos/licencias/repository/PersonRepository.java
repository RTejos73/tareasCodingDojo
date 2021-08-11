package com.rtejos.licencias.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rtejos.licencias.models.Person;

@Repository
public interface PersonRepository extends CrudRepository<Person, Long> {
	

}
