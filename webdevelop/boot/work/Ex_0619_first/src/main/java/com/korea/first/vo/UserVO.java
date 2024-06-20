package com.korea.first.vo;

import lombok.Data;

@Data
public class UserVO {
	private  String name;
	private  int age;
	
	public UserVO() {
	
	}

	public UserVO(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
}
