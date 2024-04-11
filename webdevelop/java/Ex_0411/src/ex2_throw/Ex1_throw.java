package ex2_throw;

import java.util.Scanner;

public class Ex1_throw {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int value = 0;
		
		while(true) {
			try {
				System.out.print("숫자를 입력하세요(0~50) : ");
				value = sc.nextInt();
				if(value == -1) {
					break;
				}
				
				if(value < -1 || value > 50) {
					throw new Exception("숫자의 허용범위가 아닙니다.");
				}
			} catch (Exception e) {
				System.out.println("에러 메세지 : " + e.getMessage());
			}
		}
		

	}

}
