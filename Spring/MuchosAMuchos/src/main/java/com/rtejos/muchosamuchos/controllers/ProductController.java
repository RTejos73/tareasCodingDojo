package com.rtejos.muchosamuchos.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.rtejos.muchosamuchos.models.Category;
import com.rtejos.muchosamuchos.models.CategoryProduct;
import com.rtejos.muchosamuchos.models.Product;
import com.rtejos.muchosamuchos.servers.CatProdService;
import com.rtejos.muchosamuchos.servers.CategoryService;
import com.rtejos.muchosamuchos.servers.ProductService;



@Controller
public class ProductController {
	
	public final ProductService productService;
	public final CategoryService categoryService;
	private final CatProdService catprodService;
	
	public ProductController(ProductService productService, CategoryService categoryService,
			CatProdService catprodService) {
		this.productService = productService;
		this.categoryService = categoryService;
		this.catprodService = catprodService;
	}
	
	

	@GetMapping("/products/new")
	public String paginaCreaProducto (@ModelAttribute("newProduct") Product product, BindingResult result) {
		return "producto.jsp";
	}
	
	@PostMapping("/products/new")
	public String creaProducto(@ModelAttribute("newProduct") Product product, BindingResult result) {
		productService.creaProducto(product);
		return "redirect:/products/new";
	}
	
	
	@GetMapping("/products/{id_product}")
	public String detalleProducts(@PathVariable("id_product") Long idProduct, Model model) {
		
		Product producto = productService.buscaProductoId(idProduct);
		List<Category> categoria = categoryService.buscaCategorias();
		List<CategoryProduct> catprod = catprodService.buscaCatporIdProd(idProduct);
		
		model.addAttribute("producto", producto);
		model.addAttribute("categoria", categoria);
		model.addAttribute("catprod", catprod);
		return "detalleProducto.jsp";
	}
	
	@PostMapping("/products/category/add")
	public String addCategoryProduct(@RequestParam("id_product") Long idProd, @RequestParam("category_id") Long idCat) {
		System.out.println(idProd);
		System.out.println(idCat);
		
		return "producto.jsp";
	}
	
	
	
	
	
	
	
}
