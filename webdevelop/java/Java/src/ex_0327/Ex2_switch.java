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
			result = 0;
		}
		if(result == 0) {
			System.out.println("잘못 입력하셨습니다");
		}else {
			System.out.println(result);
		}
		
		
//		month에 입력반고
//		달이 몇일까지 있는지 switch문으로 작성
//		break 3번
		
		int month = 0;
		int day = 0;
		
		System.out.print("달을 입력해주세요 : ");
		month = sc.nextInt();
		
		switch(month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			day = 31;
			break;
		case 4: case 6: case 9: case 11:
			day = 30;
			break;
		case 2:
			day = 28;
			break;
		default:
			System.out.println("잘못입력하셨습니다");
		
		}
		
		if(day!=0) {
			System.out.println(month + "월은 " + day + "까지 있습니다.");
		}
	}

}
