package ex_0403;

import java.util.Scanner;

/*
 * main에서 키보드를 통해 받은 값을 전달
 * TimesTable 클래스를 만들고
 * showTable()
 * showTable()은 전달받은 값에 대한 구구단을 출력
 */
public class TimesTableMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
		Scanner sc = new Scanner(System.in);
		TimesTable tt = new TimesTable();
		
		System.out.print("숫자를 입력해 주세요 : ");
		num = sc.nextInt();
		
		tt.showTable(num);
		
		
	}

}
