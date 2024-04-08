package ex_0402;

public class Bus {

	public void take(int m) {
		while(true) {
			if(m < 1500) {
				System.out.println("교통카드를 충전하러 갑니다");
				return;
			}
			System.out.println("버스를 탑니다");
			m -= 1500;
			
		}
	}
	
}
