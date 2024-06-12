package com.korea.di.di4;

import org.springframework.stereotype.Component;

@Component
public class Coding {
	
	// @Autowired
	Computer computer;
	
	// setter주입
	public void setComputer(Computer computer) {
		this.computer = computer;
	}
	
	// 생성자 주입
	public Coding(Computer computer) {
		this.computer = computer;
	}
	
	
	public Computer getComputer() {
		return computer;
	}
}
