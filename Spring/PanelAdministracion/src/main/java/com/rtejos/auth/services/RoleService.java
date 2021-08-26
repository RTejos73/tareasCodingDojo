package com.rtejos.auth.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.rtejos.auth.models.Role;
import com.rtejos.auth.repositories.RoleRepository;

@Service
public class RoleService {
	
	private RoleRepository roleRepository;
	
	public RoleService(RoleRepository roleRepository){
		this.roleRepository = roleRepository;
	}
	
	public List<Role> all(){
		return (List<Role>) roleRepository.findAll();
	}
	
	public Role findByName(String name){
		return (Role) roleRepository.findByName(name);
	}
	
	public void create(Role role){
		roleRepository.save(role);
	}
	public void update(Role role){
		roleRepository.save(role);
	}
	public void destroy(long id){
		roleRepository.deleteById(id);
	}

}
