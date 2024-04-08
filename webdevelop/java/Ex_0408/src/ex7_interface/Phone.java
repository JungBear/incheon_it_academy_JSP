package ex7_interface;

public interface Phone {
	public static int Max_BATTERY_CAPACITY = 100;
	
	void powerOn();
	void powerOff();
	boolean isOn();
	void watchUtube();
	void charge();
}
