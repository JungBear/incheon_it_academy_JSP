package ex7_interface;

public class SamungPhone implements Phone{

	int batteryCapacity = 40;
	boolean isOn = false;
	
	@Override
	public void powerOn() {
		if(batteryCapacity > 30) {
			System.out.println("@@@Power On!!!@@@");
			isOn = true;
		}else {
			System.out.println("Low Battery...");
		}
	}
	
	@Override
	public void powerOff() {
		System.out.println("@@@Power off@@\n");
		isOn = false;
	}
	
	@Override
	public boolean isOn() {
		return isOn;
	}
	
	@Override
	public void watchUtube() {
		if(batteryCapacity > 10) {
			System.out.println("--- watching Utube ---");
			batteryCapacity -= 10;
			System.out.println("battery is " + batteryCapacity + "%\n");
		}else {
			System.out.println("Low battery...");
			powerOff();
		}
		
	}
	
	@Override
	public void charge() {
		if(batteryCapacity < Phone.Max_BATTERY_CAPACITY - 20) {
			System.out.println("--- charging ---");
			batteryCapacity += 5;
			System.out.println("Charged..." + batteryCapacity + "%\n");
		}else {
			System.out.println("You don't have to charge...");
			System.out.println("It's enough..." + batteryCapacity + "%");
		}
		
	}
	
}
