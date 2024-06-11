package com.korea.first;

import java.io.IOException;
import java.util.Calendar;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class YoliTellerMVC {
	@GetMapping("/getYoil")
	public String main(int year, int month, int day,Model model) throws IOException {

		if(!isValid(year, month, day)) {
			return "yoilError";
		}
		
		char yoil = getYoil(year, month, day);
		
		model.addAttribute("year", year);
		model.addAttribute("month", month);
		model.addAttribute("day", day);
		model.addAttribute("yoil", yoil);
		
		return "yoil";

	}
	
	private boolean isValid(int year, int month, int day) {
		if(year < 0 || month < 0 || month < 0) {
			return false;
		}
		return (1<= month && month <= 12) && (1<=day && day <= 31);
	}
	
	private char getYoil(int year, int month, int day) {
		Calendar cal = Calendar.getInstance();
		cal.set(year, month-1, day);
		
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK); // 일요일 1, 월요일 2,
		
		char yoil = " 일월화수목금토".charAt(dayOfWeek);
		return yoil;
	}
	
}
