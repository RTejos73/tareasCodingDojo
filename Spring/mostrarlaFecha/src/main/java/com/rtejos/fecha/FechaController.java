package com.rtejos.fecha;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class FechaController {
	
	@RequestMapping("/")
	public String home() {
	//	model.addAttribute("nombre", "Rene Tejos");
		return "index.jsp";
	}
	
	@RequestMapping("/date")
	public String laFecha(Model model) {
		return "dateTemplate.jsp";
	}
	
	@RequestMapping("/time")
	public String elTiempo() {
		return "timeTemplate.jsp";
	}
	
}

