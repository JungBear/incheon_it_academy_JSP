package ex1_map;

import java.util.HashMap;

public class Ex1_HashMap {

	public static void main(String[] args) {
		
		HashMap<Integer, Character> hm = new HashMap<Integer, Character>();
		hm.put(1, 'A');
		hm.put(2, 'B');
		hm.put(3, 'C');
		System.out.println(hm);
		
		hm.put(4, 'A');
		System.out.println(hm);
		
		hm.put(2, 'D');
		System.out.println(hm);
		
		hm.remove(3);
		System.out.println(hm);
		
		System.out.println(hm.size());
		
		System.out.println(hm.get(2));
	}

}
