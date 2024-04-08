package classTest;

import java.util.Scanner;

// Q1. 자동차 클래스 선언, 필드 구성, 시동 켜기, 끄기 메소드 구현

// Q2. 	시동켜기에서 사용자가 입력한 비밀번호가 맞을 때만 시동켜기
// 		단 비밀번호를 3회 틀릴 시 경찰 출동

class Car {
	
	String brand;
	String color;
	long price;
	boolean isTurnOn = false;
	String pwd;
	int wrong = 0;
	
	public Car() {;}
	
	
	
	public Car(String brand, String color, long price, String pwd) {
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.pwd = pwd;
	}
	
	public void turnOn() {
		isTurnOn = true;
		System.out.println(this.brand + "의 시동을 킵니다");
	}
	
	public void turnOff() {
		isTurnOn = false;
		System.out.println(this.brand + "의 시동을 끕니다");
	}
	
	public boolean checkPwd(String pwd) {
		if(this.pwd.equals(pwd)) {
			System.out.println("비밀번호가 맞습니다.");
			return true;
		}else {
			System.out.println("비밀번호가 틀렸습니다.");
			return false;
		}
		
	}
	
}

public class ClassTask1 {
	public static void main(String[] args) {
		
		Car car = new Car("KIA", "black", 10_100_100, "abcd");
		Scanner sc = new Scanner(System.in);
		
		String pwd;
		int choice = 0;
		int wrongChance = 3;
		
		
		do {
			System.out.println("1. 시동켜기\n2. 시동끄기");
			choice = sc.nextInt();
			if(choice == 1) {
				if(car.isTurnOn) {
					System.out.println("이미 시동이 켜져있습니다.");
					break;
				}
				
				System.out.print("비밀번호를 입력해주세요 : ");
				pwd = sc.next();

				if(car.checkPwd(pwd)) {
					car.turnOn();
				}else {
					car.wrong++;
					if(car.wrong >= wrongChance) {
						System.out.println("비밀번호를 3회 틀렸습니다.");
						System.out.println("경찰이 출동합니다.");
						break;
					}
				}
				System.out.println("=========");
				
			}else if(choice == 2){
				if(car.isTurnOn) {
					car.turnOff();
					break;
				}else {
					System.out.println("이미 시동이 꺼졌습니다.");
					break;
				}
			}else {
				System.out.println("잘못입력하셨습니다.");
			}
			
		}while(!car.isTurnOn);

	}

}
