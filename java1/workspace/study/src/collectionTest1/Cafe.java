package collectionTest1;

import java.util.ArrayList;

public class Cafe {
	
	public static ArrayList<Coffee> coffees = new ArrayList<Coffee>();
	
	// 커피 메뉴 추가
	public void add(Coffee coffee) {
		coffees.add(coffee);
	}
	
	// 커피메뉴 삭제(forEach)
	public void remove(String name) {
		for (Coffee coffee : coffees) {
			if(coffee.getName().equals(name)) {
				coffees.remove(coffee);
			}
		}
	}
	
	
}
