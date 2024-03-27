package controllStatementTest;

import java.util.Scanner;

public class DoWhileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String message = "1. 분실신고\n2.통신사 이동\n3.번호변경\n0.상담사 연결";
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		
//		while(true) {
//			System.out.println(message);
//			choice = sc.nextInt();
//			if(choice == 0) break;
//		}
//		while(choice != 0) {
//			System.out.println(message);
//			choice = sc.nextInt();
//		}

		do {
			System.out.println(message);
			choice = sc.nextInt();
		}while(choice != 0);
		
		
	}

}
