package ex1_try_catch;

import java.util.Scanner;

/*
 * 정수 : 100
 * 결과 : 100
 * 
 * 정수 : aab
 * 결과 : aab은(는) 정수가 아닙니다
 */
public class Ex1_try_catch {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		String str = "";
		String resultMessage = "결과 : ";
		
		try {
			str = sc.next();
			int i = Integer.parseInt(str);
			System.out.println(resultMessage + i);
		} catch (NumberFormatException e) {
			System.out.println(resultMessage + str + "은(는) 정수가 아닙니다.");
		}

	}

}
