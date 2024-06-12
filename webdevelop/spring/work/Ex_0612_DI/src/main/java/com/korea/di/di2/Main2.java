package com.korea.di.di2;

import java.util.HashMap;
import java.util.Map;

class Car{};
class SportCar extends Car{};
class Truck extends Car{};
class Engine{};

// 객체 컨테이너(ApplicationContext)만들기
// 클래스안에 Map형태로 객체를 저장

class AppContext{
	Map map;
	
	public AppContext() {
		map = new HashMap();
		map.put("car", new SportCar());
		map.put("engine", new Engine());
	}
	
	Object getBean(String key) {
		return map.get(key);
	}
}


public class Main2 {
	public Main2() {
		AppContext ac = new AppContext();
		
		Car car = (Car)ac.getBean("car");
		System.out.println("car : " + car);
		
		Engine engine = (Engine)ac.getBean("engine");
		System.out.println("engine : " + engine);
	}
}
