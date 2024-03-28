package ex_0328;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex1_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int num = 0;
		for(int i = 0; i < 10; i++) {
			num = i +  1;
			System.out.println(num);
		}
		
		System.out.println("------------------");
		
//		1~10까지
		for (int i = 0; i < 10; i++) {
			num = 10 - i;
			System.out.println(num);
		}
		

		System.out.println("------------");
//		10~1까지 3의배수만 출력
		
		for(int i = 1; i <= 10; i++) {
			if(i % 3 == 0) {
				System.out.println(i);
			}
		}
		
		System.out.println("------------");
		
//		1~10까지 합
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			sum += i + 1;
		}
		System.out.println(sum);
		System.out.println("------------");
		
//		구구단
		int dan = 4;
		for(int i=1; i<10; i++) {
			System.out.printf("%d * %d = %d\n", dan, i, dan * i);
		}
		
		System.out.println("------------");
		
//		키보드에서 정수를 입력받아 n에 초기화
//		1~n까지의 합을 계산
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력해주세요 : ");
		int num1 = sc.nextInt();
		
		sum = 0;
		
		for(int i = 1; i <= num1; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		System.out.println("------------");
		int count = 0;
		
		for (int i = 0; i < 10; i++) {
			System.out.println("정수를 입력하세요");
			int idx = sc.nextInt();
			
			if(idx % 2 == 0) {
				count++;
			}
		}
		System.out.println(count);
		
		
		
		
		
		
	}
	

}
