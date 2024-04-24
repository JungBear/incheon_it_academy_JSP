package exceptionTest;

import java.util.Arrays;
import java.util.Scanner;

public class ExceptionTask {

	public static void main(String[] args) {
		/*
		 * 5개의 정수만 입력 받기
		 * - 무한 입력 상태로 구현
		 * - q입력 시 나가기
		 * - 5개의 정수는 배열에 담기
		 * - if문은 한번만(q 입력 시 나가기) 
		 * - 입력 받을 때는 무조건 next()
		 */
		
		Scanner sc = new Scanner(System.in);
		int[] arData = new int[5];
		String msg = "번째 정수 : ", input = null;
		int i = 0;
		
		while(true) {
				
			System.out.print(i+1 + msg);
			input = sc.next();
			
			if(input.equals("q")) {
				break;
			}
			
			try {
				arData[i] = Integer.parseInt(input);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("너무 많이 입력하셨습니다");
				break;
			} catch (NumberFormatException e1) {
				System.out.println("입력한 값이 정수가 아닙니다.");
				continue;
			}catch(Exception e2){
				System.out.println("에러");
				System.out.println(e2);
				continue;
			}
			i++;
						
		}
		System.out.println("arData : " + Arrays.toString(arData));
		
		
		

	}

}
