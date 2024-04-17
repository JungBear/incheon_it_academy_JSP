package ex4_work;

import java.util.Random;
import java.util.Scanner;

/*
 * QuizThread클래스를 만든다
 * startGame()메서드를 만들고 1~100사이 난수를 두개뽑아서
 * 더하여 맞추는 문제를 출제
 * 키보드에서 답을 입력하여 5문제가 정답처리 될 때까지 로직을 반복
 * 정답을 맞추고 난후 모든 문제를 맞추는데 몇초가 걸렸는데 
 * 화면에 출력하며 프로그램 종료
 * 
 */

class QuizThread extends Thread{
	int rn1, rn2;
	int timer = 0;
	int answerCount = 0;
	boolean flag = true;
	final int FINISH = 5;
	
	@Override
	public void run() {
		while(flag) {
			try {
				Thread.sleep(1000);
				timer++;
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	
	public void startGame() {
		Scanner sc = new Scanner(System.in);
		while(flag) {
			try {
				rn1 = new Random().nextInt(100)+1;
				rn2 = new Random().nextInt(100)+1;
				
				int addAnswer = rn1 + rn2;
				System.out.printf("%d + %d = ", rn1, rn2);
				int inputAnswer = sc.nextInt();
				
				if(addAnswer == inputAnswer) {
					System.out.println("정답!!");
					answerCount++;
				}else {
					System.out.println("오답");
					continue;
				}
				
				if(answerCount == FINISH) {
					System.out.println("결과 : " + timer + "초...");
					break;
				}
			} catch (Exception e) {
				System.out.println("정답은 정수로 입력하세요");
				flag = false;
			}

		}
	}
	
}

public class QuizMain {

	public static void main(String[] args) {
		QuizThread qt = new QuizThread();
		qt.start();
		qt.startGame();

	}

}
