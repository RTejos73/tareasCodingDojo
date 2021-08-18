package com.rtejos.listaestudiantes2.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rtejos.listaestudiantes2.models.Bedroom;

@Repository
public interface BedroomRepository extends CrudRepository<Bedroom, Long> {

}
