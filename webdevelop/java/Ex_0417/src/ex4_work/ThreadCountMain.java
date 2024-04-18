package ex4_work;

import java.util.Iterator;
import java.util.Scanner;

/*
 * 스캐너를 이용하여 키보드에서 숫자를 입력받고
 * 스레드에서 입력받은 숫자부터 1씩 감소하다가 0이 되었을 때
 * "종료"라는 메세지와 함께 스레드를 빠져나오도록 만들어보자
 */

class Decrease extends Thread{
	private int num;
	
	public Decrease(int num) {
		this.num = num;
	}
	
	public int getNum() {
		return num;
	}
	
	public void run() {
		for(int i = num; i >=0; i--) {
			try {
				System.out.println(i);
				Thread.sleep(1000);
			} catch (Exception e) {
				
			}
		}
		System.out.println("종료");
	}
}

public class ThreadCountMain {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int inputNum = sc.nextInt();
		
		Decrease d = new Decrease(inputNum);
		d.start();
		
		
	}

}
