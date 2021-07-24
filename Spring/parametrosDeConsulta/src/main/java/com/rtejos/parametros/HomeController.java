package com.rtejos.parametros;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {	
	
	@RequestMapping("")
	public String index(@RequestParam(value="q", required=false) String parametroBusqueda ) {
		if(parametroBusqueda == null) {
			return "Tu parametro de busqueda fue : Null" ;
		}else {
			return "Tu parametro de busqueda fue : " + parametroBusqueda ;
		}
	}
	
	
	
	@RequestMapping("/{track}/{module}/{lesson}")
	public String showLesson(@PathVariable("track") String track, @PathVariable("module") String module, @PathVariable("lesson") String lesson) {
		
		return "Track : " + track + ", Module : " + module + ", Lesson :" + lesson;
	}
	
	
}
