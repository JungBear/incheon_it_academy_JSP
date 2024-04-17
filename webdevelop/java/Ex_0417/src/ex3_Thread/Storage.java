package ex3_Thread;



public class Storage {
	private int stackCount = 10;
	
	// 물건을 쌓는 메서드
	public synchronized void addStack(int stackCount) {
		this.stackCount += stackCount;
		if(this.stackCount >= 10) {
			System.out.println("=== 스레드 깨우기===");
			notify();
		}
	}
	// 물건을 나르는 메서드
	public synchronized void popStack(int leaveCount) {
		try {
			if(leaveCount > this.stackCount) this.stackCount = 0;
			else this.stackCount -= leaveCount;
			
			if(this.stackCount == 0) {
				System.out.println("== 짐 없음 대기 ==");
				wait();
				System.out.println("=== 짐 없음 대기완료 ===");
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	public int getStackCount() {
		return stackCount;
	}
}
