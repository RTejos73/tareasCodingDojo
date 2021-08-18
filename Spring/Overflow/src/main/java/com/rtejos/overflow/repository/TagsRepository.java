package com.rtejos.overflow.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rtejos.overflow.models.Tags;

@Repository
public interface TagsRepository extends CrudRepository<Tags, Long> {

	Tags findBySubject(String subject);
}
