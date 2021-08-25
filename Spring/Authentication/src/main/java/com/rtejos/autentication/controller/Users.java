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
import com.rtejos.autentication.validator.UserValidator;

@Controller
public class Users {
	
	private final UserService userService;	
	private final UserValidator userValidator;
	
	public Users(UserService userService, UserValidator userValidator) {
        this.userService = userService;
        this.userValidator = userValidator;
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
    public String registerUser(@Valid @ModelAttribute("user") User user, BindingResult result, HttpSession session) {
        userValidator.validate(user, result);
        if(result.hasErrors()) {
            return "registrationPage.jsp";
        }
        User u = userService.registerUser(user);
        session.setAttribute("userId", u.getId());
        return "redirect:/home";
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
    	session.invalidate();
    	return "loginPage.jsp";
    	
    }

}
