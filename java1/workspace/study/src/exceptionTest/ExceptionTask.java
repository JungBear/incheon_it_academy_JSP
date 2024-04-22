package exceptionTest;

import java.util.Scanner;

public class ExceptionTask {

	public static void main(String[] args) {
		/*
		 * 5개의 정수만 입력 받기
		 * - 무한 입력 상태로 구현
		 * - q입력 시 나가기
		 * - 5개의 정수는 배열에 담기
		 * - if문은 한번만(q 입력 시 나가기) 
		 * - 입력 받을 때는 무조건 next()
		 */
		
		Scanner sc = new Scanner(System.in);
		int[] arData = new int[5];
		
		while(true) {
			try {
				int i = 0;
				System.out.print("정수를 입력해주세요");
				String input = sc.next();
				arData[i] = Integer.parseInt(input);
				
				i++;
				if(input.equals("q")) {
					break;
				}
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("너무 많이 입력하셨습니다");
			}
			
			
			
		}
		
		
		

	}

}
