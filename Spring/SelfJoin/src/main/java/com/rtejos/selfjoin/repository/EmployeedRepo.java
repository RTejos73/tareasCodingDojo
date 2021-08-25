package com.rtejos.selfjoin.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rtejos.selfjoin.models.Employees;

@Repository
public interface EmployeedRepo extends CrudRepository<Employees, Long> {

	List<Employees> findAll();    	
    
    	

}
