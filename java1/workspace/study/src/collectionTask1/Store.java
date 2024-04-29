package collectionTask1;

import java.util.ArrayList;

public class Store {
/*
 * 1. 자동차 정보를 담을 ArrayList만들기
 * 2. 자동차 추가
 * 3. 자동차의 브랜드를 리턴해주는 메소드 만들기
 * 4. 사용자가 원하는 브랜드의 차량 목록 조회
 * 5. 자동차의 가격 20% 인상
 */
	// 1.
	public static ArrayList<Car> cars = new ArrayList<Car>();
	
	// 2.
	public void add(Car car) {
		cars.add(car);
	}
	
	// 3.
	public String returnBrand(String name) {
		for (Car car : cars) {
			if(car.getName().equals(name)) {
				return car.getBrand();
			}
		}
		
		return "찾지 못함";
	}
	
	// 4.
	public ArrayList<Car> returnCarList(String brand){
		ArrayList<Car> carList = new ArrayList<Car>();
//		System.out.println("brand : " + brand);
		for (Car car : cars) {
			if(car.getBrand().equals(brand)) {
//				System.out.println("찾아라 : " + car.getName());
				carList.add(car);
			}
		}
		
		return carList;
	}
	
	// 5.
	public void increasePrice(String name) {
		for (Car car : cars) {
			if(car.getName().equals(name)) {
				car.setPrice((int)(car.getPrice() * 1.2));
				break;
			}
		}
	}
	

}
