package com.korea.di;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RequestParamTest {
	
	@RequestMapping("/requestParam")
	public String main(String year) {
		System.out.printf("[%s]year=[%s]%n",new Date(),year);
		return "yoil";
	}
	
	@RequestMapping("/requestParam2")
	public String main2(@RequestParam String year) {
		System.out.printf("[%s]year=[%s]%n",new Date(),year);
		return "yoil";
	}
	
	@RequestMapping("/requestParam3")
	public String main3(@RequestParam(defaultValue ="1") String year) {
		System.out.printf("[%s]year=[%s]%n",new Date(),year);
		return "yoil";
	}
}
