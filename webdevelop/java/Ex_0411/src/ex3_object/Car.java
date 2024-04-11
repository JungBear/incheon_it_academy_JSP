package ex3_object;

public class Car {
	
	private String carName;
	private String company;
	
	public Car(String carName, String company) {
		this.carName = carName;
		this.company = company;
	}
	
	@Override
	public String toString() {
		String str = "차량 이름 : " + this.carName + ", 제조사 : " + this.company;
		return str;
	}
	
	
	

}
