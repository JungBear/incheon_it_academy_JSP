package ex_0327;

import java.util.Scanner;

public class Ex3_if_elseif_else {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int favorite = 8;
		if (favorite < 5) {
			System.out.println("좋아하는 수가 5보다 작다");
		}else if (favorite > 5) {
			System.out.println("좋아하는 수가 5보다 크다");
		}else {
			System.out.println("좋아하는 수는 5이다");
		}

		System.out.println("-------------------------------");
		
//		키보드에서 정수를 입력받아 age에 저장
//		20살 이상이면 성인입니다.
//		14살 이상이면 청소년입니다.
//		7살 이상이면 어린이입니다.
//		그 이외이넨 유아입니다
		int age = 0;
		String message = null;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력해주세요 : ");
		age = sc.nextInt();
		
		
		
		if(age>=20) {
			message = "성인입니다";
		}else if(age >= 14) {
			message = "청소년입니다";
		}else if(age >= 7) {
			message = "어린이입니다";
		}else if(age >= 0){
			message = "유아입니다";
		}else {
			message = "잘못입력하셨습니다";
		}
		
		System.out.println(message);
		
		System.out.println("-------------------------------");
		
//		score변수에 저장
//		90점 이상 "A입니다"
//		80점 이상 B
//		70점 이상 C
//		60점 이상 D
//		60점 미만 F
		
		int score = 0;
		System.out.println("점수를 입력해주세요 : ");
		score = sc.nextInt();
		
		if(score > 100 || score < 0) {
			message = "잘못입력하셨습니다";
		}else if(score >= 90) {
			message = "A입니다";
		}else if(score >= 80) {
			message = "B입니다";
		}else if(score >= 70) {
			message = "C입니다";
		}else if(score >= 60) {
			message = "D입니다";
		}else{
			message = "F입니다";
		}
		
		System.out.println(message);
	}

}
