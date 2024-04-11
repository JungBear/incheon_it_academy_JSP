package ex2_throw;

import java.util.Scanner;

public class ExceptionMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("당신의 나이를 입력하세요 : ");
			int age = sc.nextInt();
			if(age < 0) {
				throw new InputErrorException("입력이 잘못되었습니다.");
			}
		} catch (InputErrorException e) {
			System.out.println(e.getMessage());
		}

	}

}
