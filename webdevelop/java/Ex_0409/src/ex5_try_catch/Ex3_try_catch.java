package ex5_try_catch;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * 정수 : 100
 * 결과 : 100
 * 
 * 정수 : aab
 * 결과 : aab은(는) 정수가 아닙니다
 */
public class Ex3_try_catch {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = "";
		try {
			System.out.print("정수 : ");
			int i = sc.nextInt();
			System.out.println("결과 : " + i);
		} catch (InputMismatchException e) {
			System.out.println("결과 : " + str);
		}

	}

}
