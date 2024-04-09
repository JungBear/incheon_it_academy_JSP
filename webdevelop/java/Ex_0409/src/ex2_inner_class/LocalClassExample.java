package ex2_inner_class;

public class LocalClassExample {
	private int speed = 10;
	
	public void getCar(String carName) {
		class Car{
			public void move() {
				System.out.println(carName + "이 " + speed + "속도로 달립니다.");
			}
		}
		Car car = new Car();
		car.move();
	}
	
	public static void main(String[] args) {
		LocalClassExample local = new LocalClassExample();
		local.getCar("소나타");
	}
	
	
	
}
