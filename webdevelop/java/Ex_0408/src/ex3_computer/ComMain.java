package ex3_computer;

public class ComMain {

	public static void main(String[] args) {
		ComputerRoom cr = new ComputerRoom();
		
		cr.com1 = new Mac();
		cr.com2 = new LG();
		
		cr.allPowerOn();
		cr.allPowerOff();
		

	}

}
