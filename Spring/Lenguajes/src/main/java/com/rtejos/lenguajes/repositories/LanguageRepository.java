package com.rtejos.lenguajes.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rtejos.lenguajes.models.Lenguajes;

@Repository
public interface LanguageRepository  extends CrudRepository<Lenguajes, Long>{
	List<Lenguajes> findAll();
	

}
