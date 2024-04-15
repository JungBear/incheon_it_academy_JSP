package abstractTest;

public class Refrigerator extends Electronics{
	
	@Override
	public void turnOn() {
		System.out.println("문을 열고 On버튼 누르기");
	}
	
	@Override
	public void turnOff() {
		System.out.println("문을 열고 Off버튼 누르기");
	}
}
