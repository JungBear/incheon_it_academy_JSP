package com.korea.di.di3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.ToString;

@Component
@ToString
public class Car {
	
	@Autowired
	Engine engine;
	
	@Autowired
	Door door;
}
