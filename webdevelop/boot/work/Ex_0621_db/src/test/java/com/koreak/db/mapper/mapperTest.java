package com.koreak.db.mapper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@Slf4j
public class mapperTest {
	
	@Autowired
	TimeMapper timeMapper;
	
	@Test
	public void getTime() {
		log.info("timeLog : "  + timeMapper.getTime());
	}
}
