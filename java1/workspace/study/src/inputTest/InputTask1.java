package inputTest;

import java.util.Scanner;

public class InputTask1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int inputAge = 0;
		
		System.out.print("나이 : ");
		
		inputAge = sc.nextInt();
		
		System.out.printf("당신의 나이는 %d입니다.", inputAge);
		
		
	}

}
