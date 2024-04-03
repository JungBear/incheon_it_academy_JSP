package ex_0403;

import java.util.Scanner;

/*
 * Start에서 1~50사이의 난수를 발생시킨다
 * StartMain에서 키보드를 통해 정수를 입력받는다
 * 
 * start에서 사용자가 입력한 숫자를 판단하여 
 * 발생한 난수보다 크다면 Down!, 작다면 Up!을 출력
 * 
 * 사용자가 입력한 숫자와 난수가 같은경우 정답! 출력하고 프로그램을 종료
 * 몇회만에 맞췄는데 횟수도 같이 출력
 */
public class StartMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		Start st = new Start();
		
		boolean flag = false;
		int inputNum = 0;
		
		while(!flag) {
			System.out.print("숫자입력 : ");
			inputNum = sc.nextInt();
			
			st.upDown(inputNum);
			if(st.getRandomNum() == inputNum) {
				flag = true;
			}
			System.out.println("=============");
		}

	}

}
