package com.rtejos.overflow.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rtejos.overflow.models.Answers;
import com.rtejos.overflow.models.Questions;

@Repository
public interface AnswersRepository extends CrudRepository<Answers, Long> {
	
	List<Answers> findAllByQuestions(Questions question);

}