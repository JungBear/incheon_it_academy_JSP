package controllStatementTest;

import java.util.Scanner;

public class WhileTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		심리테스트, 번호로 입력
		
//		 Q. 당신이 좋아하는 색을 선택하세요
//		1. 빨간색
//			- 불같고 열정적이고 적극적이다.
//		2. 노란색
//			- 발랄하고 밝고 귀엽고 개성있고 착하다.
//		3. 검은색
//			- 든든하고 냉철하고 멋지다.
//		4. 흰색
//			- 천사같고 깔끔하고 정리를 좋아하고 배려심이 많다
		
		Scanner sc = new Scanner(System.in);
		
		String message = "Q. 당신이 좋아하는 색을 선택하세요";
		String choiceMessage = "1.빨간색\n2.노란색\n3.검은색\n4.흰색\n5.나가기";
		String redMessage = "불같고 열정적이고 적극적이다.";
		String yellowMessage = "발랄하고 밝고 귀엽다 개성있고 착하다.";
		String blackMessage = "든든하고 냉철하고 멋지다.";
		String whiteMessage = "천사 같고 깔끔하고 정리를 좋아하고 배려심이 많다.";
		String errorMessage = "다시 입력하세요";

		
		int choice = 0;
		String result = null;
		
		System.out.println(message);
		System.out.println(choiceMessage);
		
		choice = sc.nextInt();
		
		
		while (true) {
			if(choice == 5) break;
			switch(choice) {
				case 1: 
					result = redMessage;
					break;
				case 2:
					result = yellowMessage;
					break;
				case 3: 
					result = blackMessage;
					break;
				case 4:
					result = whiteMessage;
					break;
				default:
					result = errorMessage;
			}
			System.out.println(result);
		}

	}

}
