package com.rtejos.seguridadbase.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.rtejos.seguridadbase.models.User;
import com.rtejos.seguridadbase.services.RoleService;
import com.rtejos.seguridadbase.services.UserService;
import com.rtejos.seguridadbase.validator.UserValidator;

import java.security.Principal;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;


@Controller
public class UserController {
	
	@Autowired
	UserService userService;
	@Autowired
	RoleService roleService;
	@Autowired
	UserValidator userValidator;
	
	
	
	
	
	
	@RequestMapping("/registration")
    public String registerForm(@Valid @ModelAttribute("user") User user) {
        return "registrationPage.jsp";
    }
    
	
	@PostMapping("/registration")
    public String registration(@Valid @ModelAttribute("user") User user, BindingResult result, Model model, HttpSession session) {
		
		userValidator.validate(user, result);
        if (result.hasErrors()) {
            return "registrationPage.jsp";
        }
        
        if (roleService.findByName("ROLE_ADMIN").getUsers().size() < 1) {
        	userService.saveUserWithAdminRole(user);
        }else {
        	userService.saveWithUserRole(user);
        }
        return "redirect:/login";
    }
	
	
    
    @RequestMapping("/login")
    public String login(@RequestParam(value="error", required=false) String error, @RequestParam(value="logout", required=false) String logout, Model model) {
        if(error != null) {
            model.addAttribute("errorMessage", "Invalid Credentials, Please try again.");
        }
        if(logout != null) {
            model.addAttribute("logoutMessage", "Logout Successful!");
        }
        return "loginPage.jsp";
    }
    
    
    
    
    
    @RequestMapping(value = {"/", "/home"})
    public String home(Principal principal, Model model) {
       
        String username = principal.getName();
        model.addAttribute("currentUser", userService.findByUsername(username));
        return "homePage.jsp";
    }
    
    
    @RequestMapping("/admin")
    public String adminPage(Principal principal, Model model) {
        String username = principal.getName();
        model.addAttribute("currentUser", userService.findByUsername(username));
        return "adminPage.jsp";
    }
	
}
