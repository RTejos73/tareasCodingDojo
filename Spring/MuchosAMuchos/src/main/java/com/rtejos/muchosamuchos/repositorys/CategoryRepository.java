package com.rtejos.muchosamuchos.repositorys;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rtejos.muchosamuchos.models.Category;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Long> {

	

}
