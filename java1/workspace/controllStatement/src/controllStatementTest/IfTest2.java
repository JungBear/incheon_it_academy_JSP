package controllStatementTest;

import java.util.Scanner;

public class IfTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int num1 = 0, num2 =0;
		String result = null;
		
		String message = "정수를 입력하세요 : ";
		String exampleMessage = "예) 1 5";
			
		System.out.println(message);
		System.out.println(exampleMessage);
		
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
//		if(num1 > num2) {
//			System.out.println("더 큰 값 : " + num1);
//		}else if(num1 < num2) {
//			System.out.println("더 큰 값 : " + num2);
//		}else {
//			System.out.println("같다");
//		}
		
		if(num1 > num2) {
			result = "더 큰 값 : " + num1;
		}else if(num1 < num2) {
			result = "더 큰 값 : " + num2;
		}else {
			result = "같다";
		}
		
		System.out.println(result);
		
	}

}
