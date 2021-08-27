package com.rtejos.eventos.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rtejos.eventos.models.Event;

@Repository
public interface EventRepository  extends CrudRepository <Event, Long>{

}
