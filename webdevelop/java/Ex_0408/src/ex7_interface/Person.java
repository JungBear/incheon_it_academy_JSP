package ex7_interface;

public class Person {
	
	Phone p;
	
	public Person(Phone p) {
		this.p = p;
	}
	
	public void turnOnPhone () {
		p.powerOn();
	}
	
	public void watchUtube() {
		p.watchUtube();
	}
	
	public void chargePhone() {
		p.charge();
	}
	
	public void buyNewPhone(Phone p) {
		this.p = p;
		System.out.println("======");
		
	}
	
	
}
