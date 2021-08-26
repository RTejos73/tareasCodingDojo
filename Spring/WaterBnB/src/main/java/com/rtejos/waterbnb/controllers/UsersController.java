package com.rtejos.waterbnb.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.rtejos.waterbnb.models.Role;
import com.rtejos.waterbnb.models.User;
import com.rtejos.waterbnb.services.RoleService;
import com.rtejos.waterbnb.services.UserService;
import com.rtejos.waterbnb.validator.UserValidator;

@Controller
public class UsersController{
	
	
	@Autowired
    UserService userService;
    UserValidator userValidator;
    RoleService roleService;
    
    
   
    

    @RequestMapping("/guest/signing")
    public String index(@ModelAttribute("user") User user,Model model, BindingResult result) {
    	List<Role> roles = roleService.getRoles();
    	if(!result.hasErrors()){
    		
    		model.addAttribute("roles", roles);
    	}
        return "index.jsp";
    }
    
    
    

    @RequestMapping(value="/registration", method= RequestMethod.POST)
    public String registerUser(@Valid @ModelAttribute("user") User user, BindingResult result, HttpSession session) {
        userValidator.validate(user, result);
        if(result.hasErrors()){
            return "index.jsp";
        }
        user = userService.registerUser(user);
        session.setAttribute("idUser", user.getId());
        return "redirect:/";
    }

    @PostMapping(value="login")
    public String loginUser(@RequestParam("email") String email, @RequestParam("password") String password, Model model, HttpSession session) {
        if(userService.authenticateUser(email,password)){
            User user = userService.findByEmail(email);
            session.setAttribute("idUser", user.getId());
            if(user.getRole().getId() == Role.HOST){
                return "redirect:host/dashboard";
            }
            return "redirect:/";
        }
        return "index.jsp";
    }

    @RequestMapping("/home")
    public String home(HttpSession session, Model model) {
        if(session.getAttribute("idUser") != null){
            User usuario = userService.findUserById(Long.parseLong(session.getAttribute("idUser").toString()));
            model.addAttribute("user",usuario);
            return "home.jsp";
        }
        return "redirect:/";
    }

    @RequestMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/";
    }
}
   
