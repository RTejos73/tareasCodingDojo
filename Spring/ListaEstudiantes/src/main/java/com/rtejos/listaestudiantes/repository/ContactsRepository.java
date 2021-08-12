package com.rtejos.listaestudiantes.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rtejos.listaestudiantes.models.Contact;

@Repository
public interface ContactsRepository extends CrudRepository<Contact, Long> {

}
