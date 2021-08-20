package com.rtejos.selfjoin.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rtejos.selfjoin.models.User;

@Repository
public interface UserRepo extends CrudRepository<User, Long> {

	User findOne(Long valueOf);

}
