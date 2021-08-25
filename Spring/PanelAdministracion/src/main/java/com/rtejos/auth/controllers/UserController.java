package com.rtejos.auth.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.security.Principal;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import com.rtejos.auth.models.User;
import com.rtejos.auth.services.UserService;
import com.rtejos.auth.validator.UserValidator;

@Controller
public class UserController {
	
	private UserService userService;
	private UserValidator userValidator;
    
    public UserController(UserService userService,UserValidator userValidator) {
        this.userService = userService;
        this.userValidator = userValidator;
    }
	
    
    @GetMapping("/registration")
    public String registerForm(@Valid @ModelAttribute("user") User user) {
        return "loginRegister.jsp";
    }
    
    @PostMapping("/registration")
    public String registration(@Valid @ModelAttribute("user") User user, BindingResult result, Model model, HttpSession session) {
    	userValidator.validate(user, result);
        if (result.hasErrors()) {
            return "loginRegister.jsp";
        }
      //  userService.saveWithUserRole(user);
        userService.saveWithUserRole(user);
        return "redirect:/registration";
    }
    
    @RequestMapping("/admin")
    public String adminPage(Principal principal, Model model) {
        String email = principal.getName();
        model.addAttribute("currentUser", userService.findByEmail(email));
        return "adminPage.jsp";
    }
    
    
	/*
	 * @RequestMapping("/login") public String login() { return "loginPage.jsp"; }
	 */
    @PostMapping("/login")
    public String login(@RequestParam(value="error", required=false) String error, @RequestParam(value="logout", required=false) String logout, Model model) {
        if(error != null) {
            model.addAttribute("errorMessage", "Invalid Credentials, Please try again.");
        }
        if(logout != null) {
            model.addAttribute("logoutMessage", "Logout Successful!");
        }
        return "loginRegister.jsp";
    }
    
    
    
    @RequestMapping(value = {"/", "/home"})
    public String home(Principal principal, Model model) {
        // 1
        String username = principal.getName();
        model.addAttribute("currentUser", userService.findByEmail(username));
        return "homePage.jsp";
    }
    
    
    
}