package inputTest;

import java.util.Scanner;

public class InputTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String name = null;
		
		System.out.print("이름 : ");
		name = sc.nextLine();
		
		System.out.println(name + "님 환영합니다.");

	}

}
