package collectionTask1;

public class Car {
	// 이름, 가격, 브랜드(기아, 현대, 삼성)
	private String name;
	private int price;
	private String brand;
	
	public Car() {;}
	
	public Car(String name, int price, String brand) {
		this.name = name;
		this.price = price;
		this.brand = brand;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", price=" + price + ", brand=" + brand + "]";
	}
	
	
	
	
	
}
