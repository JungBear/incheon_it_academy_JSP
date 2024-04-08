package ex2_bike;

public class BikeMain {

	public static void main(String[] args) {
		Bike b = new FourWheelBike("이순신");
		
		b.info();
		b.ride();
		
		((FourWheelBike)b).addWheel();
		
		
		FourWheelBike fwb = (FourWheelBike)b;
		fwb.addWheel();

	}

}
