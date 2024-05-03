package hashSetTest;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
	public static void main(String[] args) {
		HashSet<String> animalSet = new HashSet<String>();
		
		animalSet.add("원숭이");
		animalSet.add("개");
		animalSet.add("고양이");
		animalSet.add("호랑이");
		
		System.out.println(animalSet.add("까치"));
		System.out.println(animalSet.add("개"));
		
		
		// hashSet은 값을 가져올 수 없지만, 다른 자료구조로 변환하여 값을 가져온다.
		System.out.println(animalSet);
		
		Iterator<String> aniIterator = animalSet.iterator();
		System.out.println(aniIterator.hasNext());
		
		while (aniIterator.hasNext()) {
			System.out.println(aniIterator.next());	
		}
		
	}
}
