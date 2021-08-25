package com.rtejos.selfjoin.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rtejos.selfjoin.models.Employees;
import com.rtejos.selfjoin.repository.EmployeedRepo;


@Service
public class EmployeedService  {

	@Autowired
	EmployeedRepo employeedRepo;
	

	public List<Employees> allEmployees() {
		return employeedRepo.findAll();
	}

	public Employees findEmployee(Long id) {
		
		Optional<Employees> optionalEmployee = employeedRepo.findById(id);
		if(optionalEmployee.isPresent()) {
			return optionalEmployee.get();
		} else {
			return null;
		}
	}
	
	
	public Employees saveEmployee(Employees e) {
		return employeedRepo.save(e);
	}
	
	
}

