package ex_0325;

import java.util.Scanner;

public class Ex2_scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		이름, 나이, 주소, 키를 키보드에서 입력받아 다음과 같이 출력하라
//		제 이름은 이름 입니다.
//		제 나이는 나이 입니다.
//		제 주소는 주소 입니다.
//		제 키는 키 입니다.
		
		Scanner sc = new Scanner(System.in);
		String name = null, address = null;
		int age = 0;
		double height = 0.0;
				
				
		System.out.print("이름을 입력해주세요 : ");
		name = sc.next();
		
		System.out.print("나이를 입력해주세요 : ");
		age = sc.nextInt();
		
		System.out.println("주소를 입력해주세요 : ");
		sc.nextLine();
		address = sc.nextLine();
		
		System.out.print("키를 입력해주세요 : ");
		height = sc.nextDouble();
		
		System.out.printf("제 이름은 %s입니다.\n", name);
		System.out.printf("제 나이는 %d입니다.\n", age);
		System.out.printf("제 주소는 %s입니다.\n", address);
		System.out.printf("제 키는 %fcm입니다.\n", height);
		
		
	}

}
