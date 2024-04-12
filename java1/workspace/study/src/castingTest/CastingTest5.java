package castingTest;

class Car{
	void enginStart() {
		System.out.println("열쇠로 시동 킴");
	}
}

class SuperCar extends Car{
	@Override
	void enginStart() {
		System.out.println("음성으로 시동 킴");
	}
	
	void openRoof() {
		System.out.println("지붕 열기");
	}
}

public class CastingTest5 {

	public static void main(String[] args) {
		
		Car car = new Car();
		SuperCar supercar = new SuperCar();

		Car car2 = new SuperCar();
		car2.enginStart();

		SuperCar supercar2 = (SuperCar)car2;
		supercar2.enginStart();
		
		System.out.println(car instanceof Car);
		System.out.println(car instanceof SuperCar);
		System.out.println(supercar instanceof SuperCar);
		System.out.println(car2 instanceof SuperCar);
		System.out.println(supercar2 instanceof SuperCar);
		
		
	}

}
