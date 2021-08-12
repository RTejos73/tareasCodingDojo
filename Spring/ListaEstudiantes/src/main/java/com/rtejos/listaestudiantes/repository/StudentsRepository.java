package com.rtejos.listaestudiantes.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rtejos.listaestudiantes.models.Student;


@Repository
public interface StudentsRepository extends CrudRepository<Student, Long>{

}
