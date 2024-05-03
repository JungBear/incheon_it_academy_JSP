package hashMapTest;

import java.util.HashMap;

public class HashMapTest {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		
		map.put("A", 1);
		map.put("B", 2);
		map.put("C", 1);
		map.put("D", 4);
		
		System.out.println(map.put("E", 5));
		System.out.println(map.put("B", 200));
		System.out.println(map);

		
		System.out.println("size : " + map.size());
		System.out.println("keySet : " + map.keySet());
		System.out.println("values : " + map.values());
		System.out.println("get : " + map.get("A"));
	}

}
