package inputTest;
import java.util.Scanner;

public class InputTask2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		두 정수를 입력한 뒤 덧셈 결과 출력
//		next()만 사용
		Scanner sc = new Scanner(System.in);
		int num1 = 0, num2 = 0, result = 0;
		
		System.out.print("숫자를 입력해주세요 :");
		num1 = Integer.parseInt(sc.next());
		
		System.out.print("숫자를 입력해주세요 :");
		num2 = Integer.parseInt(sc.next());
		
		result = num1 + num2;
		
		System.out.printf("두 수의 합은 %d입니다",result);
	}

}
