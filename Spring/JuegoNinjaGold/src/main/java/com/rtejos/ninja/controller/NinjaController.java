package com.rtejos.ninja.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NinjaController {
	
	public static int aleatorio;
	public static boolean estado = true;
	
	public ArrayList<String> actividades  = new ArrayList<String>();
	
	
	
	@GetMapping("/")
	public String index(HttpSession session, Model model) {
		
		if(session.getAttribute("gold") == null) {
			session.setAttribute("gold", 0);
		}
		int vida = (int) session.getAttribute("gold");
		if(vida < -20) {
			model.addAttribute("gold", vida);
			return "calaboso";
		}else {
			model.addAttribute("activitie", actividades);
			model.addAttribute("estado", estado);
			return "ninja";
		}
	}
	

	@RequestMapping("/farm/{minimo}/{maximo}")
	public String farm(@PathVariable("minimo") Integer min, @PathVariable("maximo") Integer max, HttpSession session) {
		int gold = (int) session.getAttribute("gold");
		aleatorio = Aleatorio(min,max);
		Date fecha = new Date();
		SimpleDateFormat formato = new SimpleDateFormat("EEEEEEE, 'the ' d ' of ' MMMM, yyyy  HH:mm:ss aaa");	
		String lagranfecha = formato.format(fecha).toString();
		String texto = "You entered a farm and earned " + aleatorio + ".  (" + lagranfecha + ")";
		gold += aleatorio;
		session.setAttribute("gold", gold);
		estado = true;
		actividades.add(texto);
		return "redirect:/";
	}
	
	@RequestMapping("/cave/{minimo}/{maximo}")
	public String cave(@PathVariable("minimo") Integer min, @PathVariable("maximo") Integer max, HttpSession session) {
		int gold = (int) session.getAttribute("gold");
		aleatorio = Aleatorio(min,max);
		Date fecha = new Date();
		SimpleDateFormat formato = new SimpleDateFormat("EEEEEEE, 'the ' d ' of ' MMMM, yyyy  HH:mm:ss aaa");
		String lagranfecha = formato.format(fecha).toString();
		String texto = "You entered a cave and earned " + aleatorio + ".  (" + lagranfecha + ")";
		gold += aleatorio;
		session.setAttribute("gold", gold);
		estado = true;
		actividades.add(texto);
		return "redirect:/";
	}
	
	@RequestMapping("/house/{minimo}/{maximo}")
	public String house(@PathVariable("minimo") Integer min, @PathVariable("maximo") Integer max, HttpSession session) {
		int gold = (int) session.getAttribute("gold");
		aleatorio = Aleatorio(min,max);
		Date fecha = new Date();
		SimpleDateFormat formato = new SimpleDateFormat("EEEEEEE, 'the ' d ' of ' MMMM, yyyy  HH:mm:ss aaa");
		String lagranfecha = formato.format(fecha).toString();
		String texto = "You entered a house and earned " + aleatorio + ".  (" + lagranfecha + ")";
		gold += aleatorio;
		session.setAttribute("gold", gold);
		estado=true;
		actividades.add(texto);
		return "redirect:/";
	}
	
	@RequestMapping("/casino/{minimo}/{maximo}")
	public String casino(@PathVariable("minimo") Integer min, @PathVariable("maximo") Integer max, HttpSession session) {
		int gold = (int) session.getAttribute("gold");
		aleatorio = Aleatorio(min,max);
		Date fecha = new Date();
		SimpleDateFormat formato = new SimpleDateFormat("EEEEEEE, 'the ' d ' of ' MMMM, yyyy  HH:mm:ss aaa");
		String lagranfecha = formato.format(fecha).toString();
		String texto = "You entered a casino and ";
		if(aleatorio >= 0 ) {
			texto += " earned " + aleatorio + ".  (" + lagranfecha + ")";
		} else {
			texto += " lost " + aleatorio + ".  (" + lagranfecha + ")";
			estado = false;
		}
		gold += aleatorio;
		session.setAttribute("gold", gold);
		actividades.add(texto);
		return "redirect:/";
	}
	
	@RequestMapping("/spa/{minimo}/{maximo}")
	public String spa(@PathVariable("minimo") Integer min, @PathVariable("maximo") Integer max, HttpSession session) {
		int gold = (int) session.getAttribute("gold");
		aleatorio = Aleatorio(min,max);
		Date fecha = new Date();
		SimpleDateFormat formato = new SimpleDateFormat("EEEEEEE, 'the ' d ' of ' MMMM, yyyy  HH:mm:ss aaa");
		String lagranfecha = formato.format(fecha).toString();
		String texto = "You entered a house and earned " + aleatorio + ".  (" + lagranfecha + ")";
		gold += aleatorio;
		session.setAttribute("gold", gold);
		estado = true;
		actividades.add(texto);
		return "redirect:/";
	}
	
	
	@RequestMapping("/reinicio")
	public String reinicio(HttpSession session) {
		session.setAttribute("gold", 0);
		actividades.clear();
		return "redirect:/";
	}
	
	
	
	
	public int Aleatorio(Integer minimo, Integer maximo) {
    	int alea2 = (int)Math.floor(Math.random()*(maximo-minimo)+minimo);
    	return	alea2;	
	}


}
