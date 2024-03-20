package inputTest;

import java.util.Scanner;

public class InputTest3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = null, firstName = null, lastName = null;
		
		System.out.print("이름 : ");
		lastName = sc.next();
		firstName = sc.next();
		name = lastName + firstName;
		
		
//		System.out.println(lastName + firstName + "님 반갑습니다.");
		System.out.println(name + "님 환영합니다.");
		
	}
}
