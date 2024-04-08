package ex4_Farm;

class Animal{};

class Pig extends Animal{};
class Cow extends Animal{};

class Farm{
	public void sound(Animal animal) {
		// instansceof
		// A instanceof B : A객체가 생성될 때 B타입으로 만들었냐
		if(animal instanceof Pig) {
			System.out.println("꿀꿀");
		}else {
			System.out.println("음메");
		}
	}
	
}


public class FarmTest {
	public static void main(String[] args) {
		
		Farm f = new Farm();
		Pig p = new Pig();
		Cow c = new Cow();
		
		f.sound(p);
		f.sound(c);
	}
	
}
