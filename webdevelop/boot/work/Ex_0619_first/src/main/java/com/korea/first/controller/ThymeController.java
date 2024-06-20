package com.korea.first.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.korea.first.vo.UserVO;

@Controller
public class ThymeController {
	
	@GetMapping("/ex01")
	public String ex01(Model model) {
		
		model.addAttribute("firstName", "gildong");
		model.addAttribute("lastName", "lee");
		return "ex01";
	}
	
	@GetMapping("/ex03")
	public String ex03(Model model) {
		
		List<String> list = new ArrayList<String>();
		list.add("사과");
		list.add("바나나");
		list.add("복숭아");
		list.add("자두");
		list.add("딸기");
		list.add("수박");
		model.addAttribute("list", list);
		
		model.addAttribute("firstPage", 1);
		model.addAttribute("lastPage", 5);
		return "ex03";
	}
	
	@GetMapping("/ex04")
	public String ex04(Model model) {
		
		model.addAttribute("user", new UserVO("GilDong", 40));
		
		return "ex04";
	}
	
	@GetMapping("/ex05")
	public String ex05(Model model) {
		
		model.addAttribute("user", new UserVO());
		
		return "ex05";
	}
	
	@RequestMapping("/result")
	public String ex06(@ModelAttribute("vo") UserVO vo) {

		return "ex06";
	}
	
	@GetMapping("/ex07")
	public String ex07() {

		return "ex07";
	}
	
	@GetMapping("/ex08")
	public String ex08(Model model) {
		model.addAttribute("firstName", "길동");
		model.addAttribute("list", Arrays.asList("aaa","bbb","ccc","ddd","eee"));
		
		model.addAttribute("vo", new UserVO("kim", 30));
		return "ex08";
	}
	
	@GetMapping("/ex09")
	public String ex09(Model model) {	
		model.addAttribute("arr", new Integer[] {1, 2, 3, 4, 5}) ;
		return "ex09";
	}
}
