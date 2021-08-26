package com.rtejos.seguridadbase.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.rtejos.seguridadbase.models.User;
import com.rtejos.seguridadbase.repositories.RoleRepository;
import com.rtejos.seguridadbase.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepo;
	RoleRepository rolRepo;
	BCryptPasswordEncoder bCryptPasswordEncoder;
	
	
	public void saveWithUserRole(User user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        user.setRoles(rolRepo.findByName("ROLE_USER"));
        userRepo.save(user);
    }
     
     
    public void saveUserWithAdminRole(User user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        user.setRoles(rolRepo.findByName("ROLE_ADMIN"));
        userRepo.save(user);
    }    
    
    
    public User findByUsername(String username) {
        return userRepo.findByUsername(username);
    }
	
}
