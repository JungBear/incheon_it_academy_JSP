package ex_0327;

import java.util.Scanner;

public class Ex2_switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		키보드에서 두개의 저우 입력
//		산술연산자 기호를 입력받고 문자열 변수에 저장
//		스위치문을 이용하여 연산을 수행하는 코드
		int num1 = 0, num2 = 0, result = 0;
		String oper = null;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 2개를 입력하세요");
		System.out.println("ex) 3 1");
		
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		System.out.print("연산자를 입력하세요 : ");
		oper = sc.next();
		
		switch(oper) {
		case "+":
			result = num1 + num2;
			break;
		case "-":
			result = num1 - num2;
			break;
		case "*":
			result = num1 * num2;
			break;
		case "/":
			result = num1 / num2;
			break;
		case "%":
			result = num1 % num2;
			break;
		default:
			System.out.println("잘못입력하셨습니다.");
		}
		if(result != 0) {
			System.out.println(result);
		}
	}

}
