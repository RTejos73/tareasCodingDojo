package com.rtejos.auth.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.security.Principal;
import java.util.List;

import javax.validation.Valid;

import com.rtejos.auth.models.Role;
import com.rtejos.auth.models.User;
import com.rtejos.auth.services.RoleService;
import com.rtejos.auth.services.UserService;
import com.rtejos.auth.validator.UserValidator;

@Controller
public class UserController {
	
	private UserService userService;
	private UserValidator userValidator;
	private RoleService roleService;
    
    public UserController(UserService userService,UserValidator userValidator,RoleService roleService) {
        this.userService = userService;
        this.userValidator = userValidator;
        this.roleService = roleService;
    }
	
    
    
    @RequestMapping(value={"/login","/register"})
	public String login(Model model,@RequestParam(value="error",required=false) String error,@RequestParam(value="logout",required=false) String logout){
		if(error != null){
			model.addAttribute("errorMessage","Invalid Credentials.");
		}
		if(logout != null){
			model.addAttribute("logoutMessage","Logout Successful");
		}
		
		model.addAttribute("user",new User());
		return "loginRegister.jsp";
	}
    
    
    @PostMapping("/registration")
    public String registration(@Valid @ModelAttribute("user") User user, BindingResult result, Model model) {
    	userValidator.validate(user, result);
    	
        if (result.hasErrors()) {
            return "loginRegister.jsp";
        } 
        if (roleService.findByName("ROLE_ADMIN").getUsers().size() < 1) {
    		userService.saveUserWithAdminRole(user);
    		return "redirect:/login";
        } else {
    		userService.saveWithUserRole(user);
    		return "redirect:/dashboard";
        }
    }
    
    
    @RequestMapping(value = {"/dashboard"})
	public String showHome(Principal principal, Model model) {
        String email = principal.getName();
        User user = userService.findByEmail(email);
        model.addAttribute("currentUser", userService.findByEmail(email));
        userService.updateUser(user);
        if(userService.checkIfAdmin(user)) {
        		return "redirect:/admin";
        } else {
        		return "homePage.jsp";
        }
        
	}
    
    @RequestMapping("/admin")
    public String adminPage(Principal principal, Model model) {
        String email = principal.getName();
        model.addAttribute("currentUser", userService.findByEmail(email));
        model.addAttribute("all", userService.getAll());
        return "adminPage.jsp";
    }
    
    
    @RequestMapping("/")
	public String gotoLogin() {
		return "redirect:/login";
	}
    
    
    
    @RequestMapping("/user/delete/{id}")
	public String deleteUser(@PathVariable("id") Long id) {
		userService.deletebyId(id);
		return "redirect:/admin";
		
	}
    
    
    @RequestMapping("/user/admin/{id}")
	public String makeAdmin(@PathVariable("id") Long id) {
		User user = userService.getUserById(id);
		List<Role> roles = user.getRoles();
		roles.add(roleService.findByName("ROLE_ADMIN"));
		userService.updateUser(user);
		return "redirect:/admin";
	}
    
	@RequestMapping("/user/demote/{id}")
	public String demoteAdmin(@PathVariable("id") Long id) {
		User user = userService.getUserById(id);
		List<Role> roles = user.getRoles();
		for(int i = 0; i < roles.size(); i++) {
			if(roles.get(i).getName().equals("ROLE_ADMIN")) {
				roles.remove(i);
			}
		}
		userService.updateUser(user);
		return "redirect:/admin";
	}
    
        
}