package com.rtejos.overflow.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rtejos.overflow.models.Questions;

@Repository
public interface QuestionsRepository extends CrudRepository<Questions, Long>{

	List<Questions> findAll();
	
	
	
}
