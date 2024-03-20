package operTest;

import java.util.Scanner;

public class Oper3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		삼항연산자
//		대소 비교
//		두 정수 입력해서 비교
		Scanner sc = new Scanner(System.in);
		
		int num1 = 0, num2 =0;
		String result = null;
		
		String message1 = "정수1를 입력하세요 : ";
		String message2 = "정수2를 입력하세요 : ";
			
		System.out.print(message1);
		num1 = sc.nextInt();
		
		System.out.print(message2);
		num2 = sc.nextInt();
		
		result = num1 > num2 ? "더 큰값 : " + num1 
				: num1 == num2 ? "같다" 
						: "더 큰값 : " + num2;
		System.out.println(result);
		
	}

}
