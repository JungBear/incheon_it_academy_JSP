package ex5_try_catch;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Ex2_try_catch {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("점수를 입력하세요 : ");
			int score = sc.nextInt();
			
			if(score>= 65) {
				System.out.println("합격");
			}else {
				System.out.println("불합격");
			}
		}catch (InputMismatchException e) {
			System.out.println("키보드 입력이 잘못되었습니다.");
		}
		System.out.println("프로그램 종료");

	}

}
