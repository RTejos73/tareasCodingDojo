package com.rtejos.overflow.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rtejos.overflow.models.Questions;
import com.rtejos.overflow.repository.QuestionsRepository;

@Service
public class QuestionsService {
	
	@Autowired
	QuestionsRepository questionsRepo;

	
	
	
	public List<Questions> buscatodos() {
		return questionsRepo.findAll();
	}
	
	
	public Questions save(Questions questions) {
		return questionsRepo.save(questions);
	}
	
	public Questions findById(Long idQuestion) {
		return questionsRepo.findById(idQuestion).orElse(null);
	}

}
