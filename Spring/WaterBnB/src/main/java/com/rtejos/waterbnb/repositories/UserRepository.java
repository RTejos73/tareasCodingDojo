package com.rtejos.waterbnb.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rtejos.waterbnb.models.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{
    User findByEmail(String email);
    User findFirstById(Long id);
}
