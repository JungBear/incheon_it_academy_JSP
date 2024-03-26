package ex_0326;

import java.util.Scanner;

public class Ex5_operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		과수원에서 배, 사과, 오렌지
//		하루에 생산되는 양은 각각 5, 7, 5개
//		1. 과수원에서 하루에 생산되는 과일의 총 개수
//		2. 시간당 생산되는 과일의 총 개수(float)
		
		int pear = 5, apple = 7, orange = 5;
		
//		1. 
		int dayCount = pear + apple + orange;
		
//		2. 
		float hourCount =  dayCount / 24.0f;
		
		System.out.println("하루 총 생산량 : " + dayCount);
		System.out.println("시간당 총 생산량 : " + hourCount);
		System.out.println("----------------------");
		
//		상자 하나에 농구공 5개
//		농구공 23면 몇개의 상자
		
		int basketball = 5, box = 0, count = 23;
		
		box = count / basketball;


		box = count % basketball == 0 ? count / basketball 
				:  count / basketball + 1;
		System.out.println("박스 총 갯수 : " + box);
		System.out.println("----------------------");
		
//		국어, 영어, 수학 점수를 키보드에서 정수로 입력받고
//		1. 세 과목에 대한 합계 출력
//		2. 평균 출력
//		3. 세 과목의 점수와 평균을 가지고 합격 여부를 처리하는데 
//		세 과목의 점수가 각각 40점 이상이면서 평균이 60점이상일 때 합격
		
		
		Scanner sc = new Scanner(System.in);
		int korean = 0, math = 0, english = 0;
		System.out.print("국어점수를 입력해주세요 : ");
		korean = sc.nextInt();
		
		System.out.print("수학점수를 입력해주세요 : ");
		math = sc.nextInt();
		
		System.out.print("영어점수를 입력해주세요 : ");
		english = sc.nextInt();
		
		int total = korean + math + english;
		System.out.println("세 과목의 총 합 : " + total);
		
		float avg = (float)total / 3;
		System.out.println("세 과목의 평균 : " + avg);
		
		String isPass = (korean >= 40 || math >= 40 || english >= 40) && avg >= 40 ? "합격" : "불합격";
		System.out.println("합격여부 : " + isPass);
		
		
		
	}

}
