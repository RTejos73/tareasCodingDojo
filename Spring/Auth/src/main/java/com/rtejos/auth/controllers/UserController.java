package com.rtejos.auth.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.validation.Valid;

import com.rtejos.auth.models.User;

@Controller
public class UserController {
    
    @RequestMapping("/registration")
    public String registerForm(@Valid @ModelAttribute("user") User user) {
        return "registrationPage.jsp";
    }
    
    @RequestMapping("/login")
    public String login() {
        return "loginPage.jsp";
    }
}