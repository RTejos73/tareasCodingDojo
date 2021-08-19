package com.rtejos.consultasyjoins.controller;




import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rtejos.consultasyjoins.service.ApiService;

@Controller
public class Controlador {
	
	@Autowired
	ApiService apiService;
	
	@RequestMapping("/api/{id}")
	public List<String> buca1(@PathVariable("id") String query) {
		if(query.equals("1")) {
			return apiService.busqueda1();
		} else if(query.equals("2")){
			return apiService.busqueda2();
		} else if(query.equals("3")){
			return apiService.busqueda3();
		} else if(query.equals("4")) {
			return apiService.busqueda4();
		} else if(query.equals("5")){
			return apiService.busqueda5();
		} else if(query.equals("6")){
			return apiService.busqueda6();
		} else if(query.equals("7")){
			return apiService.busqueda7();
		} else if(query.equals("8")){
			return apiService.busqueda8();
		} else {	
			return null;
		}
	}
}
