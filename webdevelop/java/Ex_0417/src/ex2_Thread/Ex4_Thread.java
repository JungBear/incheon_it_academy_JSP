package ex2_Thread;

class SynchronizedEx implements Runnable{
	private long money = 10_000;
	
	public long getMoney() {
		return money;
	}
	public void setMoney(long money) {
		this.money = money;
	}
	
	public void outMoney(long money) {
		String threadName = Thread.currentThread().getName();
		if(getMoney() > 0) {
			this.money -= money;
			System.out.println(threadName + "- 잔액" + getMoney() + "원");
		}else {
			System.out.println(threadName + "- 잔액이 부족합니다.");
		}
	}
	
	@Override
	public void run() {
		//해당 키워드가 명시되어 있는 영역이 마무리 될때까지 다른 스레드에서 접근하지 못하게된다
		synchronized (SynchronizedEx.class) {
			for(int i =0; i<10; i++) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				//if(getMoney() <= 0) break;
				outMoney(1000);
				
			}
		}
		
	}
}

public class Ex4_Thread {
	public static void main(String[] args) {
		SynchronizedEx atm = new SynchronizedEx();
		Thread mom = new Thread(atm, "엄마");
		Thread son = new Thread(atm, "아들");
		son.setPriority(10);
		
		mom.start();
		son.start();
	}

}
