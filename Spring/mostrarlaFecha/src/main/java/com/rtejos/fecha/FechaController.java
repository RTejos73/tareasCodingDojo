package com.rtejos.fecha;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class FechaController {
	
	@RequestMapping("/")
	public String home() {
		return "index.jsp";
	}
	
	@RequestMapping("/date")
	public String laFecha(Model model) {
		Date fecha = new Date();
		SimpleDateFormat formato = new SimpleDateFormat("EEEEEEE, 'the ' d ' of ' MMMM, yyyy");
		String lagranfecha = formato.format(fecha).toString();
		model.addAttribute("fechaDate", lagranfecha);
		return "dateTemplate.jsp";
	}
	
	@RequestMapping("/time")
	public String elTiempo(Model model) {
		Date fecha = new Date();
		SimpleDateFormat formato = new SimpleDateFormat("HH:mm a");	
		String lagranfecha = formato.format(fecha).toString();
		model.addAttribute("fechaTime", lagranfecha);
		return "timeTemplate.jsp";
	}
	
}

