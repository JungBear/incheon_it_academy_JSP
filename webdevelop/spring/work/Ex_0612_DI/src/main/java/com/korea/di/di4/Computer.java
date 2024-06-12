package com.korea.di.di4;

import org.springframework.stereotype.Component;

@Component
public class Computer {
	int ram = 16;
	
	public int getRam() {
		return this.ram;
	}
}
