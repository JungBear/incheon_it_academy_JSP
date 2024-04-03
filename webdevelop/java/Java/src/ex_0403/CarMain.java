package ex_0403;

public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car = new Car();
		
		car.setSpeed(20);
		System.out.println(car.getSpeed());
		
		car.setSpeed(1000);
		System.out.println(car.getSpeed());
		
		
		// 멈춰있지 않으면 멈춰라
		if(!car.isStop()) {
			car.setStop(true);
		}
		System.out.println(car.getSpeed());
		

	}

}
