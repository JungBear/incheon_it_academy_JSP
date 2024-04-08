package ex5_farm;

abstract class Animal{
	// 추상메서드
	public abstract void cry();
};

class Pig extends Animal{
	@Override
	public void cry() {
		System.out.println("꿀꿀");
	}
};
class Cow extends Animal{
	@Override
	public void cry() {
		System.out.println("음메");
	}
};

class Farm{
	public void sound(Animal animal) {
		animal.cry();
	}
	
}

public class FarmTest {
	public static void main(String[] args) {
		
		Farm f = new Farm();
		Pig p = new Pig();
		Cow c = new Cow();
		
		
		f.sound(c);
		f.sound(p);
	}
	
}
