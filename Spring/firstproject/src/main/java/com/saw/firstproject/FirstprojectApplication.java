package com.saw.firstproject;

import javax.servlet.http.HttpSession;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class FirstprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstprojectApplication.class, args);
	}
	
	@RequestMapping("/")
	public String hello() {
		return "Hello World";
	}
	
	
	public void index(HttpSession session) {
		session.setAttribute("count", 1);
		Integer count = (Integer) session.getAttribute("count");
	}
	

}
