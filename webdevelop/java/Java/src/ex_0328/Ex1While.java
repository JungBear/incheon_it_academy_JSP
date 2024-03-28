package ex_0328;

import java.util.Scanner;

public class Ex1While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 1;
		while(num <= 10) {
			System.out.println(num);
			num++;
		}
		
		Scanner sc = new Scanner(System.in);
		int i = 0;
		
		while ( i!= -1) {
			System.out.print("숫자 입력 : ");
			i = sc.nextInt();
		}
	}

}
