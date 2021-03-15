package com.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@GetMapping("/")
	public String showHome() {
		return "home";
	}
	
	@GetMapping("/redirect")
	public String redirect(Model model) {
		return "redirect:/catalog/product-list";
	}
}
