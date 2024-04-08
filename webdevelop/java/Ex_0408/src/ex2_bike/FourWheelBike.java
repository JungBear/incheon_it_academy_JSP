package ex2_bike;

public class FourWheelBike extends Bike{

	public FourWheelBike(String rideName) {
		super(rideName);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void info() {
		// TODO Auto-generated method stub
		super.info();
	}
	
	public void addWheel() {
		if (wheel == 2) {
			wheel = 4;
			System.out.println(rideName + "의 자전거에 보조바퀴를 부착하였습니다.");
		}else {
			System.out.println(rideName + "의 자전거에 이미 보조바퀴가 부착되어있습니다.");
		}
	}
	
	
}
