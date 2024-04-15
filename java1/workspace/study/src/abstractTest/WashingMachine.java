package abstractTest;

public class WashingMachine extends Electronics{

	@Override
	public void turnOn() {
		System.out.println("밖에 있는 버튼으로 on하기");
	}
	
	@Override
	public void turnOff() {
		System.out.println("밖에 있는 버튼으로 off하기");
	}
}
