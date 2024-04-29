package hashSetTest;

import java.util.HashSet;

public class HashSetTest {
	public static void main(String[] args) {
		HashSet<String> animalSet = new HashSet<String>();
		
		animalSet.add("원숭이");
		animalSet.add("개");
		animalSet.add("고양이");
		animalSet.add("호랑이");
		
		System.out.println(animalSet.add("까치"));
		System.out.println(animalSet.add("개"));
		
	}
}
