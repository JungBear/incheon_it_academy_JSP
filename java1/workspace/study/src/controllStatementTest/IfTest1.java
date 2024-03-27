package controllStatementTest;

import java.util.Scanner;

public class IfTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Q. 입력 받은 나이가 19세 초과면 성인
		Scanner sc = new Scanner(System.in);
		int age = 0;
		
		System.out.print("나이를 입력해 주세요 : ");
		age = sc.nextInt();
		
		if(age>19) {
			System.out.println("성인입니다.");
		}else {
			System.out.println("미성년자입니다.");
		}

	}

}
