package com.rtejos.contador;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class Contando {
	
	@RequestMapping("/")
	public String index(HttpSession session) {
		Integer counter = (Integer) session.getAttribute("contador");
		if(counter != null) {
			counter++;
		} else {
			counter = 1;
		}
		session.setAttribute("contador", counter);
		session.setAttribute("origen", "index");
		return "index.jsp";
	}
	
	@RequestMapping("/counter")
	public String counter(HttpSession session, Model model) {
		Integer counter = (Integer) session.getAttribute("contador");
		String modelo = (String) session.getAttribute("origen");
		if(modelo == null) {
			 session.setAttribute("origen", "index");
		} 
		if (counter == null) {
			counter = 0;
		}
		model.addAttribute("contador", counter);		
		return "counter.jsp";
	}
	
	@RequestMapping("/counter2")
	public String counter2(HttpSession session) {
		Integer counter = (Integer) session.getAttribute("contador");
		if(counter != null) {
			counter = counter + 2;
		} else {
			counter = 1;
		}
		session.setAttribute("contador", counter);
		session.setAttribute("origen", "index2");
		return "counter2.jsp";
	}
	
	@RequestMapping("/reinicio")
	public String reinicio(HttpSession session) {
		session.setAttribute("contador", 0);
		
		return "counter.jsp";
	}
	
	
	
}
