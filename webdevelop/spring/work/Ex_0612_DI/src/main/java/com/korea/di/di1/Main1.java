package com.korea.di.di1;

import java.io.FileReader;
import java.util.Properties;

class Car{};
class SportCar extends Car{};
class Truck extends Car{};
class Engine{};

public class Main1 {
	public static void main(String[] args) throws Exception {
		// 변경ㅅ항 발생 시 타입과 생성자 부분 모두 수정
		// SportCar car = new SportCar();
		// Truck car = new Truck();
		
		// 다형성을 이용하면 수정해야하는 곳이 적어진다
		// Car car = new SportCar();
		// Car car = new Truck();
		
		// 별도의 메서드를 만들어서 객체를 생성하면 수정포인트를 더 줄일 수 있다
		Car car = (Car) getObject("car");
		System.out.println("car : " + car);
		
		Engine e = (Engine) getObject("engine");
		System.out.println("engine : " + e);
	}
	
	static Object getObject(String key) throws Exception {
		// return new SportCar();
		
		// Map과 외부파일을 이용한 객체 읽어오기
		// Properties 클래스
		// 키와 값의 쌍으로 구성된 속성 목록을 관리할 때 사용
		// 일반적으로 구성 파일이나 속성 파일에서 설정 정보를 읽거나 쓸 때 사용
		Properties p = new Properties();
		p.load(new FileReader("config.txt"));
		
		Class clazz = Class.forName(p.getProperty(key));
		
		return clazz.newInstance();
	}
	
}
