package ex_0402;

public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car car = new Car();
		System.out.println(car.wheel);
		
		car.wheel = 3;
		System.out.println(car.wheel);
		
		car.setName("KIA");
		System.out.println(car.getName());
		
		Car car2 = new Car("Hyundai",4);
	}

}
