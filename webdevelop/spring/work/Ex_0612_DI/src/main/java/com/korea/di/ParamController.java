package com.korea.di;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import vo.PersonVO;

@Controller
public class ParamController {
	
	@RequestMapping(value= {"/","/insert_form"})
	public String insert_form(){
		return "insert_form";
	}
	
	@GetMapping("insert1")
	public String insert1(@RequestParam String name, @RequestParam int age, Model model) {
		PersonVO vo = new PersonVO();
		
		vo.setAge(age);
		vo.setName(name);
		
		model.addAttribute("vo", vo);
		
		return "insert_result";  
	}
	
	@GetMapping("insert2")
	public String insert2(@ModelAttribute("vo") PersonVO vo) {
		
		return "insert_result";
	}
}
