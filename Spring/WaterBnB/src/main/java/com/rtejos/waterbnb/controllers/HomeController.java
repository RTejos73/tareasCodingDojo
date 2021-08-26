package com.rtejos.waterbnb.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.rtejos.waterbnb.models.User;
import com.rtejos.waterbnb.services.PoolService;
import com.rtejos.waterbnb.services.UserService;

@Controller
@RequestMapping("/")
public class HomeController{
	
	@Autowired
    PoolService poolService;
    UserService userService;

    

    @GetMapping("")
    public String index(HttpSession httpSession, Model model){
        User user = httpSession.getAttribute("idUser") == null ? null : userService.findUserById(Long.parseLong(httpSession.getAttribute("idUser").toString()));
         model.addAttribute("user",user);
        return "home.jsp";
    }

    @GetMapping("search")
    public String search(@RequestParam("location") String location, HttpSession httpSession, Model model){
        User user = httpSession.getAttribute("idUser") == null ? null : userService.findUserById(Long.parseLong(httpSession.getAttribute("idUser").toString()));
        model.addAttribute("user",user);
        model.addAttribute("pools",poolService.getPoolsByAddress(location));
        return "search.jsp";
    }


}
