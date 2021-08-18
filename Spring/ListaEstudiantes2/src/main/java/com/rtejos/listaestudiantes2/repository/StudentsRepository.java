package com.rtejos.listaestudiantes2.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rtejos.listaestudiantes2.models.Bedroom;
import com.rtejos.listaestudiantes2.models.Student;


@Repository
public interface StudentsRepository extends CrudRepository<Student, Long>{
	
	List<Student> findAllByBedroom(Bedroom bedroom);
}
