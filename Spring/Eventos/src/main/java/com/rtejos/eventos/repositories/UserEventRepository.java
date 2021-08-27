package com.rtejos.eventos.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rtejos.eventos.models.UserEvent;

@Repository
public interface UserEventRepository extends CrudRepository<UserEvent, Long>{

}
