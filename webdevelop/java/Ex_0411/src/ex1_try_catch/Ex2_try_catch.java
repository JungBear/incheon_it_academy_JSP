package ex1_try_catch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex2_try_catch {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		try {
			int[] cards = {4, 5, 1, 2, 7, 8};
			System.out.print("몇 번째 카드를 뽑으시겠습니까?");
			int cardIdx = sc.nextInt();
			System.out.println("뽑은 카드 번호 : " + cards[cardIdx]);
			
		} catch (InputMismatchException e) {
			System.out.println("정수가 아닙니다.");
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("해당 번호의 카드는 없습니다.");
			
		}
		

	}

}
