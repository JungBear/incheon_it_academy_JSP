package com.korea.first.dependency.qualifier;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

import com.korea.first.dependency.qulifier.Computer;

import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@Slf4j
public class ComputerTest2 {
	
	@Autowired() @Qualifier("laptop")
	Computer computer;
	
	@Test
	public void getScreenWidth() {
		log.info(Integer.toString(computer.getScreenWidth()));
	}

}
