package collectionTask1;

public class Main1 {

	public static void main(String[] args) {
		Store store = new Store();
		
		Car car1 = new Car("아이오닉6", 1_000_000_000,"현대");
		Car car2 = new Car("k-5", 30_000_000,"기아");
		Car car3 = new Car("QM-3", 20_000_000,"삼성");
		Car car4 = new Car("아이오닉5", 100_000_000,"현대");
		
		//2
		store.add(car1);
		store.add(car2);
		store.add(car3);
		store.add(car4);
		
		//3
		System.out.println(store.returnBrand("아이오닉6"));
		
		//4
		System.out.println(store.returnCarList("현대"));
		
		//5
		System.out.println("인상 전 k-5의 가격 : " + car2.getPrice() + "원");
		store.increasePrice("k-5");
		System.out.println("인상 후 k-5의 가격 : " + car2.getPrice() + "원");
		
				

	}

}
