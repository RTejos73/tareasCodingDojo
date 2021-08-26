package com.rtejos.seguridadbase.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rtejos.seguridadbase.models.Role;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long>{
	
	List<Role> findAll();
    
    List<Role> findByName(String name);
    
    
}
