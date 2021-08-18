package com.rtejos.overflow.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rtejos.overflow.models.Answers;
import com.rtejos.overflow.models.Questions;
import com.rtejos.overflow.repository.AnswersRepository;

@Service
public class AnswersService {

	@Autowired
	AnswersRepository answersRepo;

	
	
	public List<Answers> findAllByQuestions(Questions question) {
		return answersRepo.findAllByQuestions(question);
	}

	
	
	public void save(Answers answers) {
		answersRepo.save(answers);
	}
}