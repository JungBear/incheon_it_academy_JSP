package ex2_throw;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowsExceptionExample {

	public static void checkYourSelf(Scanner sc) throws InputMismatchException{
		System.out.println("1. 사람과 어울리는 것이 좋다\n2. 혼자있는게 좋다.");
		System.out.print("선택 : ");
		int check = sc.nextInt();
		
		if(check == 1) {
			System.out.println("당신은 E입니다.");
		}else {
			System.out.println("당신은 I입니다.");
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("===성격 유형 검사를 시작합니다.===");
			checkYourSelf(sc);
			
		} catch (InputMismatchException e) {
			System.out.println("잘못입력하셨습니다.");
			
		}finally {
			System.out.println("프로그램 종료");
		}

	}

}
