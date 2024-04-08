package ex_0404;

public class Phone {
	
	String brand;
	int series;
	String color = "검정색";
	
	public Phone(String brand, int series) {
		this.brand = brand;
		this.series = series;
	}
	
	public Phone(String brand, int series, String color) {
		this(brand, series);
		this.color = color;
	}
	
	public void phoneInfo() {
		System.out.println(color + " " + brand + " " + series);
	}

}
