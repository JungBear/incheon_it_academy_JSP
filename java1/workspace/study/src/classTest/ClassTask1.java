package classTest;

import java.util.Scanner;

// 자동차 클래스 선언, 필드 구성, 시동 켜기, 끄기 메소드 구현

// 시동켜기에서 사용자가 입력한 비밀번호가 맞을 때만 시동켜기
// 단 비밀번호를 3회 틀릴 시 경찰 출동

class Car {
	
	String brand;
	String color;
	long price;
	boolean isTurnOn = false;
	long pwd;
	int wrong = 0;
	
	public Car() {;}
	
	public Car(String brand, String color, long price, long pwd) {
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.pwd = pwd;
	}
	
	public void turnOn() {
		isTurnOn = true;
		System.out.println("시동을 킵니다");
	}
	
	public void turnOff() {
		isTurnOn = false;
		System.out.println("시동을 끕니다");
	}
	
	public boolean checkPwd(long pwd) {
		if(this.pwd == pwd) {
			System.out.println("비밀번호가 맞습니다.");
			return true;
		}else {
			wrong++;
			System.out.println("비밀번호가 틀렸습니다.");
			return false;
		}
		
	}
	
}

public class ClassTask1 {
	public static void main(String[] args) {
		
		Car car = new Car("KIA", "검은색", 10000000, 1234);
		
		System.out.println("brand : " + car.brand);
		System.out.println("color : " + car.color);
		System.out.println("price : " + car.price + "원");
		System.out.println("==============");
		
		long pwd = 0;
		Scanner sc = new Scanner(System.in);
		
		car.turnOn();
		
		do {
			if(car.isTurnOn) {
				System.out.println("이미 시동이 켜져있습니다.");
				break;
			}
			if(car.wrong == 3) {
				System.out.println("비밀번호를 3회 틀렸습니다.");
				System.out.println("경찰이 출동합니다.");
				break;
			}
			
			System.out.print("비밀번호를 입력해주세요 : ");
			pwd = sc.nextLong();
			
			if(car.checkPwd(pwd)) {
				car.turnOn();
			}
			
			System.out.println("=========");
		}while(!car.isTurnOn);

	}

}
