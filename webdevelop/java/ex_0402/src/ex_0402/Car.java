package ex_0402;


public class Car {
	
	String name;
	int wheel = 4;
	
	
	public Car() {
		
	}
	
	public Car(String name, int wheel) {
		this.name = name;
		this.wheel = wheel;
	}
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
