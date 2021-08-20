package com.rtejos.autentication.controller;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.rtejos.autentication.models.User;
import com.rtejos.autentication.service.UserService;

@Controller
public class Users {
	
	private final UserService userService;
    
    public Users(UserService userService) {
        this.userService = userService;
    }
    
    
    @RequestMapping("/registration")
    public String registerForm(@ModelAttribute("user") User user) {
        return "registrationPage.jsp";
    }
    @RequestMapping("/login")
    public String login() {
        return "loginPage.jsp";
    }
    
    
    
    @RequestMapping(value="/registration", method=RequestMethod.POST)
    public String registerUser(@Valid @ModelAttribute("user") User user, BindingResult result, HttpSession session, Model model) {
    //si el resultado tiene errores, retornar a la página de registro (no se preocupe por las validaciones por ahora)
    //si no, guarde el usuario en la base de datos, guarde el id del usuario en el objeto Session y redirija a /home
    	
    	if(result.hasErrors()) {
    		return registerForm(user);
    	}else {
    		user = userService.registerUser(user);
    		session.setAttribute("idUsuario", user.getId());
    		return home(session,model);
    	}
    }
    
    
    

    @RequestMapping(value="/login", method=RequestMethod.POST)
    public String loginUser(@RequestParam("email") String email, @RequestParam("password") String password, Model model, HttpSession session) {
    //Si el usuario está autenticado, guarde su id de usuario en el objeto Session
    //sino agregue un mensaje de error y retorne a la página de inicio de sesión.
    	
    	if(userService.authenticateUser(email, password)) {
    		User user = userService.findByEmail(email);
    		session.setAttribute("idUsuario", user.getId());
    		return home(session,model);
    	}else {
    		return "loginPage.jsp?error=true";
    	}
    }
    
    
    
    
    @RequestMapping("/home")
    public String home(HttpSession session, Model model) {
        //Obtener el usuario desde session, guardarlo en el modelo y retornar a la página principal
    	
    	if(session.getAttribute("idUsuario") != null) {
    		User user = userService.findUserById(Long.parseLong(session.getAttribute("idUsuario").toString()));
    		model.addAttribute("user", user);
    		return "homePage.jsp";
    	}else {
    		return login();
    	}
    }
    
    
    
    
    @RequestMapping("/logout")
    public String logout(HttpSession session) {
        // invalidar la sesión
        // redireccionar a la página de inicio de sesión.
    	
    	session.invalidate();
    	return "loginPage.jsp";
    	
    }

}
