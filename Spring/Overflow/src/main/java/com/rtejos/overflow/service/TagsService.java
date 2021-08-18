package com.rtejos.overflow.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rtejos.overflow.models.Tags;
import com.rtejos.overflow.repository.TagsRepository;

@Service
public class TagsService {

	@Autowired
	TagsRepository tagsRepo;

	
	public Tags findBySubject(String subject) {
		return tagsRepo.findBySubject(subject);
	}

	
	public Tags save(Tags tags) {
		return tagsRepo.save(tags);
	}
}

