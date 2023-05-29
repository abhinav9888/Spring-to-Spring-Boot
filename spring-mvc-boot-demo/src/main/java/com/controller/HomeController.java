package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller //It is a specialize version of @Component
public class HomeController {
	@GetMapping("/")
	public String showHome()
	{
		System.out.println("Reached the showHome() method..");
		return "index";
	}
	
	@PostMapping("/process")
	public String process(@RequestParam("yourname") String name, Model model)
	{
		model.addAttribute("message", "Good Evening "+name+" Hope you are fine..");
		return "index";
	}
}
