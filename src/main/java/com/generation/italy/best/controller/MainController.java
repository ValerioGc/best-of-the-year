package com.generation.italy.best.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping("/")
	public String getHome(Model model) {
		String name = "Valerio";
		model.addAttribute("name", name);
		return "home"; 
	}
}