package com.rtejos.eventos.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rtejos.eventos.models.Message;

@Repository
public interface MessageRepository  extends CrudRepository <Message, Long>{

}
