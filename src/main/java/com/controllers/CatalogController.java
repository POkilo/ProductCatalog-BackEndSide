package com.controllers;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.entities.Product;
import com.services.ProductService;
//import com.entities.Category;
//import com.services.CategoryService;
@Controller
@RequestMapping("/catalog")
public class CatalogController {
	@Autowired
	private ProductService productSvc;
//	@Autowired
//	private CategoryService categorySvc;
	
	//page showing the index of products ordered by category
	@GetMapping("/product-list")
	public String productList(Model model) {
		List<List<Product>> byCategories = productSvc.getByCategory();
		model.addAttribute("byCategories", byCategories);
		return "product-list";
	}

	
	@GetMapping("/add-product-form")
	public String addProduct(Model model) {
		Product product = new Product();
		model.addAttribute("product", product);
		
		return "add-product-form";
	}
	
	@GetMapping("/update-product-form")
	public String updateProduct(@RequestParam("productId") int id, Model model) {
		Product product = productSvc.get(id);
		model.addAttribute("product", product);
		
		return "update-product-form";
	}
	////////////////////////////////////////////////////////////////
	@PostMapping("/save-product")
	public String saveProduct(@ModelAttribute("product") Product p) {
		p.setCurrentPrice(p.getCurrentPrice().multiply(p.getDiscountPercent().divide(new BigDecimal(100))));
		productSvc.save(p);
		
		return "redirect:/catalog/catalog-home";
	}
	
	@PostMapping("/delete-product")
	public String deleteProduct(@RequestParam("productId") int id, Model model) {
		productSvc.delete(id);
		return "redirect:/catalog/catalog-home";
	}
}
