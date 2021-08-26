package com.rtejos.waterbnb.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.rtejos.waterbnb.models.Pool;
import com.rtejos.waterbnb.models.Rating;
import com.rtejos.waterbnb.models.Role;
import com.rtejos.waterbnb.models.User;
import com.rtejos.waterbnb.services.PoolService;
import com.rtejos.waterbnb.services.RatingService;
import com.rtejos.waterbnb.services.SizeService;
import com.rtejos.waterbnb.services.UserService;

@Controller
public class PoolController{

	@Autowired
    PoolService poolService;
    UserService userService;
    SizeService sizeService;
    RatingService ratingService;

   
    
    
    

    @GetMapping("/host/dashboard")
    public String index(@ModelAttribute("pool") Pool pool, HttpSession httpSession, Model model){
        if(httpSession.getAttribute("idUser") == null){ return "redirect:/";}
        User user = userService.findUserById(Long.parseLong(httpSession.getAttribute("idUser").toString()));
        if(user.getRole().getId() != Role.HOST){ return "redirect:/"; }

        model.addAttribute("pools", poolService.getPools());
        model.addAttribute("sizes",sizeService.getSizes());

        return "dashboard.jsp";
    }

    @PostMapping("/pool")
    public String store(@Valid @ModelAttribute("pool") Pool pool, HttpSession httpSession, BindingResult result,Model model){
        if(httpSession.getAttribute("idUser") == null){ return "redirect:/";}
        User user = userService.findUserById(Long.parseLong(httpSession.getAttribute("idUser").toString()));
        if(user.getRole().getId() != Role.HOST){ return "redirect:/"; }

        if(result.hasErrors()){
            return index(pool,httpSession,model);
        }

        poolService.savePool(pool);
        return  "redirect:/host/dashboard";
    }

    @GetMapping("pools/{id}/review")
    public String review(@PathVariable("id") Long id, HttpSession httpSession, Model model){
        if(httpSession.getAttribute("idUser") == null){ return "redirect:/host/dashboard";}
        User user = userService.findUserById(Long.parseLong(httpSession.getAttribute("idUser").toString()));
        model.addAttribute("user",user);
        model.addAttribute("ratings", Rating.RATINGS);
        model.addAttribute("pool", poolService.getPoolById(id));
        return "pools/review.jsp";
    }

    @PostMapping("pools/{id}/review")
    public String storeReview(@PathVariable("id") Long id, @RequestParam("description") String description, @RequestParam("rating") int rating, HttpSession httpSession, Model model){
        if(httpSession.getAttribute("idUser") == null){ return "redirect:/host/dashboard";}

        User user = userService.findUserById(Long.parseLong(httpSession.getAttribute("idUser").toString()));
        Pool pool = poolService.getPoolById(id);
        Rating r = new Rating(user, pool, rating,description);
        ratingService.saveRating(r);

        return "redirect:/pools/"+id;
    }



}