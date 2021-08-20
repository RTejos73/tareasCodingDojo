package com.rtejos.selfjoin.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rtejos.selfjoin.models.User;
import com.rtejos.selfjoin.repository.UserRepo;


@Service
public class UserService  {

	@Autowired
	UserRepo userRepo;
	

	public void friends() {
		User user = userRepo.findOne(Long.valueOf(1));
	    System.out.println(user.getFriends());
	    
	    //Esto imprimirá el nombre del usuario 2 y 3. Todos los usuarios que son amigos de este usuario.  
	    for(User u : user.getFriends()) {
	        System.out.println(u.getFirstName());
	    }
	    
	    // Esto solo imprimirá el nombre del usuario 2.
	    for(User u : user.getUserFriends()) {
	        System.out.println(u.getFirstName());
	    }
	}

	
	
	
}

