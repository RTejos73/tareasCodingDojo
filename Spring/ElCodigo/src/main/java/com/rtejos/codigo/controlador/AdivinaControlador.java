package com.rtejos.codigo.controlador;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/")
public class AdivinaControlador {
	
	@RequestMapping("/")
	public String inicio(Model model) {		
		return "index.jsp";
	}
	
		@RequestMapping("/errorCodigo")
	public String error3(RedirectAttributes redirecA) {
		redirecA.addFlashAttribute("error", "sigue entrenando mas duro");
			
		return "redirect:/";
	}
	
	@RequestMapping(value="/validaCodigo", method=RequestMethod.POST) 
	public String index(@RequestParam(value="codigo") String codigo, Model model) {
		if(codigo.equalsIgnoreCase("bushido")) {
			return "redirect:/dashboard";
		}else {
			return "redirect:/errorCodigo";
		}
	}
	
	@RequestMapping("/dashboard")
	public String dashboard(Model model) {
		List<String> dataDashboard = new ArrayList<String>();
		dataDashboard.add("Loyalty");
		dataDashboard.add("Courage");
		dataDashboard.add("Veracity");
		dataDashboard.add("Compassion");
		dataDashboard.add("Honor");
		model.addAttribute("data",dataDashboard);
		
		return "codigo.jsp";
	}
	
	
	

}
