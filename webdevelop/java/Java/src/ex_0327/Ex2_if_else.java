package ex_0327;

import java.util.Scanner;

public class Ex2_if_else {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		키보드에 입력받아 ball로저장
//		공의 개수에 따라 보관에 필요한 박스의 갯수 구하기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ball의 갯수 : ");
		int ball = sc.nextInt();
		int box = 0;
		
		if(ball % 5 == 0) {
			box = ball / 5;
		}else {
			box = ball / 5 + 1;
		}
		
		System.out.println("필요한 box의 갯수 : " + box);
		
	}

}
