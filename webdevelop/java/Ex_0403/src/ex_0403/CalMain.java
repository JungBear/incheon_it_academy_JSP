package ex_0403;

import java.util.Scanner;

// CalTest를 생성
// getResult()생성

// 두개의 숫자와 산술연산자를 키보드에서 받은 뒤
// getRestult()를 통해 연산을 한 결과를 출력

// 출력은 main
public class CalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int inputNum1 = 0, inputNum2 = 0;
		String oper = null;
		
		Scanner sc= new Scanner(System.in);
		CalTest ct = new CalTest();
		
		try {
			System.out.println("식을 입력해 주세요.");
			System.out.println("ex) 2 + 3");
			inputNum1 = sc.nextInt();
			oper = sc.next();
			inputNum2 = sc.nextInt();
			
			double result = ct.getResult(inputNum1, inputNum2, oper);
			System.out.println(result);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("잘못 입력하셨습니다.");
			
		}
			

	
		
		
	}

}
