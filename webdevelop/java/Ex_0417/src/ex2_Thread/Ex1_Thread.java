package ex2_Thread;

class ThreadTest extends Thread{
	@Override
	public void run() {
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Thread클래스 상속 : " + i);
		}
	}
}

class RunnableTest implements Runnable{
	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.println("Runnable 구현 : " + i);
		}
		
	}
}

public class Ex1_Thread {
	public static void main(String[] args) {
		ThreadTest tt = new ThreadTest();

		RunnableTest rt = new RunnableTest();
		Thread t1 = new Thread(rt);
		tt.start();
		t1.start();
		for(int i = 0; i < 10; i++) {
			System.out.println("메인함수 실행중 : " + i);
		}
	}
}
