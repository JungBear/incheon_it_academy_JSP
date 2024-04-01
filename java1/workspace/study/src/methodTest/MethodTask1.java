package methodTest;

import java.util.Scanner;

public class MethodTask1 {
	
	// 1~10까지 println
	public void printNum() {
		for(int i = 0; i < 10; i++) {
			System.out.println(i + 1);
		}
	}
	
	// 홍길동을 n번 println
	public void printHong(int n) {
		for (int i = 0; i < n; i++) {
			System.out.println("홍길동");
		}
	}
	
	// 이름을 n번 println
	public void printName(String name, int n) {
		for (int i = 0; i < n; i++) {
			System.out.println(name);
		}
	}
	
	// 세 정수를 뺄셈
	public int sub(int num1, int num2, int num3) {
		return num1 - num2 - num3;
		
	}
	
	// 1~n까지 합
	
	public int getSumNum(int n) {
		int total = 0;
		for (int i = 0; i < n; i++) {
			total += i + 1;
		}
		return total;
	}
	
	// 홀수를 짝수로, 짝수를 홀수로
	public int changeNum(int num) {
		return ++num;
	}
	
	// 문자열을 입력받고 원하는 문자의 개수를 구해주는 메소드
	public int getLength(String str, char str2) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			
			if(ch == str2) {
				count++;
			}
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		
		MethodTask1 mt = new MethodTask1();
		Scanner sc = new Scanner(System.in);
		
		
		mt.printNum();
		System.out.println("-----------------");
		
		mt.printHong(4);
		System.out.println("-----------------");
		
		mt.printName("가나다", 3);
		System.out.println("-----------------");
		
		System.out.println(mt.sub(5, 2, 1));
		System.out.println("-----------------");
		
		System.out.println(mt.getSumNum(10));
		System.out.println("-----------------");
		
		System.out.println(mt.changeNum(2));
		System.out.println("-----------------");

		System.out.println(mt.getLength("AAAAAVVCACF", 'A'));
		System.out.println("-----------------");
		
	}
	
}
