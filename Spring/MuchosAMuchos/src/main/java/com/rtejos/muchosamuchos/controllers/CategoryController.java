package com.rtejos.muchosamuchos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.rtejos.muchosamuchos.models.Category;
import com.rtejos.muchosamuchos.servers.CategoryService;

@Controller
public class CategoryController {
	
	public final CategoryService categoryService;

	public CategoryController(CategoryService categoryService) {
		this.categoryService = categoryService;
	}
	
	
	@GetMapping("/categories/new")
	public String paginaCreaCategoria(@ModelAttribute("newCategory") Category categoria, BindingResult result) {
		return "categoria.jsp";
	}
	
	@PostMapping("/categories/new")
	public String creaCategoria(@ModelAttribute("newCategory") Category categoria, BindingResult result) {
		categoryService.creaCategoria(categoria);
		return "redirect:/categories/new";
	}

}
