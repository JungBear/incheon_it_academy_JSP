package ex_0401;

import java.util.Scanner;

public class Ex2MultiArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] arr = { {1,2,3,4,5}, {6,7,8,9,10}, {11, 12, 13, 14, 15}, {16,17,18,19,20}};
		
		int sum = 0, count = 0;
		float avg = 0.0f;
		
		
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
				count++;
			}
		}
		System.out.println("sum : " + sum);
		System.out.println("count : " + count);
		
		avg = (float) sum / count;
		System.out.println("avg : " + avg);
		System.out.println("-----------------------------");
		
		
		// 학생들의 수학과 영어 성적을 등록하는 프로그램이 있다
		// 프로그램을 실행하면 몇 명의 정보를 저장할 것인지 입력 받은 후
		// 입력받은 수만큼 학생들의 이름, 수학성적, 영어성적을 입력받는 프로그램 작성
		
		// 예시
		// 등록할 인원수 : 2
		// 이름 : 제임스
		// 수학 : 83
		// 영어 : 81
		// -----
		// 이름 : 스미스
		// 수학 : 28
		// 영어 : 100
		// ------
		// 2명 등록 완료
		// 등록된 것 다출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("등록할 인원 수 : ");
		count = sc.nextInt();
		
		String[][] grade = new String[count][3];
		
		int math = 0, eng = 0;
		String name = "";
		
		for (int i = 0; i < grade.length;) {
			System.out.print("이름 : ");
			name = sc.next();
			grade[i][0] = name;
			
			System.out.print("수학 : ");
			math = sc.nextInt();
			
			if(math < 0 || math > 100) {
				System.out.println("수학 점수를 잘못 입력하셨습니다.");
				System.out.println("----------------");
				continue;
			}
			grade[i][1] = Integer.toString(math);
			
			
			System.out.print("영어 : ");
			eng = sc.nextInt();
			
			if(eng < 0 || eng > 100) {
				i--;
				System.out.println("영어 점수를 잘못 입력하셨습니다.");
				System.out.println("----------------");
				continue;
			}
			grade[i][2] = Integer.toString(eng);
			System.out.println("----------------");
			i++;
		}
		
		System.out.println(count + "명 등록 완료");
		for (int i = 0; i < grade.length; i++) {
			for (int j = 0; j < grade[i].length; j++) {
				
				System.out.print(grade[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
