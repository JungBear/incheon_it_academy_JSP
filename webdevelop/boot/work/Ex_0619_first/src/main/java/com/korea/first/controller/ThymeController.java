package com.korea.first.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ThymeController {
	
	@GetMapping("/ex01")
	public String ex01(Model model) {
		
		model.addAttribute("lastName", "lee");
		return "ex01";
	}
}
