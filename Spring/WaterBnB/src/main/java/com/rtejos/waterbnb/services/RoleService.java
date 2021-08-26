package com.rtejos.waterbnb.services;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rtejos.waterbnb.models.Role;
import com.rtejos.waterbnb.repositories.RoleRepository;

@Service
public class RoleService{

    @Autowired
    RoleRepository roleRepository;

    public List<Role> getRoles(){
        return (List<Role>) roleRepository.findAll();
    }
}