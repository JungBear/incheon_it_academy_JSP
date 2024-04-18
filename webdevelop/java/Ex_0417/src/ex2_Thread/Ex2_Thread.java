package ex2_Thread;

class ThreadInfo extends Thread{
	@Override
	public void run() {
		Thread.currentThread().setName("ThreadInfo");
		System.out.println("현재 스레드의 이름: " + Thread.currentThread().getName());
		System.out.println("현재 스레드의 상태: " + Thread.currentThread().getState());
		System.out.println("현재 스레드의 순서: " + Thread.currentThread().getPriority());
	}
}

public class Ex2_Thread {
	public static void main(String[] args) {
		ThreadInfo ti = new ThreadInfo();
		ti.start();
		Thread.currentThread().setName("main");
		System.out.println("현재 스레드의 이름: " + Thread.currentThread().getName());
		System.out.println("현재 스레드의 상태: " + Thread.currentThread().getState());
		System.out.println("현재 스레드의 순서: " + Thread.currentThread().getPriority());
		
		// Runnable인터페이스를 람다식을 통해 구현
		Runnable run = ()->{
			for(int i = 0; i < 10; i++) {
				System.out.println("람다식 구현 : " + i);
			}
		};
		
		Thread t = new Thread(run);
		t.start();
		
		for(int i = 0; i < 10; i++) {
			System.out.println("메인함수 : " + i);
		}
		
	}
}
