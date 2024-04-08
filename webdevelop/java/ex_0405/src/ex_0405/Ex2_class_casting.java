package ex_0405;

class Cars{}
class Bus extends Cars{}
class SchoolBus extends Bus{}

class OpenCar extends Cars{int a = 1;}
class SportsCar extends OpenCar{int b = 2;}


public class Ex2_class_casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cars c1 = new SchoolBus();
		Bus b1 = new Bus();
		Bus b2 = new SchoolBus();
		
		Cars c2 = new OpenCar();
		OpenCar oc = new SportsCar();
		
		
		
		
		
	}

}
