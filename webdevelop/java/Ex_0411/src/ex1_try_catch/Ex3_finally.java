package ex1_try_catch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex3_finally {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("점수 : ");
			int score = sc.nextInt();
			
			if(score >= 60) {
				System.out.println("합격");
			}else {
				System.out.println("불합격");
			}
			
		} catch (InputMismatchException e) {
			System.out.println("잘못 입력하셨습니다.");
			
		} finally {
			System.out.println("프로그램을 종료합니다");
		}

	}

}
