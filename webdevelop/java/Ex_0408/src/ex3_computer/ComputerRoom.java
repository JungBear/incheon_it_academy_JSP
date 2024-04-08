package ex3_computer;

public class ComputerRoom {
	
	Computer com1;
	Computer com2;
	
	public void allPowerOn() {
		com1.powerOn();
		com2.powerOn();
	}
	
	public void allPowerOff() {
		com1.powerOff();
		com2.powerOff();
	}
	

}
