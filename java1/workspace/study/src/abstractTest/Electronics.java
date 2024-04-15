package abstractTest;

public abstract class Electronics {
	
	public abstract void turnOn();
	public abstract void turnOff();
	
	public void printData() {
		System.out.println("부모클래스");
	}
}
